package oops4;
import java.util.Scanner;
class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    public void displayPerson() {
        System.out.println("\n--- Person Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}
public class PersonDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        Person p1 = new Person(name, age);
        p1.displayPerson();
        Person p2 = new Person(p1);
        System.out.println("\nCloned Person (Copy Constructor):");
        p2.displayPerson();
        sc.close();
    }
}
