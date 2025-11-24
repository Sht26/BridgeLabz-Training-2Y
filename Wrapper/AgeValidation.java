package Wrapper;
public class AgeValidation {
    public static boolean validateAge(String age) {
        try {
            int n = Integer.parseInt(age);
            return n >= 18;
        } catch (Exception e) {
            return false;
        }
    }
}
