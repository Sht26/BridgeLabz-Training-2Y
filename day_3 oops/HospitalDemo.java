package oops6;
import java.util.Scanner;
class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public void displayPatient() {
        if (this instanceof Patient) {
            System.out.println("\nHospital : " + hospitalName);
            System.out.println("Patient Name : " + name);
            System.out.println("Age          : " + age);
            System.out.println("Ailment      : " + ailment);
            System.out.println("Patient ID   : " + patientID);
        }
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Ailment: ");
        String ailment = sc.nextLine();

        Patient p = new Patient(name, age, ailment, id);
        p.displayPatient();
        Patient.getTotalPatients();

        sc.close();
    }
}
