package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Hashmap {
    /*
        Create Hashmap with arraylist<User> and iterate
    */
    public void testHashMap() {
        ArrayList<User> listA = new ArrayList<User>();
        listA.add(new User("Amy", 11, "Tampines"));
        listA.add(new User("Brenda", 12, "Pasir Ris"));
        listA.add(new User("Charlie", 13, "Bedok"));

        ArrayList<User> listB = new ArrayList<User>();
        listB.add(new User("Denise", 21, "Clementi"));
        listB.add(new User("Elena", 22, "Jurong"));
        listB.add(new User("Fiona", 23, "Bukit Panjang"));

        ArrayList<User> listC = new ArrayList<User>();
        listC.add(new User("Groot", 31, "Woodlands"));
        listC.add(new User("Helen", 32, "Admiralty"));
        listC.add(new User("Iris", 33, "Yishun"));

        HashMap<String, ArrayList<User>> hashMap = new HashMap<String, ArrayList<User>>();
        hashMap.put("listA", listA);
        hashMap.put("listB", listB);
        hashMap.put("listC", listC);

        hashMap.forEach((list, users) -> {
            System.out.printf("Users in %s: %n", list);
            users.forEach(System.out :: println);
        });
    }
}
