package arraylistAndTreeset;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class testingFunctions {
    public ArrayList<Product> createProductList() {
        System.out.printf("%nCreating Products ... %n");

        ArrayList<Product> productList = new ArrayList<Product>();

        productList.add(new Product("product1", 12.35));
        productList.add(new Product("product2", 34.66));
        productList.add(new Product("product3", 23.5));
        productList.add(new Product("product4", 3435.34));
        productList.add(new Product("product5", 2352.22));

        return productList;
    }

    public ArrayList<Product> sortProductsByPrice(ArrayList<Product> productList) {
        System.out.printf("%nSorting Products ... %n");

        Comparator<Product> priceComparator = Comparator.comparingDouble(Product::getPrice);
        productList.sort(priceComparator);

        return productList;
    }

    public void displayProducts(ArrayList<Product> productList) {
        if (productList.size() > 0) {
            for (Product each : productList) {
                System.out.printf("[%s, %f] ", each.getName(), each.getPrice());
            }
        } else {
            System.out.printf("The arraylist is empty %n");
        }
    }

    public TreeSet<User> createUserList() {
        System.out.printf("%nCreating Users ... %n");

        TreeSet<User> userList = new TreeSet<User>();

        userList.add(new User("user4", 1));
        userList.add(new User("user1", 2));
        userList.add(new User("user5", 3));
        userList.add(new User("user3", 4));
        userList.add(new User("user2", 5));

        return userList;
    }

    public void displayUsers(TreeSet<User> userList) {
        if (userList.size() > 0) {
            for (User person : userList) {
                System.out.printf("[%s, %d] ", person.getName(), person.getAge());
            }
        } else {
            System.out.printf("The arraylist is empty %n");
        }
    }
}
