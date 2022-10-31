package Inheritance;

public class Restaurant {
    public String name;
    public int stars;
    public String price;

    public Restaurant(String name, int stars, String price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + " has a " + this.stars  + " star rating";
    }
}
