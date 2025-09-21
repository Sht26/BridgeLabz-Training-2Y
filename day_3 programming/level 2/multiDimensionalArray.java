package Array_2;
import java.util.*;

public class multiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of persons
        System.out.print("Enter number of persons: ");
        int no_of_persons = sc.nextInt();

        // 2D array: personData[i][0] = height, personData[i][1] = weight, personData[i][2] = BMI
        double[][] personData = new double[no_of_persons][3];
        String[] weightStatus = new String[no_of_persons];

        for (int i = 0; i < no_of_persons; i++) {
            // Height input (validate positive)
            double height;
            do {
                System.out.print("Enter height of Person " + (i + 1) + " in cm: ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive! Try again.");
                }
            } while (height <= 0);

            // Weight input (validate positive)
            double weight;
            do {
                System.out.print("Enter weight of Person " + (i + 1) + " in kg: ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive! Try again.");
                }
            } while (weight <= 0);

            // Store height and weight
            personData[i][0] = height;
            personData[i][1] = weight;

            // Convert to meters and calculate BMI
            double height_in_meters = height / 100.0;
            double bmi = weight / (height_in_meters * height_in_meters);
            personData[i][2] = bmi;

            // Determine weight status
            if (bmi <= 18.4) {
                weightStatus[i] = "Under Weight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi > 24.9 && bmi <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.printf("%-12s %-12s %-12s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < no_of_persons; i++) {
            System.out.printf("%-12.1f %-12.1f %-12.2f %-15s\n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

    }
}
