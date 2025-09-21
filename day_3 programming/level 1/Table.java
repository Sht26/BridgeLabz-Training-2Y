package Array;
import java.util.Scanner;
public class Table{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int[] arr=new int[10];
		for(int i=1;i<=arr.length;i++) {
			arr[i-1]=number*i;
		}
		for(int i=1;i<=arr.length;i++) {
			System.out.println(number+" * "+i+" = "+(number*i));
		}
		sc.close();
	}
}