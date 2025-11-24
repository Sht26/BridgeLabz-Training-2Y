package Exception;
import java.util.Random;

class NegativeAmountException extends Exception {
    public NegativeAmountException(String m) { super(m); }
}

class NetworkFailureException extends Exception {
    public NetworkFailureException(String m) { super(m); }
}

class Transaction {
    public void doTransaction(int amount, int balance)
            throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {

        Random r = new Random();
        int x = r.nextInt(3);

        if (amount < 0) throw new NegativeAmountException("Amount cannot be negative!");
        if (amount > balance) throw new InsufficientFundsException("Insufficient Balance!");
        if (x == 1) throw new NetworkFailureException("Network is down!");

        System.out.println("Transaction Successful!");
    }
}

public class TransactionMain {
    public static void main(String[] args) {
        Transaction t = new Transaction();

        try {
            t.doTransaction(15000, 10000);
        } catch (NegativeAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
