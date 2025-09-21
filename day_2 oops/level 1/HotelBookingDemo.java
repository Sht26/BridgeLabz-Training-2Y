package oops4;
import java.util.Scanner;
class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    public HotelBooking() {
        this("Unknown Guest", "Standard", 1);
    }
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    public void displayBooking() {
        System.out.println("\n--- Booking Details ---");
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
    }
}
public class HotelBookingDemo {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
         HotelBooking defaultBooking = new HotelBooking();
         defaultBooking.displayBooking();
         System.out.print("\nEnter Guest Name: ");
         String guestName = sc.nextLine();
         System.out.print("Enter Room Type: ");
         String roomType = sc.nextLine();
         System.out.print("Enter Number of Nights: ");
         int nights = sc.nextInt();
         HotelBooking userBooking = new HotelBooking(guestName, roomType, nights);
         userBooking.displayBooking();
         HotelBooking copiedBooking = new HotelBooking(userBooking);
         System.out.println("\nCopied Booking:");
         copiedBooking.displayBooking();
         sc.close();
    }}
