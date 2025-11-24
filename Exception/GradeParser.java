package Exception;

public class GradeParser {
    public static void main(String[] args) {
        String[] grades = {"90", "A+", "85"};

        for (String g : grades) {
            try {
                int val = Integer.parseInt(g);
                System.out.println("Grade: " + val);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + g);
            }
        }
    }
}

