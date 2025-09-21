package Array_2;
import java.util.*;
public class youngestFriend{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] names= {"Amar","Akbar","Anthony"};
		int[] age=new int[3];
		int[] height=new int[3];
		for(int i=0;i<age.length;i++) {
			System.out.print("Enter age in years of person "+names[i]+" :");
			 age[i]=sc.nextInt();
	
			System.out.print("Enter height in cm "+names[i]+" :");
			height[i]=sc.nextInt();
		}
		int youngest_index=0;
		int temp=age[0];
		for(int i=1;i<age.length;i++) {
			if(age[i]<temp) {
				temp=age[i];
				youngest_index=i;
			}
		}
		int tallest_index=0;
		int temp2=height[0];
		for(int i=1;i<height.length;i++) {
			if(height[i]>temp2) {
				temp2=height[i];
				tallest_index=i;
			}
		}
		System.out.println("Youngest Friend "+names[youngest_index]+" Age: "+temp);
		System.out.println("Tallest Friend "+names[tallest_index]+" Height: "+temp2);
		sc.close();
	}
}