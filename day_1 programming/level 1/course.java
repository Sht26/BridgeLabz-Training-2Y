package Bridgelbz;
public class course{
	public static void main(String[] args) {
		int fee=125000;
		int discountPercent=10;
		int discount=fee*discountPercent/100;
		int discounted_fee=fee-discount;
		System.out.println("The discount amount is INR "+ discount+" and the discounted fee is INR "+discounted_fee);
	}
}