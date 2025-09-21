package string;
import java.util.*;
public class compareString {
	public static boolean compare(String str1,String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first String: ");
        String str1=sc.next();
        System.out.print("Enter second String : ");
        String str2=sc.next();
        boolean result_of_charAt=compare(str1,str2);
        boolean result_of_equal=str1.equals(str2);
        if(result_of_charAt && result_of_equal) {
        	System.out.println("Both are same");
        }
        else {
        	System.out.println("Both are Different");
        }
        sc.close();
	}  
}
	
