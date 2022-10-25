import Arrays.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayTest {
    @Test
    void testDiceRoll() {
        int n = 3;
        var rolls = Main.roll(n);
        assertEquals(rolls.size(), n);
    }

    @Test
    void testContainDuplicates() {
        int[] arr = {1,1,2,3}; //
        assertTrue(Main.containsDuplicates(arr));
    }

    @Test
    void testComputeAverage() {
        int[] arr = {1,2,3,4,5,6};
        assertEquals(Main.computeAverage(arr), 3.5);
    }

    @Test
    void testComputeAverageOfEmptyArray() {
        int[] arr = {};
        assertEquals(Main.computeAverage(arr), 0.0);
    }

    @Test
    void testGetLowestAverage() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertEquals(Main.lowestAverage(weeklyMonthTemperatures), "[65, 56, 55, 52, 55, 62, 57]");
    }
}
