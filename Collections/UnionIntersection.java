package Collections;
import java.util.*;
public class UnionIntersection {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,4,5));

        Set<Integer> union = new HashSet<>(s1);
        union.addAll(s2);

        Set<Integer> inter = new HashSet<>(s1);
        inter.retainAll(s2);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + inter);
    }
}
