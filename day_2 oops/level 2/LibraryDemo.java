package oops5;
import java.util.Scanner;
class Book {
    public String ISBN;
    protected String title;
    private String author;
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void displayBook() {
        System.out.println("\nISBN  : " + ISBN);
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
    }
}
class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }
    public void displayProtectedTitle() {
        System.out.println("Accessing Protected Title: " + title);
    }
}
public class LibraryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Enter Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author: ");
        String author = sc.nextLine();
        Book b = new Book(isbn, title, author);
        b.displayBook();
        System.out.print("\nEnter new Author to update: ");
        String newAuthor = sc.nextLine();
        b.setAuthor(newAuthor);
        b.displayBook();
        EBook eb = new EBook(isbn, title, author);
        eb.displayProtectedTitle();
        sc.close();
    }
}
