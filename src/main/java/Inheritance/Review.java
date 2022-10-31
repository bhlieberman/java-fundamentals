package Inheritance;

public class Review {
    public String body;
    public String restaurantName;
    public String author;
    public int stars;
    public Review(String restaurantName, String body, String author, int stars) {
        this.body = body;
        this.restaurantName = restaurantName;
        this.author = author;
        this.stars = stars;
    }

    @Override
    public String toString() {
        return this.author + " gave a " + this.stars + " star rating";
    }
}
