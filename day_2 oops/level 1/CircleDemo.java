package oops4;
import java.util.Scanner;
class Circle {
    double radius;
    public Circle() {
        this(1.0); 
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public void displayCircle() {
        System.out.println("\n--- Circle Details ---");
        System.out.println("Radius        : " + radius);
        System.out.println("Area          : " + getArea());
        System.out.println("Circumference : " + getCircumference());
    }
}
public class CircleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        c1.displayCircle();
        System.out.print("\nEnter radius of circle: ");
        double r = sc.nextDouble();
        Circle c2 = new Circle(r);
        c2.displayCircle();
        sc.close();
    }
}
