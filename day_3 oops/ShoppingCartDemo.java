package oops6;
import java.util.Scanner;
class Product {
    static double discount = 10.0;
    final int productID;
    String productName;
    double price;
    int quantity;

    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double d) {
        discount = d;
    }

    public void displayProduct() {
        if (this instanceof Product) {
            System.out.println("\nProduct ID: " + productID);
            System.out.println("Name      : " + productName);
            System.out.println("Price     : ₹" + price);
            System.out.println("Quantity  : " + quantity);
            System.out.println("Discount  : " + discount + "%");
        }
    }
}

public class ShoppingCartDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        Product p = new Product(name, price, qty, id);
        p.displayProduct();
        Product.updateDiscount(15.0);
        p.displayProduct();

        sc.close();
    }
}
