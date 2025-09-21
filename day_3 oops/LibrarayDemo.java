package oops6;
import java.util.Scanner;
class Book {
    static String libraryName = "City Library";
    final String isbn;
    String title;
    String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBook() {
        if (this instanceof Book) {
            System.out.println("\nTitle : " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN  : " + isbn);
        }
    }
}

public class LibrarayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();

        Book b = new Book(title, author, isbn);
        Book.displayLibraryName();
        b.displayBook();

        sc.close();
    }
}
