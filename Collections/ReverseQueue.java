package Collections;
import java.util.*;
public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10,20,30));
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()) s.push(q.remove());
        while(!s.isEmpty()) q.add(s.pop());

        System.out.println(q);
    }
}
