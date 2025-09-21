package oops5;
import java.util.Scanner;
class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void displayAccount() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance       : ₹" + balance);
    }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
    public void displayProtectedHolder() {
        System.out.println("Accessing Protected Account Holder: " + accountHolder);
    }
}
public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String holder = sc.nextLine();
        System.out.print("Enter Balance: ");
        double bal = sc.nextDouble();
        BankAccount acc = new BankAccount(accNum, holder, bal);
        acc.displayAccount();
        System.out.print("\nEnter new Balance to update: ");
        double newBal = sc.nextDouble();
        acc.setBalance(newBal);
        acc.displayAccount();
        SavingsAccount sa = new SavingsAccount(accNum, holder, bal);
        sa.displayProtectedHolder();
        sc.close();
    }
}
