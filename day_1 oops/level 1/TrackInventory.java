package oops2;
import java.util.*;
class Item{
	int itemCode;
	String itemName;
	double price;
	public Item(int itemCode,String itemName,double price) {
		this.itemCode=itemCode;
		this.itemName=itemName;
		this.price=price;
	}
	public void display() {
		System.out.println("Item Code : "+itemCode);
		System.out.println("Item Name : "+itemName);
		System.out.println("Item Price : "+price);
	}
	public double CalculateTotalCost(int quantity){
		return price * quantity;
	}
}
public class TrackInventory{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Item Code : ");
		int itemCode=sc.nextInt();
		System.out.print("Enter Item Name : ");
		String itemName=sc.next();
		System.out.print("Enter Item Price : ");
		double price=sc.nextDouble();
		Item item=new Item(itemCode,itemName,price);
		item.display();
		System.out.print("Enter Quantity : ");
		int quantity=sc.nextInt();
		double totalCost=item.CalculateTotalCost(quantity);
		System.out.println("The total cost of "+quantity+" items is "+totalCost);
		sc.close();
	}
}