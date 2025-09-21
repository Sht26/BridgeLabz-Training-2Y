package methods;
import java.util.*;
public class springSeason{
	public static boolean check(int month,int day) {
		if(month==3 && day>=20) {
			return true;
		}
		else if(month==4 && day>=1 && day<=30) {
			return true;
		}
		else if(month==5 && day>=1 && day<=30) {
			return true;
		}
		else if(month==6 && day>=1 && day<=20) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a month: ");
		int month=sc.nextInt();
		System.out.print("Enter a day: ");
		int day=sc.nextInt();
		boolean checked=check(month,day);
		System.out.println(checked);
		sc.close();
	}
}