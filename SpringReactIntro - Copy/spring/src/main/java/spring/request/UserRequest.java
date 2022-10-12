package spring.request;

public class UserRequest {
    private String email;
    private String password;
    private String address;
    private int mobile;

    public UserRequest(String email, String password, int mobile, String address) {
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.address = address;
    }

    public UserRequest(String email, String password) {
        this.email = email;
        this.password = password;
        this.mobile = -1;
        this.address = "";
    }

    public UserRequest(String email) {
        this.email = email;
        this.password = "";
        this.mobile = -1;
        this.address = "";
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}