package oops5;
import java.util.Scanner;
class Product {
    String productName;
    double price;
    static int totalProducts = 0;
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    public void displayProductDetails() {
        System.out.println("\nProduct Name: " + productName);
        System.out.println("Price       : ₹" + price);
    }
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}
public class ProductDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        Product[] products = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter Product Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            products[i] = new Product(name, price);
        }
        for (Product p : products) {
            p.displayProductDetails();
        }
        Product.displayTotalProducts();
        sc.close();
    }
}
