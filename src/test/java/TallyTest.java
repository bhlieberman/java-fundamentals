import org.junit.jupiter.api.Test;

import Linter.Tally;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TallyTest {
    @Test
    void testTally() {
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
        assertEquals("Bush", Tally.tally(votes));
    }
}
