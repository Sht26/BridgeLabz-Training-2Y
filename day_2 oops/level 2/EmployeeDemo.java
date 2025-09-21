package oops5;
import java.util.Scanner;
class Employee {
    public int employeeID;
    protected String department;
    private double salary;
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void displayEmployee() {
        System.out.println("\nEmployee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : ₹" + salary);
    }
}
class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }
    public void displayProtectedDepartment() {
        System.out.println("Accessing Protected Department: " + department);
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter Salary: ");
        double sal = sc.nextDouble();
        Employee emp = new Employee(id, dept, sal);
        emp.displayEmployee();
        System.out.print("\nEnter new Salary to update: ");
        double newSal = sc.nextDouble();
        emp.setSalary(newSal);
        emp.displayEmployee();
        Manager m = new Manager(id, dept, sal);
        m.displayProtectedDepartment();
        sc.close();
    }
}
