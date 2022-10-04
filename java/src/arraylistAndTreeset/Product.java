package arraylistAndTreeset;

public class Product {
    /*
        Create 1 POJO class
        Product -> name, price(double)
        Add the data to the arraylist
        Sort the list with price. (Comparator)
    */

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
