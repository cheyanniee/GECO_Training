package spring.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class UserRequest {
    private String email;
    private String password;
    private String address;
    private int mobile;


}