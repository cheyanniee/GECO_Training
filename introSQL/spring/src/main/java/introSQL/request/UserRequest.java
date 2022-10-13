package introSQL.request;

import introSQL.repository.UserRepo;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class UserRequest {
    String email;
    String password;
    String mobile = "";
    String address = "";
}
