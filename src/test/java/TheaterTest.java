import Inheritance.Theater;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class TheaterTest {

    @Test
    void testAddMovie() {
        Theater th = new Theater("The Guild", "A one screen masterpiece", "$", new ArrayList<>());
        th.addMovie("Rabid");
        ArrayList<String> test = new ArrayList<>();
        test.add("Rabid");
        assertIterableEquals(th.getMoviesShowing(), test);
    }

    @Test
    void testRemoveMovie() {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Rabid");
        movies.add("Apocalypse Now");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Apocalypse Now");
        Theater th = new Theater("Film Forum", "Best independent cinema in NYC", "$$", movies);
        th.removeMovie("Rabid");
        assertIterableEquals(expected, th.getMoviesShowing());
    }
}
