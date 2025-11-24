package Wrapper;
public class ShoppingCartPrice {
    public static void main(String[] args) {

        String[] prices = {"250", "499", "99", "abc"};
        int total = 0;

        for (String p : prices) {
            try {
                total += Integer.parseInt(p);
            } catch (Exception e) {
                System.out.println("Invalid price ignored: " + p);
            }
        }

        System.out.println("Total price = " + total);
    }
}

