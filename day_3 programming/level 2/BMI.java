package Array_2;
import java.util.*;
public class BMI{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no_of_persons=sc.nextInt();
		double[] weight=new double[no_of_persons];
		double[] height=new double[no_of_persons];
		double[] bmi=new double[no_of_persons];
		String[] weight_status=new String[no_of_persons];
		for(int i=0;i<no_of_persons;i++) {
			System.out.print("Enter height of Person "+(i+1)+" in cm:");
			height[i]=sc.nextDouble();
			System.out.print("Enter weight of Person "+(i+1)+" in kg:");
			weight[i]=sc.nextDouble();
			double height_in_meters=height[i]/100;
			bmi[i]=weight[i]/(height_in_meters*height_in_meters);
			if(bmi[i]<=18.4) {
				weight_status[i]="Under Weight";
			}
			else if(bmi[i]>=18.5 && bmi[i]<=24.9) {
				weight_status[i]="Normal";
			}
			else if(bmi[i]>24.9 && bmi[i]<=29.9) {
				weight_status[i]="Overweight";
			}
			else if(bmi[i]>=30){
				weight_status[i]="Obese";
			}
		}
		 System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
		for(int i=0;i<no_of_persons;i++) {
			System.out.printf("%-10.1f %-10.1f %-10.2f %-15s\n",height[i], weight[i], bmi[i], weight_status[i]);
		}
		sc.close();
	}
}
