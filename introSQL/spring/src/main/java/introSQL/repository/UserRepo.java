package introSQL.repository;

import introSQL.model.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<UserModel,Integer> {
    @Query("select userModel from UserModel userModel where email = ?1 and password = ?2")
    Optional<UserModel> getUserByEmailAndPassword(String email, String password);

    @Query("select userModel from UserModel userModel where email = ?1")
    Optional<UserModel> getUserByEmail(String email);
}
