package introSQL.services;

import introSQL.model.UserModel;
import introSQL.repository.UserRepo;

import introSQL.request.UpdateRequest;
import introSQL.request.UserRequest;
import introSQL.response.GeneralResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public GeneralResponse register(UserRequest req) {
        GeneralResponse res = new GeneralResponse();

        if (req.getEmail().equals("")) {
            res.setMessage("Email cannot be empty.");
            return res;
        } else if (userRepo.getUserByEmail(req.getEmail()).isPresent()) {
            res.setMessage("Email already registered. Try logging in.");
            return res;
        }

        if (req.getPassword().equals("")) {
            res.setMessage("Password cannot be empty.");
            return res;
        }

        if (req.getMobile().equals("")) {
            res.setMessage("Mobile cannot be empty.");
            return res;
        } else {
            try {
                Integer.parseInt(req.getMobile());
            } catch (Exception e) {
                res.setMessage("Invalid mobile. Please try again.");
                return res;
            }
        }

        if (req.getAddress().equals("")) {
            res.setMessage("Address cannot be empty.");
            return res;
        }

        UserModel user = new UserModel(req.getEmail(), req.getPassword(), req.getMobile(), req.getAddress());
        userRepo.save(user);

        res.setUser(user);
        res.setMessage("User Registered Successfully!");
        return res;
    }

    public GeneralResponse verifyEmailAndPassword(UserRequest req) {
        GeneralResponse res = new GeneralResponse();
        Optional<UserModel> test = userRepo.getUserByEmailAndPassword(req.getEmail(), req.getPassword());

        if (test.isPresent()) {
            res.setUser(test.get());
            res.setMessage("Logged in Successfully!");
        } else {
            res.setMessage("Error: Invalid Email or Password.");
        }
        return res;
    }

    public GeneralResponse updateUser(UpdateRequest req) {
        GeneralResponse res = new GeneralResponse();

        if (req.getTarget().equals("")) {
            res.setMessage("No user selected.");
        } else {
            Optional<UserModel> test = userRepo.getUserByEmail(req.getTarget());

            if (!test.isPresent()) {
                res.setMessage("User does not exist.");
            } else {
                UserModel user = test.get();

                if (!req.getEmail().equals("")) {
                    user = new UserModel(req.getEmail(), user.getPassword(), user.getMobile(), user.getAddress());
                }

                if (!req.getPassword().equals("")) {
                    user.setPassword(req.getPassword());
                }

                if (!req.getMobile().equals("")) {
                    try {
                        Integer.parseInt(req.getMobile());
                    } catch (Exception e) {
                        res.setMessage("Invalid mobile. Please try again.");
                        return res;
                    }
                    user.setMobile(req.getMobile());
                }

                if (!req.getAddress().equals("")) {
                    user.setAddress(req.getAddress());
                }

                userRepo.delete(test.get());
                userRepo.save(user);
                res.setUser(user);
                res.setMessage("User Updated Successfully!");
            }
        }

        return res;
    }

    public GeneralResponse deleteUser(UserRequest req) {
        GeneralResponse res = new GeneralResponse();

        if (req.getEmail().equals("")) {
            res.setMessage("No user selected.");
        } else {
            Optional<UserModel> test = userRepo.getUserByEmail(req.getEmail());

            if (!test.isPresent()) {
                return new GeneralResponse("User does not exist.");
            } else {
                userRepo.delete(test.get());
                res.setUser(test.get());
                res.setMessage("User Deleted Successfully!");
            }
        }

        return res;
    }
}
