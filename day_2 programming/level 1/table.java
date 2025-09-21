package loops;
import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (6-9): ");
        int number = sc.nextInt();
        for (int i = number; i <= number; i++) {    
        	System.out.println("Table of "+i);
            for (int j = 1; j <= 10; j++) {       
                System.out.println(i + " X " + j + " = " + (i * j));
            }
        }
        sc.close();
    }
}
