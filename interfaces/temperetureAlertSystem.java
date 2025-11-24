package interfaces;
import java.util.function.Predicate;

public class temperetureAlertSystem {
    public static void main(String[] args) {
        Predicate<Double> alert = temp -> temp > 40.0;
        double currentTemp = 42.5;

        if (alert.test(currentTemp)) {
            System.out.println("Temperature Alert!");
        } else {
            System.out.println("Temperature Normal.");
        }
    }
}
