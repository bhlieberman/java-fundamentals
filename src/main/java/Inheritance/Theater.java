package Inheritance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Theater extends Business {
    private static String name;

    private static class MovieReview extends Review {
        MovieReview(String movieName) {
            super(movieName, "about the movie", "Ben Lieberman", 5);
        }
    }
    private final ArrayList<String> moviesShowing = new ArrayList<>();
    public Theater(String name, String desc, String price, List<String> moviesShowing) {
        super(name, desc, price);
        this.moviesShowing.addAll(moviesShowing);
    }

    public void addMovie(String movie) {
        this.moviesShowing.add(movie);
    }

    public void removeMovie(String movie) {
        this.moviesShowing.remove(movie);
    }

    public void addReview(String movie, LocalDate dateVisited) {
        Review mrv = new MovieReview(movie);
        super.addReview(mrv, dateVisited);
    }

    public ArrayList<String> getMoviesShowing() {
        return moviesShowing;
    }
}
