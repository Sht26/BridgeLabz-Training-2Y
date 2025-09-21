package Bridgelbz;
import java.util.*;
public class calculater{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		float number1=input.nextFloat();
		float number2=input.nextFloat();
		float mul=number1*number2;
		float add=number1+number2;
		float sub=number1-number2;
		float div=number1/number2;
		System.out.println("The addition,substraction,multiplication and division value of 2 numbers "+number1+" and "+number2+" is "
		+add+","+sub+","+mul+" and "+div);
	}
}