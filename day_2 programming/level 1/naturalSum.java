package loops;
import java.util.*;
public class naturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1) {
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formula = n * (n + 1) / 2;
            System.out.println("While loop sum = " + sum);
            System.out.println("Formula sum = " + formula);
            System.out.println("Both are equal? " + (sum == formula));
        } else {
            System.out.println("Not a natural number");
        }
        sc.close();
    }
}
