package FileWriting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();

        userList.add(new User("Amy", "Tampines"));
        userList.add(new User("Brenda", "Pasir Ris"));
        userList.add(new User("Charlie", "Bedok"));
        userList.add(new User("Denise", "Clementi"));
        userList.add(new User("Elena", "Jurong"));
        userList.add(new User("Fiona", "Bukit Panjang"));
        userList.add(new User("Groot", "Woodlands"));
        userList.add(new User("Helen", "Admiralty"));
        userList.add(new User("Iris", "Yishun"));

        String path = "java/src/FileWriting/userList.txt";
        try {
            File file = new File(path);
            if (file.createNewFile()){
                System.out.printf("New file created: %s %n", file.getName());
            }

            FileWriter fileWriter = new FileWriter(path);

            for (User user : userList) {
                try {
                    fileWriter.write(user.toString());
                    fileWriter.write("\n");

                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    System.out.printf("%s was not added to file.", user.getName());
                }
            }

            fileWriter.flush();
            fileWriter.close();

            System.out.printf("File has been saved %n");
        } catch (IOException e) {
            System.out.printf("Error finding/creating file %s %n", path);
            e.printStackTrace();
        }
    }
}
