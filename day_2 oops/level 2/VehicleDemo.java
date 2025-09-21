package oops5;
import java.util.Scanner;
class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 500.0;
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public void displayVehicleDetails() {
        System.out.println("\nOwner Name    : " + ownerName);
        System.out.println("Vehicle Type  : " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }
    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}
public class VehicleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();
        sc.nextLine();
        Vehicle[] vehicles = new Vehicle[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter Owner Name: ");
            String owner = sc.nextLine();
            System.out.print("Enter Vehicle Type: ");
            String type = sc.nextLine();
            vehicles[i] = new Vehicle(owner, type);
        }
        System.out.print("\nEnter new Registration Fee: ");
        double fee = sc.nextDouble();
        Vehicle.updateRegistrationFee(fee);
        for (Vehicle v : vehicles) {
            v.displayVehicleDetails();
        }
        sc.close();
    }
}
