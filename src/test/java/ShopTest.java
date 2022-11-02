import Inheritance.Review;
import Inheritance.Shop;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTest {

    @Test
    void testAddReviewAsAbstract() {
        Shop shop = new Shop("Ben's Shoes", "A shoestore", "$$");
        shop.addReview(new Review(shop.getName(), "Awesome", "Ben Lieberman", 5), LocalDate.now());
        assert(shop.getReviews().size() == 1);
    }

    @Test
    void testUpdateAggAsAbstract() {
        Shop shop = new Shop("Ben's Shoes", "A shoestore", "$$");
        shop.addReview(new Review(shop.getName(), "Awesome", "Ben Lieberman", 5), LocalDate.now());
        assertEquals(5.0, shop.getAggregate());
    }

    @Test
    void testShopReview() {
        Shop shop = new Shop("Rust Is Gold Coffee", "A coffee shop", "$$");
        shop.addReview("A decaf latte", LocalDate.now());
        Review rv = shop.getReviews()
                .get(LocalDate.now())
                .get(0);
        assertEquals(rv.getClass(), Shop.ShopReview.class);
    }
}
