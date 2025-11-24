package lambda;
import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " | ₹" + price + " | Rating: " + rating + " | Off: " + discount + "%";
    }
}

public class EcommerceSorting {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Shoes", 1500, 4.5, 20),
            new Product("Watch", 3000, 4.7, 10),
            new Product("Bag", 800, 4.2, 30)
        );

        // Sort by Price
        products.sort((a, b) -> Double.compare(a.price, b.price));
        System.out.println("Sort by Price:");
        products.forEach(System.out::println);

        // Sort by Rating
        products.sort((a, b) -> Double.compare(b.rating, a.rating));
        System.out.println("\nSort by Rating:");
        products.forEach(System.out::println);

        // Sort by Discount
        products.sort((a, b) -> Double.compare(b.discount, a.discount));
        System.out.println("\nSort by Discount:");
        products.forEach(System.out::println);
    }
}
