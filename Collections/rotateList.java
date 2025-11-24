package Collections;
import java.util.*;
public class rotateList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int k = 2;
        Collections.rotate(list, -k);
        System.out.println(list);
    }
}
