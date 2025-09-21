package oops2;
import java.util.*;
class MobilePhone{
	String brand;
	String model;
	double price;
	public MobilePhone(String brand,String model,double price) {
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	public void display() {
		System.out.println("Brand Name : "+brand);
		System.out.println("Model Name : "+model);
		System.out.println("price : "+price);
	}
}
public class MobilePhoneDetails{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Brand Name : ");
		String brand=sc.next();
		System.out.print("Enter Model Name : ");
		String model=sc.next();
		System.out.print("Enter Price : ");
		double price=sc.nextDouble();
		MobilePhone mobilephone=new MobilePhone(brand,model,price);
		mobilephone.display();
		sc.close();
	}
}