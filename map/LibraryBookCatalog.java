package map;
import java.util.*;
public class LibraryBookCatalog {
    public static void main(String[] args) {
        TreeMap<String,String> books = new TreeMap<>();

        books.put("978-1111111111","Java Basics");
        books.put("978-2222222222","Python Guide");

        String isbn = "978-1111111111";
        System.out.println(books.getOrDefault(isbn,"Book not found"));

        books.remove("978-2222222222");

        for(String k : books.keySet()){
            System.out.println(k + " : " + books.get(k));
        }

        String title = "Java Basics";
        for(String k : books.keySet()){
            if(books.get(k).equals(title))
                System.out.println("Found at: " + k);
        }
    }
}
