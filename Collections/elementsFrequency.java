package Collections;
import java.util.*;
public class elementsFrequency {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","apple","orange");
        Map<String,Integer> map = new HashMap<>();
        for(String s : list){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        System.out.println(map);
    }
}
