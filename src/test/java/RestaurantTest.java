import Inheritance.Restaurant;

import org.junit.jupiter.api.Test;

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
}
