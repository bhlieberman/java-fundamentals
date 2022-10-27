import org.junit.jupiter.api.Test;

import Linter.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherTest {
    @Test
    void testWeather() {
        int[][] forecast = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String output = Main.weather(forecast);
        assertEquals("""
                High: 72
                Low: 51
                Never saw temperature: 67
                Never saw temperature: 68
                Never saw temperature: 69
                Never saw temperature: 63
                """, output);
    }
}
