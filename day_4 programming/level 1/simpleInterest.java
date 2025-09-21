package methods;
import java.util.*;
public class simpleInterest {
	public static double calculateSimpleInterest(double principle,double rate,double time) {
		return (principle*rate*time)/100;
	}
         public static void main(String[] args) {
        	 Scanner sc=new Scanner(System.in);
        	 System.out.print("Enter Principle: ");
        	 double principle=sc.nextDouble();
        	 System.out.print("Enter Rate of Interest: ");
        	 double rate=sc.nextDouble();
        	 System.out.print("Enter Time (in years): ");
        	 double time=sc.nextDouble();
        	 double simpleInterest=calculateSimpleInterest(principle,rate,time);
        	 System.out.println("The simple interest is "+simpleInterest+" for principle "+principle+" Rate of Interest "+rate+" and time "+time);
        	 sc.close();
         }
}
