package oops2;
import java.util.*;
class Employee {
       String name;
       int id;
       int salary;
       public Employee(String name,int id,int salary) {
    	   this.name=name;
    	   this.id=id;
    	   this.salary=salary;
       }
       public void display() {
    	   System.out.println("Employee Details : ");
    	   System.out.println("Name : "+name);
    	   System.out.println("Id : "+id);
    	   System.out.println("Salary : "+salary);
       }
}
public class EmployeeDetails{
       public static void main(String[] args) {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.print("Enter name : ");
    	   String name=sc.nextLine();
    	   System.out.print("Enter Id : ");
    	   int id=sc.nextInt();
    	   System.out.print("Enter Salary : ");
    	   int salary=sc.nextInt();
    	   Employee emp=new Employee(name,id,salary);
    	   emp.display();
    	   sc.close();
       }
}

