package day_3;
import java.util.*;
public class StudentRegistrationSystem{
	public static void main(String[] student) {
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<=student.length;i++) {
			System.out.println(student[i]);
		}
}
	public static void compareStrings(String str1,String str2) {
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
	}
	public static void searchStudents(String[] student,String name) {
		boolean found=false;
		for(int i=0;i<student.length;i++) {
			if(student[i].equals(name)) {
				found=true;
				break;
			}
		}
	}
}