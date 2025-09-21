package BridgeLabz;
import java.util.*;
public class totalPrice{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		float unit_price=input.nextFloat();
		int quantity=input.nextInt();
		float total_price=unit_price*quantity;
		System.out.println("The total purchase price is INR "+total_price+" if the quantity "+quantity+" and unit price is INR "+unit_price);
	}
}