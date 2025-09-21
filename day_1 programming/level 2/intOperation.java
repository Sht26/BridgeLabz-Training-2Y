package BridgeLabz;
import java.util.*;
public class intOperation{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int o1=a+b*c;
		int o2=a*b+c;
		int o3=c+a/b;
		int o4=a%b+c;
		System.out.println(o1+" "+o2+" "+o3+" "+o4);
	}
}