package oops6;
import java.util.Scanner;
class BankAccount {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void displayAccount() {
        if (this instanceof BankAccount) {
            System.out.println("\nBank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        BankAccount acc = new BankAccount(name, accNo);
        acc.displayAccount();
        BankAccount.getTotalAccounts();

        sc.close();
    }
}
