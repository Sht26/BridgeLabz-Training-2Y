package Bridgelbz;
import java.util.*;
public class distanceConvert{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int distance_feet=input.nextInt();
		int distance_yard=distance_feet/3;
		int distance_miles=distance_yard/1760;
		System.out.println("Distance in feet is "+distance_feet+" ,distance in yard is "+distance_yard+" and distance in miles is "+distance_miles);
	}
}