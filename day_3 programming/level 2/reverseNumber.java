package Array_2;
import java.util.*;
public class reverseNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int count=0;
		int temp=number;
		while(temp!=0) {
			count++;
			temp/=10;
		}
		int[] array = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            array[i] = temp % 10;
            temp /= 10;
        }
		 int[] reverseDigits = new int[count];
	        for (int i = 0; i < count; i++) {
	            reverseDigits[i] = array[count - 1 - i];
	        }
	        System.out.print("Reversed number: ");
	        for (int i = 0; i < count; i++) {
	            System.out.print(reverseDigits[i]);
	        }
	        sc.close();
	}
}