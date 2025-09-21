package methods;
import java.util.*;
public class smallestAndLargest{
	public static void findSmallestAndLargest(int number1,int number2,int number3) {
		int smallest;
		int largest;
		if(number1>=number2 && number1>=number3) {
			largest=number1;
		}
		else if(number2>=number1 && number2>=number3) {
			largest=number2;
		}
		else{
			largest=number3;
		}
	
		if(number1<=number2 && number1<=number3) {
			smallest=number1;
		}
		else if(number2<=number1 && number2<=number3) {
			smallest=number2;
		}
		else{
			smallest=number3;
		}
		System.out.println("Largest: "+largest);
		System.out.println("Smallest: "+smallest);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Number 1: ");
		int number1=sc.nextInt();
		System.out.print("Number 2: ");
		int number2=sc.nextInt();
		System.out.print("Number 3: ");
		int number3=sc.nextInt();
		findSmallestAndLargest(number1,number2,number3);
		sc.close();
	}
}