package Array;
import java.util.*;
public class FizzBuzz{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		String[] results=new String[number+1];
		for(int i=0;i<=number;i++) {
		     if(i%3==0 && i!=0) {
		    	results[i]="Fizz";
		     }else if(i%5==0 && i!=0) {
			    results[i]="Buzz";
		     }else if(i%5==0 && i%3==0 && i!=0) {
			    results[i]="FizzBuzz";
	       	}
		else {
			results[i]=String.valueOf(i);
		}
	} 
		for(int i=0;i<=number;i++) {
			System.out.println("Postion "+i+" = "+results[i]);
			}
		}
}