package spring.repository;

import org.springframework.stereotype.Repository;
import spring.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
//    @Query("select user from User user where email = ?1 and password=?2")
//    Optional<User> getUserByEmailAndPassword(String email, String password);
//
//    @Query("select user from User user where email = ?1")
//    Optional<User> getUserByEmail(String email);
//
//    @Query("select user from User user ")
//    List<User> getAllUser();

    @Query()
    List<User> getUserByEmailAndPassword(String email, String password);
}
