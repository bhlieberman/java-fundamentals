package Inheritance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Business {
    private final String name;
    private final String description;
    private final String price;

    private double aggregate = 0.0;

    private final ArrayList<Integer> stars = new ArrayList<>();
    private final HashMap<LocalDate, ArrayList<Review>> reviews = new HashMap<>();
    Business(String name, String description, String price) {
        this.name = name;
        this.description = description;
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
        this.stars.add(stars);
        this.aggregate = (double) this.stars.stream()
                .reduce(0, Integer::sum) / this.stars.size();
    }

    @Override
    public String toString() {
        return this.name + " has a " + this.price + " price score";
    }

    public double getAggregate() {
        return aggregate;
    }

    public String getName() {
        return name;
    }

    public HashMap<LocalDate, ArrayList<Review>> getReviews() {
        return reviews;
    }
}
