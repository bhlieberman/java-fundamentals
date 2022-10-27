import org.junit.jupiter.api.Test;

import Linter.Linter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class LinterTest {

    @Test
    void testLinter() {
        File correct = new File("src/main/resources/correct.js");
        File oneWrong = new File("src/main/resources/oneWrong.js");
        try {
            FileInputStream fsc = new FileInputStream(correct);
            ArrayList<Integer> expected = new ArrayList<>();
            assertIterableEquals(expected, Linter.linter(fsc));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            FileInputStream fsow = new FileInputStream(oneWrong);
            ArrayList<Integer> expected = new ArrayList<>();
            expected.add(2);
            assertIterableEquals(expected, Linter.linter(fsow));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
