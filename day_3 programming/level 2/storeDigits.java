package Array_2;
import java.util.*;
public class storeDigits{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int maxDigit=10;
		int[] array=new int[maxDigit];
		int index=0;
		while(number!=0) {
			int digit=number%10;
			array[index]=digit;
			index++;
			if(index==maxDigit) {
			     break;}
			number=number/10;
		}
		int largest=0;
		int second_largest=0;
		for(int i=0;i<index;i++) {
			if(array[i]>largest) {
				second_largest=largest;
				largest=array[i];
			}
			else if(array[i]>second_largest && array[i]!=largest) {
			second_largest=array[i];
			}
		}
		System.out.println("Largest : "+largest);
		System.out.println("Second Largest : "+second_largest);
		sc.close();
	}
}