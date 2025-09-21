package Bridgelbz;
import java.util.*;
public class fee{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int fee=input.nextInt();
		int discountPercent=10;
		int discount=fee*discountPercent/100;
		int discounted_fee=fee-discount;
		System.out.println("The discount amount is INR "+ discount+" and the discounted fee is INR "+discounted_fee);
	}
}