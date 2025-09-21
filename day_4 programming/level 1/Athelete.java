package methods;
import java.util.*;
public class Athelete {
	public static int no_of_rounds(int distance,int perimeter) {
		return distance/perimeter;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter side 1 length in meters: ");
		int side1=sc.nextInt();
		System.out.print("Enter side 2 length in meters: ");
		int side2=sc.nextInt();
		System.out.print("Enter side 3 length in meters: ");
		int side3=sc.nextInt();
		int distance=5000;
		int perimeter=side1+side2+side3;
		int rounds=no_of_rounds(distance,perimeter);
		System.out.println("Number of Rounds an Athelete should take is "+rounds);
		sc.close();
	}
}