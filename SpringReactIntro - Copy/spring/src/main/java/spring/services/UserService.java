package spring.services;

import spring.repository.UserRepo;
import spring.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public User validateUserLogin(String email, String password) {
        List<User> user =  userRepo.getUserByEmailAndPassword(email,password);
        return user.get(0);
    }
}
