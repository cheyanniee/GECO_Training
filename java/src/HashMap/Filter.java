package HashMap;
import java.util.ArrayList;

public class Filter {
    /*
        Create array list with user
        a) filter user whose age is below 20
        b) filter the user whose name starts with 'a' and  return the firstUser.
     */

    public void testFilter() {
        ArrayList<User> userList = new ArrayList<User>();

        userList.add(new User("Amy", 11, "Tampines"));
        userList.add(new User("Brenda", 12, "Pasir Ris"));
        userList.add(new User("Charlie", 13, "Bedok"));
        userList.add(new User("Denise", 21, "Clementi"));
        userList.add(new User("Elena", 22, "Jurong"));
        userList.add(new User("Fiona", 23, "Bukit Panjang"));
        userList.add(new User("Groot", 31, "Woodlands"));
        userList.add(new User("Helen", 32, "Admiralty"));
        userList.add(new User("Iris", 33, "Yishun"));

        System.out.printf("Initial User List: %n");
        for (User person : userList) {
            System.out.printf("[%s, %d] ", person.getName(), person.getAge());
        }

        System.out.printf("%nFiltered User List: ( above 20 ) %n");
        userList.stream().filter(user -> user.getAge() < 20).forEach(System.out::println);

        System.out.printf("First User Starting with A: %n");
        for (User user : userList) {
            if (user.getName().toLowerCase().startsWith("a")) {
                System.out.printf(user.toString());
                break;
            }
        }
    }
}
