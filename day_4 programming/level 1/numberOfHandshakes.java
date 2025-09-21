package methods;
import java.util.*;
public class numberOfHandshakes{
	public static int no_of_handshakes(int numberOfStudents) {
		return (numberOfStudents*(numberOfStudents-1))/2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberOfStudents=sc.nextInt();
		int handshakes=no_of_handshakes(numberOfStudents);
		System.out.println("Number of Possible Handshakes are: "+handshakes);
		sc.close();
	}
}