package Wrapper;
import java.util.*;
public class EmployeeDataProcessing {
    public static void main(String[] args) {

        int[] ages = {25, 30, 45, 50, 22};

        ArrayList<Integer> list = new ArrayList<>();

        for (int age : ages) {
            list.add(age); // auto-boxing
        }

        int min = Collections.min(list);
        int max = Collections.max(list);

        System.out.println("Youngest: " + min);
        System.out.println("Oldest: " + max);
    }
}
