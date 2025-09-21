package Bridgelbz;
import java.util.*;
public class heightConvert{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int height_cm=input.nextInt();
		double height_inch=height_cm/2.54;
		double height_foot=height_inch/12;
		System.out.println("Your height in cm is "+height_cm+" while in feet is "+height_foot+" and inches is "+height_inch);
	}
}