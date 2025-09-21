package methods;
import java.util.*;
public class NumberOfChocolates{
	public static int[] findRemainderAndQuotient(int numberOfChildren,int numberOfChocolates) {
		int quotient=numberOfChocolates/numberOfChildren;
		int remainder=numberOfChocolates%numberOfChildren;
		return new int[] {quotient,remainder};
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Chocolates: ");
		int numberOfChocolates=sc.nextInt();
		System.out.print("Enter number of Children: ");
		int numberOfChildren=sc.nextInt();
		int[] result=findRemainderAndQuotient(numberOfChildren,numberOfChocolates);
		System.out.println("Each child will get: "+result[0]+" chocolates");
		System.out.println("Remaining Chocolates: "+result[1]);
		sc.close();
	}
}