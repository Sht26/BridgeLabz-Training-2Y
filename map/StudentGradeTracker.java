package map;
import java.util.*;
public class StudentGradeTracker {
    public static void main(String[] args) {
        TreeMap<String,Double> grades = new TreeMap<>();
        grades.put("Amit",85.0);
        grades.put("Riya",92.0);
        grades.put("Neha",78.0);
        grades.put("Neha",88.0);
        grades.remove("Amit");
        for(String s : grades.keySet()){
            System.out.println(s + " : " + grades.get(s));
        }
    }
}
