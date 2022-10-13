package introSQL.model;

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
}
