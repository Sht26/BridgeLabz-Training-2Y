package oops5;
import java.util.Scanner;
class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Default Institute";
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    public void displayCourseDetails() {
        System.out.println("\nCourse Name   : " + courseName);
        System.out.println("Duration      : " + duration + " days");
        System.out.println("Fee           : ₹" + fee);
        System.out.println("Institute     : " + instituteName);
    }
    public static void updateInstituteName(String name) {
        instituteName = name;
    }
}
public class CourseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of courses: ");
        int n = sc.nextInt();
        sc.nextLine();
        Course[] courses = new Course[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter Course Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Duration (days): ");
            int duration = sc.nextInt();
            System.out.print("Enter Fee: ");
            double fee = sc.nextDouble();
            sc.nextLine();
            courses[i] = new Course(name, duration, fee);
        }
        System.out.print("\nEnter new Institute Name: ");
        String institute = sc.nextLine();
        Course.updateInstituteName(institute);
        for (Course c : courses) {
            c.displayCourseDetails();
        }
        sc.close();
    }
}
