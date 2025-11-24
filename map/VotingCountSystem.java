package map;
import java.util.*;
public class VotingCountSystem {
    public static void main(String[] args) {
        HashMap<String,Integer> votes = new HashMap<>();

        String[] castVotes = {"A","B","A","C","A","B","C","A","B","A"};

        for(String v : castVotes){
            votes.put(v, votes.getOrDefault(v,0)+1);
        }

        String winner = null;
        int max = 0;

        for(String c : votes.keySet()){
            if(votes.get(c) > max){
                max = votes.get(c);
                winner = c;
            }
        }

        System.out.println("Winner: " + winner);
        System.out.println(votes);
    }
}
