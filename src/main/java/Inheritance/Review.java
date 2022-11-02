package Inheritance;

public class Review {
    public String body;
    public String businessName;
    public String author;
    public int stars;
    public Review(String businessName, String body, String author, int stars) {
        this.body = body;
        this.businessName = businessName;
        this.author = author;
        this.stars = stars;
    }

    @Override
    public String toString() {
        return this.author + " gave a " + this.stars + " star rating";
    }
}
