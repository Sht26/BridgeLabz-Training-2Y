package lambda;
import java.util.*;
import java.util.function.Predicate;

public class NotificationFilter {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList(
            "High Fever",
            "Normal Checkup",
            "Emergency Code Blue",
            "Low Battery",
            "Medication Reminder"
        );

        // Filter: show only emergency related alerts
        Predicate<String> emergencyFilter =
                alert -> alert.toLowerCase().contains("emergency") ||
                         alert.toLowerCase().contains("code");

        alerts.stream()
              .filter(emergencyFilter)
              .forEach(System.out::println);
    }
}
