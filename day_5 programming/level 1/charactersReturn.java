package string;
import java.util.*;
public class charactersReturn{
	public static char[] returnChar(String text) {
		char[] result=new char[text.length()];
		for(int i=0;i<text.length();i++) {
			result[i]+=text.charAt(i);
		}
		return result;
	}
	public static boolean CompareStrings(char[] arr1,char[] arr2) {
		if(arr1.length != arr2.length) {
			return false;
		}
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}
	public static void printCharArray(char[] arr) {
		for(char c:arr) {
			System.out.print(c+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String text=sc.next();
		char[] arr1=returnChar(text);
		char[] arr2=text.toCharArray();
		boolean isEqual=CompareStrings(arr1,arr2);
		System.out.println("Custom char array : ");
		printCharArray(arr1);
		System.out.println("Built-in char array : ");
		printCharArray(arr2);
		System.out.println("If both are equal ? "+isEqual);
		sc.close();
	}
}