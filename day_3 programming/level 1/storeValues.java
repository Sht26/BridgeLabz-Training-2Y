package Array;
import java.util.*;

public class storeValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            if (index < 10) {
                double input = sc.nextDouble();  // take input first

                if (input <= 0) {  // stop if 0 or negative
                    break;
                }

                arr[index] = input;  // store only valid input
                index++;
            } else {
                break; // stop if array is full
            }
        }

        // display all valid numbers
        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
            total += arr[i];
        }

        // print sum
        System.out.println("\nSum = " + total);

        sc.close();
    }
}
