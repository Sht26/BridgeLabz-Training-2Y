package map;
import java.util.*;
public class MergeMaps {
    public static void main(String[] args) {
        Map<String,Integer> m1 = new HashMap<>();
        m1.put("A",1); m1.put("B",2);

        Map<String,Integer> m2 = new HashMap<>();
        m2.put("B",3); m2.put("C",4);

        Map<String,Integer> result = new HashMap<>(m1);

        for(String k : m2.keySet()){
            result.put(k, result.getOrDefault(k,0) + m2.get(k));
        }

        System.out.println(result);
    }
}
