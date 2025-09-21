package oops3;
import java.util.*;
class BankAccount{
	String accountHolder;
	int accountNumber;
	double accountBalance;
	public BankAccount(String accountHolder,int accountNumber,double accountBalance) {
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.accountBalance=accountBalance;
		}
	public void DepositingMoney(double amount) {
		if(amount>0) {
			accountBalance+=amount;
			System.out.println("Deposited : "+amount);
		}
		else {
			System.out.println("Invalid Deposit Amount");
		}
	}
	public void WithDrawing(double amount) {
		if(amount<=accountBalance) {
			accountBalance-=amount;
			System.out.println("WithDrawn : "+amount);
		}
		else {
			System.out.println("Insufficient Balane !!!");
		}
	}
	public void displayBalance() {
		System.out.println("Current Balance : "+accountBalance);
	}
}
public class SimulateAnAtm{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Account Holder Name : ");
		String accountHolder=sc.nextLine();
		System.out.print("Enter Account Number : ");
		int accountNumber=sc.nextInt();
		System.out.print("Enter Account Balance : ");
		double accountBalance=sc.nextDouble();
		
		BankAccount account=new BankAccount(accountHolder,accountNumber,accountBalance);
		account.displayBalance();
		
		int choice;
		do {
		System.out.println("\n---Bank Menu---");
		System.out.println("1.Deposit Money");
		System.out.println("2.Withdraw Money");
		System.out.println("3.Display Balance");
		System.out.println("4.Exit");
		System.out.print("Enter your choice : ");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1 :
			System.out.print("Enter Amount to Deposit : ");
			double depositAmount=sc.nextDouble();
			account.DepositingMoney(depositAmount);
			break;
		case 2 :
			System.out.print("Enter Amount to Withdraw : ");
			double withdrawnAmount=sc.nextDouble();
			account.WithDrawing(withdrawnAmount);
			break;
		case 3 : 
		    account.displayBalance();
		    break;
		case 4 :
			System.out.println("EXITING");
	        break;
	    default:
	    	System.out.println("Invalid Choice ");
		}
		
		}
		while(choice!=4);
		sc.close();
	}
}
		