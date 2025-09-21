package oops4;
import java.util.Scanner;
class Book {
    String title;
    String author;
    double price;
    boolean available;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }
    public void displayBook() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : ₹" + price);
        System.out.println("Available  : " + (available ? "Yes" : "No"));
    }
}
public class LibraryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        Book book = new Book(title, author, price);
        book.displayBook();
        System.out.print("\nDo you want to borrow this book? (yes/no): ");
        sc.nextLine();
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            book.borrowBook();
        }
        book.displayBook();
        sc.close();
    }
}
