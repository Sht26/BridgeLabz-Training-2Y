package Array_2;
import java.util.*;
public class zaraSalary {
       public static void main(String[] args) {
    	   Scanner sc=new Scanner(System.in);
    	   double[] salary=new double[10];
    	   double[] yearsOfService=new double[10];
    	   double[] bonus=new double[10];
    	   double[] new_salary=new double[10];
    	   double totalBonus=0.0;
    	   double totalOldSalary=0.0;
    	   double totalNewSalary=0.0;
    	   for(int i=0;i<10;i++) {
    		   System.out.println("Employee Details:"+(i+1));
			   System.out.print("Enter salary: ");
    		   while(true) {
    			   double s=sc.nextDouble();
    			   if(s>0) {
    				   salary[i]=s;
    				   break;
    			   }
    			   else {
    				   System.out.println("Invalid Salary");
    			   }
    		   }
			   System.out.println("Enter years of service: ");
    		   while(true) {
    			   double y=sc.nextDouble();
    			   if(y>=0) {
    				   yearsOfService[i]=y;
    				   break;
    			   }
    			   else {
    				   System.out.println("Invalid years of service");
    			   }
    		   }
    	   }
    	   for(int i=0;i<10;i++) {
    		   if(yearsOfService[i]>5) {
    			   bonus[i] = salary[i]*0.05;
    		   }
    		   else {
    			   bonus[i] = salary[i]*0.02;
    		   }
    		   new_salary[i]=bonus[i]+salary[i];
    		   totalBonus += bonus[i];
    		   totalOldSalary+=salary[i];
    		   totalNewSalary+=new_salary[i];
    	   }
    	   for(int i=0;i<10;i++) {
    		   System.out.printf("Employee %d : Old Salary=%.2f,Bonus=%.2f,New Salary=%.2f%n",(i+1),salary[i],bonus[i],new_salary[i]);
    	   }
    	   System.out.printf("Total Old Salary:%.2f%n",totalOldSalary);
    	   System.out.printf("Total Bonus:%.2f%n",totalBonus);
    	   System.out.printf("Total New Salary:%.2f%n",totalNewSalary);
    	   
    	   sc.close();
       }
}
