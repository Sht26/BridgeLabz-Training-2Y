package oops;
import java.util.*;
public class StudentResultManagementSystem{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		    System.out.print("Enter Name Here : ");
		    String name=sc.nextLine();
		    if(name==null) {
		      	throw new NullPointerException("Student name is not empty.");
		    }
		    System.out.print("Enter Age : ");
		    int age=sc.nextInt();
		    if(age<18) {
		    	    throw new InvalidAgeException("Age will be greater than 18."); 
		    }
		    int[] marks=new int[3];
		    for(int i=0;i<marks.length;i++) {
		    	    System.out.print("Enter Marks of Student "+(i+1)+" : ");
		    	    marks[i]=sc.nextInt();
		    	    if(marks[i]<0 || marks[i]>100) {
		    	    	    throw new InvalidMarksException("Marks will not be greater than 100 and smaller than 0.");
		    	    }
		    }
		    double average = 0;    
            average=(marks[0]+marks[1]+marks[2])/3.0;
            try {
                System.out.println("Accessing extra index: " + marks[3]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception: " + e);
            }
            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
            System.out.println("Marks : "+average);
		}
		catch(NullPointerException e) {
			System.out.println("Null Pointer Error Resolved.");
		}
		catch(InvalidAgeException e) {
			System.out.println("Invalid Age Exception Resolved.");
		}
		catch(InvalidMarksException e) {
			System.out.println("Invalid Marks Exception Resolved.");
		}
		finally {
			System.out.println("Result Processing Completed.");
		}
	}
}