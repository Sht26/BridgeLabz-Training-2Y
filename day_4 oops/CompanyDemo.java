package oops7;
import java.util.ArrayList;
class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public void displayEmployee() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String name;
    ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void displayDepartment() {
        System.out.println("\nDepartment: " + name);
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }
}

class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void displayCompany() {
        System.out.println("\nCompany: " + name);
        for (Department d : departments) {
            d.displayDepartment();
        }
    }
}

public class CompanyDemo {
    public static void main(String[] args) {
        Company c = new Company("TechCorp");

        Department d1 = new Department("IT");
        d1.addEmployee(new Employee("Alice"));
        d1.addEmployee(new Employee("Bob"));

        Department d2 = new Department("HR");
        d2.addEmployee(new Employee("Charlie"));

        c.addDepartment(d1);
        c.addDepartment(d2);

        c.displayCompany();
    }
}
