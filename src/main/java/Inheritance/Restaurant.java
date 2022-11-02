package Inheritance;

import java.time.LocalDate;

public class Restaurant extends Business {

    private static class RestaurantReview extends Review {
        RestaurantReview(String rName, String dishesEaten) {
            super(rName, dishesEaten, "Ben Lieberman", 4);
        }
    }
    public Restaurant(String name, int stars, String price) {
        super(name, "", price);
    }
    public void addReview(LocalDate dateVisited) {
        Review rrv = new RestaurantReview(this.getName(), "foie gras");
        super.addReview(rrv, dateVisited);
    }
}
