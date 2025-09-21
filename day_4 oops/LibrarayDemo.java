package oops7;
import java.util.ArrayList;
import java.util.Scanner;
class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void displayBooks() {
        System.out.println("\nLibrary: " + name);
        for (Book b : books) {
            b.displayBook();
        }
    }
}

public class LibrarayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b1 = new Book("Java Basics", "Alice");
        Book b2 = new Book("Python Guide", "Bob");

        Library lib1 = new Library("City Library");
        lib1.addBook(b1);
        lib1.addBook(b2);

        Library lib2 = new Library("Town Library");
        lib2.addBook(b2);

        lib1.displayBooks();
        lib2.displayBooks();

        sc.close();
    }
}
