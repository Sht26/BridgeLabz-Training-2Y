package Array;
import java.util.*;
public class factors{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int maxFactor=10;
		int[] factors=new int[maxFactor];
		int factorsIndex=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				if(factorsIndex==maxFactor) {
					maxFactor*=2;
				    int[] temp=new int[maxFactor];
			        for(int j=0;j<factorsIndex;j++) {
			        	temp[j]=factors[j];
			        }
			        factors=temp;
		}
			factors[factorsIndex]=i;
			factorsIndex++;
			}}
		for(int i=0;i<factorsIndex;i++) {
		     System.out.print(factors[i]+" ");
	}
		System.out.println();
		}
}
