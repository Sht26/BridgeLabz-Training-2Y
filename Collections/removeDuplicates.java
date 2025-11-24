package Collections;
import java.util.*;
public class removeDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,1,2,2,3,4);
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for(int x : list){
            if(!seen.contains(x)){
                seen.add(x);
                result.add(x);
            }
        }
        System.out.println(result);
    }
}
