package Inheritance;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.HashMap;

public class Restaurant {
    public String name;
    public ArrayList<Integer> stars;
    public double aggregate;
    public String price;

    private final HashMap<LocalDate, ArrayList<Review>> reviews = new HashMap<>();

    public Restaurant(String name, int stars, String price) {
        this.name = name;
        this.stars = new ArrayList<>();
        this.price = price;
    }

    public void addReview(Review rv, LocalDate dateVisited) {
        ArrayList<Review> currentReviews = this.reviews.getOrDefault(dateVisited, new ArrayList<>());
        boolean alreadyReviewed = currentReviews.stream().anyMatch((v) -> v.author.equals(rv.author));
        if (!alreadyReviewed) {
            updateAggregate(rv.stars);
            currentReviews.add(rv);
            this.reviews.put(dateVisited, currentReviews);
        }
    }

    private void updateAggregate(int stars) {
        this.aggregate = 0;
        this.stars.add(stars);
        for (int star : this.stars) this.aggregate += star;
        this.aggregate /= this.stars.size();
    }

    @Override
    public String toString() {
        return this.name + " has a " + this.stars  + " star rating";
    }

    public HashMap<LocalDate, ArrayList<Review>> getReviews() {
        return this.reviews;
    }
}
