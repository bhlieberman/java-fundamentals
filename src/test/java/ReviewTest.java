import Inheritance.Review;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewTest {
    @Test
    void testReview() {
        Review rv = new Review("Sonic", "This restaurants sucks", "Ben Lieberman", 1);
        assertEquals(rv.stars, 1);
    }

    @Test
    void testToString() {
        Review rv = new Review("Lime", "Best food in town", "Ben Lieberman", 5);
        assertEquals( "Ben Lieberman gave a 5 star rating", rv.toString());
    }
}
