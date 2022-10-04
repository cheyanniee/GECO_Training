package arraylistAndTreeset;

public class User implements Comparable<User> {
    /*
        TreeSet -> User class (name, age).
        Sort with name.
    */

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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

    public int compareTo(User u) {
        return this.getName().compareTo(u.getName());
    }
}
