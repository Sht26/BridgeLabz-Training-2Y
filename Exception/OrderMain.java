package Exception;
import java.util.Random;

class OutOfStockException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OutOfStockException(String msg) {
        super(msg);
    }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) {
        super(msg);
    }
}

class Order {
    public void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random r = new Random();
        int x = r.nextInt(3);

        if (x == 0) throw new OutOfStockException("Product is out of stock!");
        if (x == 1) throw new PaymentFailedException("Payment failed!");
        
        System.out.println("Order placed successfully!");
    }
}

public class OrderMain {
    public static void main(String[] args) {
        Order o = new Order();

        try {
            o.placeOrder();
        } catch (OutOfStockException | PaymentFailedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
