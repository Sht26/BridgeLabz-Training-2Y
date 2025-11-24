package Collections;
import java.util.*;
public class reverseList2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        for(int i=0, j=list.size()-1; i<j; i++, j--){
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
        System.out.println(list);
    }
}
