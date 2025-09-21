package Bridgelbz;
public class P_and_L{
	public static void main(String[] args) {
		int cost_price=129;
		int selling_price=191;
		int profit=selling_price-cost_price;
		int profit_per=(profit*100)/cost_price;
		System.out.println("The Cost price is INR "+cost_price+" and Selling price is INR "+selling_price+"\n"+
		"The Profit is INR "+profit+" and the Profit Percentage is "+profit_per);
	}
}