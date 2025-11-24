package Exception;
class InsufficientFundsException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException(String msg) {
        super(msg);
    }
}

class ATM {
    private int balance = 10000;

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }
}

public class MainATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        try {
            atm.withdraw(15000);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
