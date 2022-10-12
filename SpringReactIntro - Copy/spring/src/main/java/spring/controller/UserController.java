package spring.controller;

import spring.request.*;
import spring.response.*;
import spring.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

@RestController
public class UserController {
    @PostMapping("login")
    public ResponseEntity<?> login(@RequestBody UserRequest userRequest) {
        GeneralResponse response = new GeneralResponse();
        ArrayList<User> userlist = getUserList();

        if (userlist != null) {
            for (User user : userlist) {
                if (userRequest.getEmail().equalsIgnoreCase(user.getEmail()) &&
                        userRequest.getPassword().equals(user.getPassword())) {
                    response.setMessage("Email: " + user.getEmail() + "\nPassword: " + user.getPassword()
                            + "\nMobile: " + user.getMobile() + "\nAddress: " + user.getAddress());
                    return ResponseEntity.ok(response);
                }
            }
        }

        response.setMessage("Invalid Email or Password. Please Try Again.");
        return ResponseEntity.badRequest().body(response);
    }

    @PostMapping("register")
    public ResponseEntity<?> register(@RequestBody UserRequest userRequest) {
        GeneralResponse response = new GeneralResponse();
        ArrayList<User> userlist = getUserList();

        if (userlist != null) {
            for (User user : userlist) {
                if (userRequest.getEmail().equalsIgnoreCase(user.getEmail())) {
                    response.setMessage("Email already exists!");
                    return ResponseEntity.badRequest().body(response);
                }
            }
        }

        response.setMessage("Welcome! You have been registered!");
        return ResponseEntity.ok(response);
    }

    @PostMapping("update")
    public ResponseEntity<?> update(@RequestBody UpdateRequest updateRequest) {
        GeneralResponse response = new GeneralResponse();
        ArrayList<User> userlist = getUserList();

        if (userlist != null) {
            for (User user : userlist) {
                if (updateRequest.getTargetemail().equalsIgnoreCase(user.getEmail())) {
                    if (!Objects.equals(updateRequest.getEmail(), "")) {
                        user.setEmail(updateRequest.getEmail());
                    }

                    if (!Objects.equals(updateRequest.getPassword(), "")) {
                        user.setPassword(updateRequest.getPassword());
                    }

                    if (updateRequest.getMobile() != -1) {
                        user.setMobile(updateRequest.getMobile());
                    }

                    if (!Objects.equals(updateRequest.getAddress(), "")) {
                        user.setAddress(updateRequest.getAddress());
                    }

                    response.setMessage("Details Updated!");
                    return ResponseEntity.ok(response);
                }
            }
        }

        response.setMessage("Email doesn't exist!");
        return ResponseEntity.badRequest().body(response);
    }

    @PostMapping("delete")
    public ResponseEntity<?> delete(@RequestBody UserRequest userRequest) {
        GeneralResponse response = new GeneralResponse();
        ArrayList<User> userlist = getUserList();

        if (userlist != null) {
            for (User user : userlist) {
                if (userRequest.getEmail().equalsIgnoreCase(user.getEmail())) {
                    userlist.remove(user);
                    response.setMessage("User Deleted");
                    return ResponseEntity.ok(response);
                }
            }
        }

        response.setMessage("Invalid User.");
        return ResponseEntity.badRequest().body(response);
    }

    @GetMapping("userlist")
    public static ArrayList<User> getUserList() {
        /*
            getUserList()
            create a arrayList with User(email,username,address)
            return the user list as the response
        */
        ArrayList<User> userlist = new ArrayList<>();

        // email, password, mobile, address
        userlist.add(new User("amy@email.com", "amypassword123", 11111111, "Tampines"));
        userlist.add(new User("brenda@email.com", "brendapassword123", 22222222, "Pasir Ris"));
        userlist.add(new User("charlie@email.com", "charliepassword123", 33333333, "Bedok"));
        userlist.add(new User("denise@email.com", "denisepassword123", 44444444, "Clementi"));
        userlist.add(new User("elena@email.com", "elenapassword123", 55555555, "Jurong"));
        userlist.add(new User("fiona@email.com", "fionapassword123", 66666666, "Bukit Panjang"));
        userlist.add(new User("groot@email.com", "grootpassword123", 77777777, "Woodlands"));
        userlist.add(new User("helen@email.com", "helenpassword123", 88888888, "Admiralty"));
        userlist.add(new User("iris@email.com", "irispassword123", 99999999, "Yishun"));

        if (userlist.size() > 0) {
            return userlist;
        } else {
            return null;
        }
    }

    @GetMapping("usermap")
    public static HashMap<Integer, User> getUserMap() {
        /*
            getUserList()
            create a arrayList with User(email,username,address)
            return the user list as the response
        */

        ArrayList<User> userlist = getUserList();
        HashMap<Integer, User> usermap = new HashMap<>();

        for (int i=0; i < userlist.size(); i++) {
            usermap.put(i+1, userlist.get(i));
        }

        if (usermap.size() > 0) {
            return usermap;
        } else {
            return null;
        }
    }

    @GetMapping("user/{user_id}")
    public ResponseEntity<?> getUser(@PathVariable Integer user_id) {
        GeneralResponse response = new GeneralResponse();
        HashMap<Integer, User> usermap = getUserMap();

        if (usermap.containsKey(user_id)) {
            response.setMessage("User exists");
            return ResponseEntity.ok(response);
        } else {
            response.setMessage("User not found");
            return ResponseEntity.badRequest().body(response);
        }
    }

    @PostMapping("validation")
    public ResponseEntity<?> checkValid(@RequestBody UserRequest userRequest) {
        GeneralResponse response = new GeneralResponse();
        ArrayList<User> userlist = getUserList();

        if (userlist != null) {
            for (User user : userlist) {
                if (userRequest.getEmail().equalsIgnoreCase(user.getEmail()) &&
                        userRequest.getPassword().equals(user.getPassword())) {
                    response.setMessage("Login Details Valid");
                    return ResponseEntity.ok(response);
                }
            }
        }

        response.setMessage("Invalid Email or Password");
        return ResponseEntity.badRequest().body(response);
    }
}