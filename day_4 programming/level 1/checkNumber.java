package methods;
import java.util.*;
public class checkNumber{
	public static int check(int number) {
		if(number>0) {
			return 1;
		}
		else if(number==0) {
			return 0;
		}
		else if(number<0) {
			return -1;
		}
		return number;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=sc.nextInt();
		int checked=check(number);
		System.out.println(checked);
		sc.close();
	}
}