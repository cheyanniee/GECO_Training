package SpringIntro.controller;

import SpringIntro.request.*;
import SpringIntro.response.*;
import SpringIntro.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class UserController {
    @PostMapping("math")
    public ResponseEntity<?> math(@RequestBody MathRequest mathRequest) {
        /*
            Write a Spring boot api for performing below actions.
            All tasks has to be done same api.
            addition, subtraction multiplication, division
        */

        GeneralResponse response = new GeneralResponse();
        int result = 0;
        String operation = "";

        switch (mathRequest.getType()) {
            case "addition" -> {
                result = mathRequest.getA() + mathRequest.getB();
                operation = " + ";
            }
            case "subtraction" -> {
                result = mathRequest.getA() - mathRequest.getB();
                operation = " - ";
            }
            case "multiplication" -> {
                result = mathRequest.getA() * mathRequest.getB();
                operation = " * ";
            }
            case "division" -> {
                result = mathRequest.getA() / mathRequest.getB();
                operation = " / ";
            }
            default -> {
                response.setMessage("Please input a valid operation.");
                return ResponseEntity.badRequest().body(response);
            }
        }

        response.setMessage(mathRequest.getA() + operation + mathRequest.getB() + " = " + result);
        return ResponseEntity.ok(response);
    }

    @PostMapping("login")
    public ResponseEntity<?> login(@RequestBody UserRequest userRequest) {
        /*
            Write a spring boot api for login validation login()
            create a arrayList with User(email,password)
            if request's email and password exist in the arraylist send success response
            else send error response
        */
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

    @GetMapping("users")
    public static ArrayList<User> getUserList() {
        /*
            getUserList()
            create a arrayList with User(email,username,address)
            return the user list as the response
        */
        ArrayList<User> userlist = new ArrayList<>();

        // username, email, password, address
        userlist.add(new User("amy", "amy@email.com", "amypassword123", "Tampines"));
        userlist.add(new User("brenda", "brenda@email.com", "brendapassword123", "Pasir Ris"));
        userlist.add(new User("charlie", "charlie@email.com", "charliepassword123", "Bedok"));
        userlist.add(new User("denise", "denise@email.com", "denisepassword123", "Clementi"));
        userlist.add(new User("elena", "elena@email.com", "elenapassword123", "Jurong"));
        userlist.add(new User("fiona", "fiona@email.com", "fionapassword123", "Bukit Panjang"));
        userlist.add(new User("groot", "groot@email.com", "grootpassword123", "Woodlands"));
        userlist.add(new User("helen", "helen@email.com", "helenpassword123", "Admiralty"));
        userlist.add(new User("iris", "iris@email.com", "irispassword123", "Yishun"));

        if (userlist.size() > 0) {
            return userlist;
        } else {
            return null;
        }
    }
}