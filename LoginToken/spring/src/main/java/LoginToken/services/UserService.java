package LoginToken.services;

import LoginToken.model.UserModel;
import LoginToken.repository.UserRepo;

import LoginToken.request.UpdateRequest;
import LoginToken.request.UserRequest;
import LoginToken.response.GeneralResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

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
        userRepo.save(user);
        return true;
    }

    public boolean verifyEmailAndPassword(UserRequest req) {
        Optional<UserModel> test = userRepo.getUserByEmailAndPassword(req.getEmail(), req.getPassword());
        return test.isPresent();
    }

    public boolean updateUser(UpdateRequest req) {
        if (!req.getTarget().equals("")) {
            UserModel oldUser = getUserByEmail(req.getEmail());

            if (oldUser != null) {
                UserModel newUser = oldUser;
                if (!req.getEmail().equals("")) {
                    newUser = new UserModel(req.getEmail(), newUser.getPassword(), newUser.getMobile(), newUser.getAddress());
                }

                if (!req.getPassword().equals("")) {
                    newUser.setPassword(req.getPassword());
                }

                if (!req.getMobile().equals("")) {
                    try {
                        Integer.parseInt(req.getMobile());
                    } catch (Exception e) {
                        return false;
                    }
                    newUser.setMobile(req.getMobile());
                }

                if (!req.getAddress().equals("")) {
                    newUser.setAddress(req.getAddress());
                }

                userRepo.delete(oldUser);
                userRepo.save(newUser);
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

    public boolean validateToken(UserRequest req) throws Exception{
        UserModel user = getUserByEmail(req.getEmail());
        if (user != null) {
            return user.getToken().equals(req.getToken());
        }
        return false;
    }

    private String generateToken(String email){
        String emailEncoded = Arrays.toString(Base64.getEncoder().encode(email.getBytes()));
        return emailEncoded+System.currentTimeMillis();
    }

    private boolean updateToken(UserRequest req){
        UserModel user = getUserByEmail(req.getEmail());
        if (user != null) {
            user.setToken(req.getToken());
            userRepo.save(user);
            return true;
        }
        return false;
    }

    public boolean login(UserRequest req) {
        req.setToken(generateToken(req.getEmail()));
        return (verifyEmailAndPassword(req) && updateToken(req));
    }

    public boolean logout(UserRequest req) {
        req.setToken(null);
        return updateToken(req);
    }
}
