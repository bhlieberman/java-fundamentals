package Linter;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[][] forecast = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println(weather(forecast));
    }

    private static String weather(int[][] forecast) {
        var nums = Arrays.stream(forecast)
                .flatMapToInt(Arrays::stream)
                .distinct()
                .iterator();
        var min = Arrays.stream(forecast).flatMapToInt(Arrays::stream).min().orElse(0);
        var max = Arrays.stream(forecast).flatMapToInt(Arrays::stream).max().orElse(0);
        var all = IntStream.rangeClosed(51,72).iterator();
        var setAll = new HashSet<>();
        var setMin = new HashSet<>();
        while (all.hasNext()) {
            setAll.add(all.next());
        }
        while (nums.hasNext()) {
            setMin.add(nums.next());
        }
        setAll.removeAll(setMin);
        var outString = new StringBuilder();
        outString.append("High: " + max + "\n");
        outString.append("Low: " + min + "\n");
        for (Object i : setAll) {
            outString.append("Never saw temperature: " + i + "\n");
        }
        return outString.toString();

    }
}
