package Array_2;
import java.util.*;
public class studentMarks{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no_of_students=sc.nextInt();
		int[] physics=new int[no_of_students];
		int[] chemistry=new int[no_of_students];
		int[] maths=new int[no_of_students];
		int[] percentage=new int[no_of_students];
		char[] grades=new char[no_of_students];
		for(int i=0;i<no_of_students;i++) {
			physics[i]=sc.nextInt();
			if(physics[i]<0) {
				System.out.println("Enter Positive Values : ");
				i--;
				continue;
		}
			chemistry[i]=sc.nextInt();
			if(chemistry[i]<0) {
				System.out.println("Enter Positive Values : ");
				i--;
				continue;
		}
			maths[i]=sc.nextInt();
			if(maths[i]<0) {
				System.out.println("Enter Positive Values : ");
				i--;
				continue;
		}
			percentage[i]=(physics[i]+chemistry[i]+maths[i])/3;
			System.out.println(percentage[i]);
			if(percentage[i]>=80) {
			    System.out.println("Level 4,above agency-normalized standards");
				grades[i]='A';
			}
			else if(percentage[i]>=70 && percentage[i]<=79) {
				System.out.println("Level 3, at agency-normalized standards");
				grades[i]='B';
			}
			else if(percentage[i]>=60 && percentage[i]<=69) {
				System.out.println("Level 2, but approaching agency-normalized standards");
				grades[i]='C';
			}
			else if(percentage[i]>=50 && percentage[i]<=59) {
				System.out.println("Level 1, well below agency-normalized standards");
				grades[i]='D';
			}
			else if(percentage[i]>=40 && percentage[i]<=49) {
				System.out.println("Level 1-too below agency-normalized standards");
				grades[i]='E';
			}
			else if(percentage[i]<=39) {
				System.out.println("Remedial Standards");
				grades[i]='R';
				}
			}
		for(int i=0;i<no_of_students;i++) {
			System.out.println("Marks in Physics: "+physics[i]+" Chemistry: "+chemistry[i]+" Maths: "+maths[i]+" Percentage: "+percentage[i]+" Grade: "+grades[i]);
		}
	}
}