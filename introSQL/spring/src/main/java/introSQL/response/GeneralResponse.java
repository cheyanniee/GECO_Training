package introSQL.response;

import introSQL.model.UserModel;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class GeneralResponse {
    String message = "";
    UserModel user = null;

    public GeneralResponse(String message){
        this.message = message;
    }

    public GeneralResponse(UserModel user){
        this.user = user;
    }
}