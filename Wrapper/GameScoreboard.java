package Wrapper;
public class GameScoreboard {
    public static void main(String[] args) {

        Integer[] scores = {10, null, 20, 5, null, 7};

        int notPlayed = 0;
        int total = 0;

        for (Integer s : scores) {
            if (s == null) notPlayed++;
            else total += s; // auto-unboxing
        }

        System.out.println("Players not played: " + notPlayed);
        System.out.println("Total score: " + total);
    }
}
