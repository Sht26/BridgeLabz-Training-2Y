package Array;
import java.util.*;
public class playerHeight{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[] heights=new double[11];
		double sum = 0.0;
		for (int i=0;i<heights.length;i++) {
			heights[i]=input.nextDouble();
			sum+=heights[i];
		}
		double mean=sum/heights.length;
		System.out.printf("Mean Height %.2f%n",mean);
	}
}