package oops2;
import java.util.*;
class Circle{
	double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public double AreaOfCircle() {
		return Math.PI*(radius*radius);
	}
	public double Circumference() {
		return 2*Math.PI*radius;
	}
	public void display() {
		System.out.println("Radius : "+radius);
		System.out.println("Area : "+AreaOfCircle());
		System.out.println("Circumference : "+Circumference());
	}
}
public class AreaOfCircle{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius of circle : ");
		double radius=sc.nextDouble();
		Circle circle=new Circle(radius);
		circle.display();
		sc.close();
	}
}