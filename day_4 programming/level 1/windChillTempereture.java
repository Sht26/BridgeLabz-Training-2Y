package methods;
import java.util.*;
public class windChillTempereture{
	public static double calculateWindChill(double tempereture,double windSpeed) {
		return 35.74 + 0.6215 * tempereture + (0.4275 * tempereture - 35.75) * Math.pow(windSpeed,0.16);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Tempereture (in Fahrenheit): ");
		double tempereture=sc.nextDouble();
		System.out.print("Enter Wind Speed (in mph): ");
		double windSpeed=sc.nextDouble();
		double windChill=calculateWindChill(tempereture,windSpeed);
		System.out.printf("%.2f\n",windChill);
		sc.close();
	}
}