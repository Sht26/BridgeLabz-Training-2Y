

abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;

    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    public void displayDetails() {
        System.out.printf("ID: %s, Name: %s, Base Salary: %.2f", employeeId, name, baseSalary);
    }

    public abstract double calculateSalary();
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;
    private double monthlyAllowance;

    public FullTimeEmployee(String id, String name, double baseSalary, double allowance) {
        super(id, name, baseSalary);
        this.monthlyAllowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + monthlyAllowance;
    }

    @Override
    public void assignDepartment(String dept) { this.department = dept; }

    @Override
    public String getDepartmentDetails() { return department; }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.printf(", Dept: %s, Total Salary: %.2f\n", department, calculateSalary());
    }
}

class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double ratePerHour;

    public PartTimeEmployee(String id, String name, double ratePerHour, int hoursWorked) {
        super(id, name, 0);
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return ratePerHour * hoursWorked;
    }

    @Override
    public void assignDepartment(String dept) { this.department = dept; }

    @Override
    public String getDepartmentDetails() { return department; }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.printf(", Dept: %s, Total Salary: %.2f\n", department, calculateSalary());
    }
}

public class EmployeeManagementDemo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        FullTimeEmployee f1 = new FullTimeEmployee("FT001", "Asha", 50000, 5000);
        f1.assignDepartment("HR");
        PartTimeEmployee p1 = new PartTimeEmployee("PT001", "Vikram", 500, 80);
        p1.assignDepartment("Support");
        FullTimeEmployee f2 = new FullTimeEmployee("FT002", "Neha", 60000, 7000);
        f2.assignDepartment("Engineering");

        employees[0] = f1;
        employees[1] = p1;
        employees[2] = f2;

        // Polymorphism: using Employee reference to process different types
        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}
