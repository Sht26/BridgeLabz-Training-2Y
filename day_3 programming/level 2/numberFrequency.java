package Array_2;
import java.util.*;
public class numberFrequency{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int[] frequency=new int[10];
		while(number>0) {
			int r=number%10;
			frequency[r]+=1;
			number/=10;
		}
		for(int i=0;i<frequency.length;i++) {
			if(frequency[i]>0) {
				System.out.println(i+"="+frequency[i]);
			}
		}
		sc.close();
	}
}