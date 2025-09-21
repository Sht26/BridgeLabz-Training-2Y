package oops7;
import java.util.ArrayList;
import java.util.Scanner;
class Customer {
    String name;
    double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void viewBalance() {
        System.out.println(name + "'s balance: ₹" + balance);
    }
}

class Bank {
    String name;
    ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void openAccount(Customer c) {
        customers.add(c);
    }

    public void displayCustomers() {
        System.out.println("\nBank: " + name);
        for (Customer c : customers) {
            c.viewBalance();
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank bank = new Bank("ABC Bank");

        Customer c1 = new Customer("Alice", 5000);
        Customer c2 = new Customer("Bob", 10000);

        bank.openAccount(c1);
        bank.openAccount(c2);

        bank.displayCustomers();

        sc.close();
    }
}
