package Bridgelbz;
import java.util.*;
public class km_to_miles{
	public static void main(String[] args) {
		double km;
		Scanner input=new Scanner(System.in);
		km=input.nextDouble();
		double miles=km*0.6;
		System.out.println("The total mile is "+miles+" for the given "+km+"km");
	}
}