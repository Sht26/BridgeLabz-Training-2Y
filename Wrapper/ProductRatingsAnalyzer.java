package Wrapper;
import java.util.*;
public class ProductRatingsAnalyzer {

    public static void main(String[] args) {

        int[] arr = {4, 5, 3};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(null);
        list.add(4);

        ArrayList<Integer> finalList = new ArrayList<>();

        for (int x : arr) finalList.add(x);
        finalList.addAll(list);

        double avg = finalList.stream()
                .filter(Objects::nonNull)
                .mapToInt(i -> i)
                .average()
                .orElse(0);

        System.out.println("Average rating = " + avg);
    }
}
