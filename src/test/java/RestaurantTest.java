import Inheritance.Restaurant;

import Inheritance.Review;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestaurantTest {
    @Test
    void testNewRestaurant() {
        Restaurant rt = new Restaurant("Ramen Ishida", 5, "$$");
        assertEquals(rt.name, "Ramen Ishida");
    }
    @Test
    void testRestaurantToString() {
        Restaurant rt = new Restaurant("North Dumpling", 5, "$");
        assertEquals(rt.toString(), "North Dumpling has a 5 star rating");
    }

    @Test
    void testAddReviewIfNotExists() {
        Restaurant rt = new Restaurant("North Dumpling", 5, "$");
        rt.addReview(new Review(rt.name, "Best dumplings in Chinatown", "Ben Lieberman", 5), LocalDate.now());
        Review dupe = new Review(rt.name, "Best dumplings in Chinatown", "Ben Lieberman", 5);
        assertEquals(rt.getReviews().get(LocalDate.now()).size(), 1);
        rt.addReview(dupe, LocalDate.now());
        assertEquals(rt.getReviews().get(LocalDate.now()).size(), 1);
    }

    @Test
    void testUpdateAggregate() {
        Restaurant rt = new Restaurant("North Dumpling", 0, "$");
        rt.addReview(new Review(rt.name, "Worst dumplings in Chinatown", "A very silly person", 3), LocalDate.now());
        Review dupe = new Review(rt.name, "Best dumplings in Chinatown", "Ben Lieberman", 5);
        rt.addReview(dupe, LocalDate.now());
        assertEquals(4.0, rt.aggregate);
    }
}
