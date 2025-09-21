package oops6;
import java.util.Scanner;
class Student {
    static String universityName = "Global University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public void displayStudent() {
        if (this instanceof Student) {
            System.out.println("\nUniversity : " + universityName);
            System.out.println("Name       : " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade      : " + grade);
        }
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        Student s = new Student(name, roll, grade);
        s.displayStudent();
        Student.displayTotalStudents();

        sc.close();
    }
}
