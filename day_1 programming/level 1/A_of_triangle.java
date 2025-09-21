package Bridgelbz;
import java.util.*;
public class A_of_triangle{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		float base=input.nextFloat();
		float height=input.nextFloat();
		float area_cm=1/2f*base*height;
		double area_inches=area_cm*2.54;
		System.out.println("Area of triangle in cm is "+area_cm+" and in inches are "+area_inches);
	}
}