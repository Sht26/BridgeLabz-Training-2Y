package BridgeLabz;
import java.util.*;
public class douOperation{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double a=input.nextInt();
		double b=input.nextInt();
		double c=input.nextInt();
		double o1=a+b*c;
		double o2=a*b+c;
		double o3=c+a/b;
		double o4=a%b+c;
		System.out.println(o1+" "+o2+" "+o3+" "+o4);
	}
}