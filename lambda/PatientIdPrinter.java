package lambda;
import java.util.*;

public class PatientIdPrinter {
    public static void main(String[] args) {
        List<Integer> patientIds = Arrays.asList(101, 102, 103, 104, 105);

        // Using method reference instead of id -> System.out.println(id)
        patientIds.forEach(System.out::println);
    }
}
