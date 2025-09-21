package oops4;
import java.util.Scanner;
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;
    public CarRental() {
        this("Unknown Customer", "Standard", 1);
    }
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateTotalCost();
    }
    public void calculateTotalCost() {
        double rate = 0;
        switch (carModel.toLowerCase()) {
            case "sedan": rate = 2000; break;
            case "suv": rate = 3500; break;
            case "hatchback": rate = 1500; break;
            default: rate = 1000;
        }
        totalCost = rate * rentalDays;
    }
    public void displayRental() {
        System.out.println("\n--- Car Rental Details ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model    : " + carModel);
        System.out.println("Rental Days  : " + rentalDays);
        System.out.println("Total Cost   : ₹" + totalCost);
    }
}
public class CarRentalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarRental defaultRental = new CarRental();
        defaultRental.displayRental();
        System.out.print("\nEnter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Car Model (Sedan/SUV/Hatchback/Other): ");
        String model = sc.nextLine();
        System.out.print("Enter Rental Days: ");
        int days = sc.nextInt();
        CarRental rental = new CarRental(name, model, days);
        rental.displayRental();
        sc.close();
    }
}
