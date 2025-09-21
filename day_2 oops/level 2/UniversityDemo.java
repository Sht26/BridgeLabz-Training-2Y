package oops5;
import java.util.Scanner;
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double cgpa) {
        CGPA = cgpa;
    }
    public void displayStudent() {
        System.out.println("\nRoll Number: " + rollNumber);
        System.out.println("Name       : " + name);
        System.out.println("CGPA       : " + CGPA);
    }
}
class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }
    public void displayProtectedName() {
        System.out.println("Accessing Protected Name: " + name);
    }
}
public class UniversityDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();
        Student s = new Student(roll, name, cgpa);
        s.displayStudent();
        System.out.print("\nEnter new CGPA to update: ");
        double newCGPA = sc.nextDouble();
        s.setCGPA(newCGPA);
        s.displayStudent();
        PostgraduateStudent pg = new PostgraduateStudent(roll, name, cgpa);
        pg.displayProtectedName();
        sc.close();
    }
}
