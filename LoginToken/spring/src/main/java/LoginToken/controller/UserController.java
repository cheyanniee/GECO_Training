package LoginToken.controller;

import LoginToken.request.UpdateRequest;
import LoginToken.request.UserRequest;
import LoginToken.response.GeneralResponse;
import LoginToken.services.UserService;
import LoginToken.model.UserModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("allusers")
    public ResponseEntity<?> getAllUsers() {
        ArrayList<UserModel> users = userService.getAllUsers();
        return ResponseEntity.ok(users.toArray());
    }

    @GetMapping("emails")
    public ResponseEntity<?> getAllEmails() {
        ArrayList<String> emails = userService.getAllUsersEmails();
        return ResponseEntity.ok(emails.toArray());
    }

    @PostMapping("register")
    public ResponseEntity<?> register(@RequestBody UserRequest userRequest) {
        GeneralResponse res = new GeneralResponse();

        if (userService.register(userRequest)) {
            res.setMessage("Welcome! Successfully Registered.");
            res.setUser(userService.getUserByEmail(userRequest.getEmail()));
            return ResponseEntity.ok(res);
        } else {
            res.setMessage("Registration Failed.");
            return ResponseEntity.badRequest().body(res);
        }
    }

    @PostMapping("login")
    public ResponseEntity<?> login(@RequestBody UserRequest userRequest) {
        GeneralResponse res = new GeneralResponse();

        if (userService.login(userRequest)) {
            res.setMessage("Welcome Back! Login Successful.");
            res.setUser(userService.getUserByEmail(userRequest.getEmail()));
            return ResponseEntity.ok(res);
        } else {
            res.setMessage("Login Failed.");
            return ResponseEntity.badRequest().body(res);
        }
    }

    @PostMapping("logout")
    public ResponseEntity<?> logout(@RequestBody UserRequest userRequest) {
        GeneralResponse res = new GeneralResponse();

        if (userService.logout(userRequest)) {
            res.setMessage("Goodbye! Logout Successful.");
            res.setUser(userService.getUserByEmail(userRequest.getEmail()));
            return ResponseEntity.ok(res);
        } else {
            res.setMessage("Logout Failed.");
            return ResponseEntity.badRequest().body(res);
        }
    }

    @PostMapping("update")
    public ResponseEntity<?> update(@RequestBody UpdateRequest updateRequest) {
        GeneralResponse res = new GeneralResponse();

        if (userService.updateUser(updateRequest)) {
            res.setMessage("Update Successful.");
            res.setUser(userService.getUserByEmail(updateRequest.getEmail()));
            return ResponseEntity.ok(res);
        } else {
            res.setMessage("");
            return ResponseEntity.badRequest().body(res);
        }
    }

    @PostMapping("delete")
    public ResponseEntity<?> delete(@RequestBody UserRequest userRequest) {
        GeneralResponse res = new GeneralResponse();

        if (userService.deleteUser(userRequest)) {
            res.setMessage("Successfully Deleted.");
            res.setUser(userService.getUserByEmail(userRequest.getEmail()));
            return ResponseEntity.ok(res);
        } else {
            res.setMessage("Failed to Delete.");
            return ResponseEntity.badRequest().body(res);
        }
    }
}