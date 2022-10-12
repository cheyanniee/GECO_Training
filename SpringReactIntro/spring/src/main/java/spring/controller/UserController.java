package spring.controller;

import spring.request.*;
import spring.response.*;
import spring.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;

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
                    response.setMessage("Login Successful. Welcome Back!");
                    return ResponseEntity.ok(response);
                }
            }
        }

        response.setMessage("Invalid Email or Password. Please Try Again.");
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

        // email, password
        userlist.add(new User("amy@email.com", "amypassword123"));
        userlist.add(new User("brenda@email.com", "brendapassword123"));
        userlist.add(new User("charlie@email.com", "charliepassword123"));
        userlist.add(new User("denise@email.com", "denisepassword123"));
        userlist.add(new User("elena@email.com", "elenapassword123"));
        userlist.add(new User("fiona@email.com", "fionapassword123"));
        userlist.add(new User("groot@email.com", "grootpassword123"));
        userlist.add(new User("helen@email.com", "helenpassword123"));
        userlist.add(new User("iris@email.com", "irispassword123"));

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