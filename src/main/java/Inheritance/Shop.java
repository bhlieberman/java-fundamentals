package Inheritance;

import java.time.LocalDate;

public class Shop extends Business {

    public static class ShopReview extends Review {
        ShopReview(String itemsBought) {
            super("", itemsBought, "Ben Lieberman", 3);
        }
    }
    public Shop(String name, String description, String price) {
        super(name, description, price);
    }

    public void addReview(String itemsBought, LocalDate dateVisited) {
        Review srv = new ShopReview(itemsBought);
        super.addReview(srv, dateVisited);
    }
}
