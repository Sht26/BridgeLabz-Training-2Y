package oops3;
import java.util.*;
class Student{
	String name;
	int rollNumber;
	double marks;
	public Student(String name, int rollNumber,double marks) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.marks=marks;
	}
	public String CalculateGrade() {
		while(marks<=100 && marks>=0) {
			if(marks>=80) {
				return "A";
			}
			else if(marks>=60 && marks<80) {
				return "B";
			}
			else if(marks>=40 && marks<60) {
				return "C";
			}
			else {
				return "Fail";
			}
		}
		return name;
		}
		public void display() {
			System.out.println("Student Name : "+name);
			System.out.println("Roll Number : "+rollNumber);
			System.out.println("Marks : "+marks);
			System.out.println("Grade : "+CalculateGrade());
		}
}
public class StudentReport {
    public static void main(String[] args) {
     	Scanner sc=new Scanner(System.in);
	    System.out.print("Enter Name : ");
	    String name=sc.next();
	    System.out.print("Enter roll number : ");
	    int rollNumber=sc.nextInt();
	    System.out.print("Enter marks : ");
	    double marks=sc.nextDouble();
	    Student student=new Student(name,rollNumber,marks);
	    student.display();
	    sc.close();
    }
}
