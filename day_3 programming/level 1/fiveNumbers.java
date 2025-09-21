package Array;
import java.util.*;
public class fiveNumbers{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] numbers=new int[5];
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=sc.nextInt();
		}
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>0) {
				if(numbers[i]%2==0) {
					System.out.println("Even Number");
				}
				else {
					System.out.println("Odd Number");
				}
			}
			else if(numbers[i]<0) {
				System.out.println("negative");
			}
			else {
				System.out.println("zero");
			}}
         if(numbers[0]==numbers[numbers.length-1]) {
		        System.out.println("Equal");
         }else if(numbers[0]>numbers[numbers.length-1]) {
		        System.out.println("First is greater than last");
         }
         else {
		       System.out.println("Last is greater than first");
         }

        sc.close();
	}}
