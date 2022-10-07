package FileWriting;

public class User implements Comparable<User> {
    /*
        Create User Class with:
        Name, address
    */

    private String name;
    private String address;

    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int compareTo(User u) {
        return this.getName().compareTo(u.getName());
    }

    public String toString() {
        return this.name + ", " + this.address;
    }
}
