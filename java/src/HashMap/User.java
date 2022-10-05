package HashMap;

public class User implements Comparable<User> {
    /*
        Create User Class with:
        Age, name, address
    */

    private String name;
    private int age;
    private String address;

    public User(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
        return this.name + ", " + this.age + ", " + this.address;
    }
}
