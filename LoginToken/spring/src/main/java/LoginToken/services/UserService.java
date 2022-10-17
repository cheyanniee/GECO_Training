package LoginToken.services;

import LoginToken.model.UserModel;
import LoginToken.repository.UserRepo;
import LoginToken.request.UpdateRequest;
import LoginToken.request.UserRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.core.env.Environment;
import org.springframework.web.multipart.MultipartFile;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.io.FileOutputStream;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    @Autowired
    Environment environment;

    String curDir = Paths.get("").toAbsolutePath().toString() + "/Images";

    public ArrayList<UserModel> getAllUsers() {
        return (ArrayList<UserModel>) userRepo.findAll();
    }

    public ArrayList<String> getAllUsersEmails() {
        ArrayList<UserModel> users = (ArrayList<UserModel>) userRepo.findAll();
        ArrayList<String> emails = new ArrayList<>();

        for (UserModel user : users) {
            emails.add(user.getEmail());
        }

        return emails;
    }

    public UserModel getUserByEmail(String email) {
        if (!email.equals("")) {
            Optional<UserModel> test = userRepo.getUserByEmail(email);

            if (test.isPresent()) {
                return test.get();
            }
        }

        return null;
    }

    public boolean register(UserRequest req) {
        if (req.getEmail().equals("")) {
            return false;
        } else if (userRepo.getUserByEmail(req.getEmail()).isPresent()) {
            return false;
        }

        if (req.getPassword().equals("")) {
            return false;
        }

        if (req.getMobile().equals("")) {
            return false;
        } else {
            try {
                Integer.parseInt(req.getMobile());
            } catch (Exception e) {
                return false;
            }
        }

        if (req.getAddress().equals("")) {
            return false;
        }

        UserModel user = new UserModel(req.getEmail(), req.getPassword(), req.getMobile(), req.getAddress());

        if (!req.getImage().equals("")) {
            user.setImage(req.getImage());
        }

        userRepo.save(user);
        return true;
    }

    public boolean verifyEmailAndPassword(UserRequest req) {
        Optional<UserModel> test = userRepo.getUserByEmailAndPassword(req.getEmail(), req.getPassword());
        return test.isPresent();
    }

    public boolean updateUser(UpdateRequest req) {
        if (!req.getTarget().equals("")) {
            UserModel user = getUserByEmail(req.getEmail());

            if (user != null) {
                if (!req.getEmail().equals("")) {
                    user.setEmail(req.getEmail());
                }

                if (!req.getPassword().equals("")) {
                    user.setPassword(req.getPassword());
                }

                if (!req.getMobile().equals("")) {
                    try {
                        Integer.parseInt(req.getMobile());
                    } catch (Exception e) {
                        return false;
                    }
                    user.setMobile(req.getMobile());
                }

                if (!req.getAddress().equals("")) {
                    user.setAddress(req.getAddress());
                }

                if (!req.getImage().equals("")) {
                    user.setImage(req.getImage());
                }

                userRepo.save(user);
                return true;
            }
        }

        return false;
    }

    public boolean deleteUser(UserRequest req) {
        if (!req.getEmail().equals("")) {
            UserModel user = getUserByEmail(req.getEmail());

            if (user != null) {
                userRepo.delete(user);
                return true;
            }
        }

        return false;
    }

    public boolean validateToken(String token) throws Exception {
        Jwts.parser().setSigningKey(environment.getProperty("JWT_SECRET")).parseClaimsJws(token);
        return true;
    }

    private String generateToken(UserRequest req){
        UserModel user = getUserByEmail(req.getEmail());

        if (user != null) {
            Calendar expTime = Calendar.getInstance();
            expTime.add(Calendar.HOUR, 3);

            String token = Jwts.builder()
                    .claim("email", user.getEmail())
                    .setId("" + user.getUserid())
                    .setIssuedAt(new Date())
                    .setExpiration(expTime.getTime())
                    .signWith(SignatureAlgorithm.HS512, environment.getProperty("JWT_SECRET"))
                    .compact();

            return token;
        }

        return null;
    }

    private boolean updateToken(UserRequest req){
        UserModel user = getUserByEmail(req.getEmail());
        if (user != null && req.getToken() != null) {
            userRepo.updateTokenForUserId(req.getToken(), user.getUserid());

            UserModel userCheck = getUserByEmail(req.getEmail());

            if (userCheck != null) {

                System.out.println(userCheck.getToken());

                if (userCheck.getToken() != null) {
                    return (userCheck.getToken().equals(req.getToken()));
                } else {
                    return (req.getToken() == null);
                }
            }
            return false;
        }
        return false;
    }

    public boolean login(UserRequest req) {
        if (verifyEmailAndPassword(req)) {
            req.setToken(generateToken(req));
            return updateToken(req);
        }
        return false;
    }

    public boolean logout(UserRequest req) {
        UserModel user = getUserByEmail(req.getEmail());
        if (user != null) {
            userRepo.updateTokenForUserId(null, user.getUserid());
            return true;
        }
        return false;
    }

    public boolean updateProfilePic(UserRequest req, MultipartFile file) {
        System.out.println(file.getName());

        UserModel user = getUserByEmail(req.getEmail());
        if (user != null) {
            try {
                String savePath = curDir + user.getUserid() + ".jpg";
                System.out.println(savePath);

                FileOutputStream out = new FileOutputStream(savePath);
                out.write(file.getBytes());

                UpdateRequest updateRequest = new UpdateRequest(user.getEmail());
                updateRequest.setImage(savePath);
                if (!updateUser(updateRequest)) {
                    return false;
                }
            } catch (Exception e) {
                System.out.println(e);
                return false;
            }
        }

        return true;
    }

    public String readProfilePic(UserRequest req) {
        UserModel user = getUserByEmail(req.getEmail());
        if (user != null) {
            return user.getImage();
        }
        return null;
    }
}
