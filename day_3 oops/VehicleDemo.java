package oops6;
import java.util.Scanner;
class Vehicle {
    static double registrationFee = 500.0;
    final int registrationNumber;
    String ownerName;
    String vehicleType;

    public Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public void displayVehicle() {
        if (this instanceof Vehicle) {
            System.out.println("\nOwner Name        : " + ownerName);
            System.out.println("Vehicle Type      : " + vehicleType);
            System.out.println("Registration No.  : " + registrationNumber);
            System.out.println("Registration Fee  : ₹" + registrationFee);
        }
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Registration Number: ");
        int regNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Owner Name: ");
        String owner = sc.nextLine();

        System.out.print("Enter Vehicle Type: ");
        String type = sc.nextLine();

        Vehicle v = new Vehicle(owner, type, regNo);
        v.displayVehicle();
        Vehicle.updateRegistrationFee(750.0);
        v.displayVehicle();

        sc.close();
    }
}
