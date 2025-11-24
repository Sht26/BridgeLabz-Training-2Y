package Wrapper;
import java.util.*;
public class StudentMarksReport {
    public static void main(String[] args) {

        String[] input = {"85", "95", "null", "abc", "88"};

        ArrayList<Integer> list = new ArrayList<>();

        for (String s : input) {
            try {
                list.add(Integer.parseInt(s));
            } catch (Exception e) { }
        }

        int sum = 0;
        for (int x : list) sum += x;

        double avg = (list.size() == 0) ? 0 : (sum * 1.0 / list.size());

        System.out.println("Average = " + avg);
    }
}
