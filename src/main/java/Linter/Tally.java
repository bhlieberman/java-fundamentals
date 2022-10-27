package Linter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Tally {
    public static void main(String[] args) {
        ArrayList<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        System.out.println(tally(votes) + " got the most votes");
    }
    public static String tally(ArrayList<String> votes) {
        var uniqueVotes = new HashMap<String, Integer>();
        for (String word : votes) {
            var vl = uniqueVotes.putIfAbsent(word, 1);
            if (vl != null) {
                uniqueVotes.replace(word, vl + 1);
            }
        }
        // I got this from Stack Overflow
        return Collections.max(uniqueVotes.entrySet(), Map.Entry.comparingByValue()).getKey();

    }
}
