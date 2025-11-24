package Generics;
import java.util.ArrayList;
import java.util.List;
class Cart<T> {
    List<T> items = new ArrayList<>();

    void addItem(T item) { items.add(item); }
    void removeItem(T item) { items.remove(item); }
    void displayItems() { items.forEach(System.out::println); }
}

class Electronics {}
class Clothing {}

class GenericCart {
    public static void main(String[] args) {
        Cart<Electronics> eCart = new Cart<>();
        Cart<Clothing> cCart = new Cart<>();

        eCart.addItem(new Electronics());
        cCart.addItem(new Clothing());

        eCart.displayItems();
        cCart.displayItems();
    }
}
