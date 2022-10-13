package LoginToken.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "users")
public class UserModel {
    @Id
    String email;
    String password;
    String mobile;
    String address;
    String token = null;


    public UserModel(String email, String password, String mobile, String address) {
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.address = address;
    }
}
