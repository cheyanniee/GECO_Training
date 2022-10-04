package arraylistAndTreeset;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        testingFunctions test = new testingFunctions();

        ArrayList<Product> initialProducts = test.createProductList();
        test.displayProducts(initialProducts);
        ArrayList<Product> sortedProducts = test.sortProductsByPrice(initialProducts);
        test.displayProducts(sortedProducts);

        TreeSet<User> initialUsers = test.createUserList();
        test.displayUsers(initialUsers);
    }
}
