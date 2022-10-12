package spring.request;

public class UpdateRequest {
    private String targetemail;
    private String email;
    private String password;
    private String address;
    private int mobile;

    public UpdateRequest(String targetemail, String email, String password, int mobile, String address) {
        this.targetemail = targetemail;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.address = address;
    }

    public String getTargetemail() {
        return targetemail;
    }

    public void setTargetemail(String targetemail) {
        this.targetemail = targetemail;
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