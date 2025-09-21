package Array;
import java.util.*;
public class table_2{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int[] multiplicationResult=new int[10];
		int result;
		for(int i=1;i<=10;i++) {
			if(number>=6 && number<=9) {
				result=number*i;
				System.out.println(number+" X "+i+" = "+result);
			}
		    else {
			   System.out.println("Invalid Table");
			   break;
			}
		}
		for(int i=1;i<multiplicationResult.length;i++) {
			multiplicationResult[i]=multiplicationResult[i-1];
		}
	}
}