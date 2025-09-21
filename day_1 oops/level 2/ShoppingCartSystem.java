package oops3;
import java.util.ArrayList;
class CartItem {
    String itemName;
    double price;
    int quantity;
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public double getItemTotal() {
        return price * quantity;
    }
    public void displayItem() {
        System.out.println(itemName + " | Price: ₹" + price + " | Qty: " + quantity + " | Total: ₹" + getItemTotal());
    }
}
class ShoppingCart {
    ArrayList<CartItem> cart = new ArrayList<>();
    public void addItem(String itemName, double price, int quantity) {
        CartItem item = new CartItem(itemName, price, quantity);
        cart.add(item);
        System.out.println(itemName + " added to cart.");
    }
    public void removeItem(String itemName) {
        boolean removed = false;
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemName.equalsIgnoreCase(itemName)) {
                cart.remove(i);
                System.out.println(itemName + " removed from cart.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println(itemName + " not found in cart.");
        }
    }
    public void displayTotal() {
        double total = 0;
        System.out.println("\n--- Cart Items ---");
        for (CartItem item : cart) {
            item.displayItem();
            total += item.getItemTotal();
        }
        System.out.println("------------------");
        System.out.println("Total Cost: ₹" + total);
    }
}
public class ShoppingCartSystem {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 55000.0, 1);
        cart.addItem("Mouse", 500.0, 2);
        cart.addItem("Keyboard", 1200.0, 1);
        cart.displayTotal();
        cart.removeItem("Mouse");
        cart.displayTotal();
    }
}
