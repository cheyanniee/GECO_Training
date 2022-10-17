package LoginToken.repository;

import LoginToken.model.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserModel,Integer> {
    @Query("select userModel from UserModel userModel where email = ?1 and password = ?2")
    Optional<UserModel> getUserByEmailAndPassword(String email, String password);

    @Query("select userModel from UserModel userModel where email = ?1")
    Optional<UserModel> getUserByEmail(String email);

    @Modifying
    @Transactional
    @Query("update UserModel set token = ?1 where id= ?2")
    void updateTokenForUserId(String token, Integer userId);
 }
