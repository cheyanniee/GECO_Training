package introSQL.controller;

import introSQL.request.UpdateRequest;
import introSQL.request.UserRequest;
import introSQL.response.GeneralResponse;
import introSQL.services.UserService;
import introSQL.model.UserModel;

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
        GeneralResponse queryRes = userService.register(userRequest);

        if (queryRes.getUser() == null) {
            GeneralResponse res = new GeneralResponse();
            return ResponseEntity.badRequest().body(res);
        } else {
            return ResponseEntity.ok(queryRes.getUser());
        }
    }

    @PostMapping("login")
    public ResponseEntity<?> login(@RequestBody UserRequest userRequest) {
        GeneralResponse queryRes = userService.verifyEmailAndPassword(userRequest);

        if (queryRes.getUser() == null) {
            GeneralResponse res = new GeneralResponse();
            return ResponseEntity.badRequest().body(res);
        } else {
            return ResponseEntity.ok(queryRes.getUser());
        }
    }

    @PostMapping("update")
    public ResponseEntity<?> update(@RequestBody UpdateRequest updateRequest) {
        GeneralResponse queryRes = userService.updateUser(updateRequest);

        if (queryRes.getUser() == null) {
            GeneralResponse res = new GeneralResponse();
            return ResponseEntity.badRequest().body(res);
        } else {
            return ResponseEntity.ok(queryRes.getUser());
        }
    }

    @PostMapping("delete")
    public ResponseEntity<?> delete(@RequestBody UserRequest userRequest) {
        GeneralResponse queryRes = userService.deleteUser(userRequest);

        if (queryRes.getUser() == null) {
            GeneralResponse res = new GeneralResponse();
            return ResponseEntity.badRequest().body(res);
        } else {
            return ResponseEntity.ok(queryRes.getUser());
        }
    }
}