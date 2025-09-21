package oops3;
class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = -1;
        this.price = 0.0;
    }
    public void bookTicket(int seatNumber, double price) {
        if (this.seatNumber == -1) {
            this.seatNumber = seatNumber;
            this.price = price;
            System.out.println("Ticket booked successfully for " + movieName);
        } else {
            System.out.println("Seat already booked for " + movieName);
        }
    }
    public void displayTicket() {
        if (seatNumber == -1) {
            System.out.println("No ticket booked yet for movie: " + movieName);
        } else {
            System.out.println("----- Ticket Details -----");
            System.out.println("Movie Name : " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price      : ₹" + price);
            System.out.println("--------------------------");
        }
    }
}
public class MovieTicketSystem {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Inception");
        ticket1.displayTicket();
        ticket1.bookTicket(12, 250.0);
        ticket1.displayTicket();
        ticket1.bookTicket(15, 300.0);
    }
}
