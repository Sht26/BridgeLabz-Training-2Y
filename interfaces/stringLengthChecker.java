package interfaces;
import java.util.function.Function;

public class stringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthChecker = msg -> msg.length();
        String message = "Hello Functional Interface!";
        System.out.println("Message length: " + lengthChecker.apply(message));
    }
}
