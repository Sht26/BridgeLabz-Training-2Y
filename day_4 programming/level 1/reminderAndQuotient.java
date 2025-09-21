package methods;
import java.util.*;

public class reminderAndQuotient {

    // Method that returns both remainder and quotient as an array
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;   // division
        int remainder = number % divisor;  // modulus
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the number (dividend): ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Call method
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display result
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
        sc.close();
    }
}
