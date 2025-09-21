package string;
import java.util.*;
public class subStringCheck{
	public static String SubString(String str,int start,int end) {
		String result="";
		for(int i=start;i<end;i++) {
			result+=str.charAt(i);
		}
		return result;
	}
	public static boolean compare(String sub1,String sub2) {
		if(sub1.length() != sub2.length()) {
			return false;
		}
		for(int i=0;i<sub1.length();i++) {
			if(sub1.charAt(i) != sub2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=sc.next();
		System.out.print("Enter starting index : ");
		int start=sc.nextInt();
		System.out.print("Enter ending index : ");
		int end=sc.nextInt();
		
		String sub1=SubString(str,start,end);
		String sub2=str.substring(start,end);
		
		boolean isEqual=compare(sub1,sub2);
		
		System.out.println("Substring using charAt:"+sub1);
		System.out.println("Substring using substring:"+sub2);
		System.out.println("Are both sub strings equal ? "+isEqual);
		sc.close();
	}
}