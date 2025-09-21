package oops6;
import java.util.Scanner;
class Employee {
    static String companyName = "Tech Corp";
    static int totalEmployees = 0;
    final int id;
    String name;
    String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployee() {
        if (this instanceof Employee) {
            System.out.println("\nCompany Name: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("ID           : " + id);
            System.out.println("Designation  : " + designation);
        }
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Designation: ");
        String des = sc.nextLine();

        Employee e = new Employee(name, id, des);
        e.displayEmployee();
        Employee.displayTotalEmployees();

        sc.close();
    }
}
