package map;
import java.util.*;
public class InvertMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1); map.put("B",2); map.put("C",1);

        Map<Integer, List<String>> inverted = new HashMap<>();

        for(String key : map.keySet()){
            int val = map.get(key);
            inverted.putIfAbsent(val, new ArrayList<>());
            inverted.get(val).add(key);
        }

        System.out.println(inverted);
    }
}
