package introSQL.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class UpdateRequest {
    String target = "";
    String email = "";
    String password = "";
    String mobile = "";
    String address = "";

    public UpdateRequest(String target) {
        this.target = target;
    }
}
