package oops4;
import java.util.Scanner;
class Book {
    String title;
    String author;
    double price;
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayBook() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : ₹" + price);
    }
}
public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book defaultBook = new Book();
        defaultBook.displayBook();
        System.out.print("\nEnter Book Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        Book userBook = new Book(title, author, price);
        userBook.displayBook();
        sc.close();
    }
}
