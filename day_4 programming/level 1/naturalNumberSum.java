package methods;
import java.util.*;
public class naturalNumberSum{
	public static int total(int number,int sum) {
		for(int i=1;i<=number;i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.print("Enter the number to get sum of all previous and this natural number: ");
		int number=sc.nextInt();
		int naturalNumberSum=total(number,sum);
		System.out.println(naturalNumberSum);
		sc.close();
	}
}