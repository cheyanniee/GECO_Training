package LoginToken.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class UserRequest {
    String email = null;
    String password = null;
    String mobile = null;
    String address = null;
    String image = null;

    String token = null;
}
