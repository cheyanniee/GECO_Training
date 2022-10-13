package spring.model;

import javax.persistence.*;

@Entity
public class User {
    @Id
    private String email;
    private String password;
    private String address;
    private int mobile;

    public User(String email, String password, int mobile, String address) {
        this.email = email;
        this.password = password;
        this.mobile = mobile;
        this.address = address;
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

    @Override
    public String toString() {
        return "User {" +
                "email: '" + this.email + "'" +
                ", password: '" + this.password + "'" +
                ", mobile: " + this.mobile +
                ", address: " + this.address  + "'" +
                '}';
    }
}