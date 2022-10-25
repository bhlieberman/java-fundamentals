package Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {}

    public static ArrayList<Integer> roll(int n) {
        int[] dice = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int randIdx = (int) Math.ceil(Math.random() * 6);
            rolls.add(dice[randIdx]);
        }
        return rolls;
    }

    public static Boolean containsDuplicates(int[] arr) {
        HashMap<Integer, Integer> freqTable = new HashMap<>();
        for (int j : arr) {
            if (freqTable.putIfAbsent(j, 1) != null) {
                return true;
            }
        }
        return false;
    }

    public static double computeAverage(int[] arr) {
        return Arrays.stream(arr).average().orElse(0.0);
    }

    public static String lowestAverage(int[][] arr) {
        ArrayList<Float> averages = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            float rowAvg = (float) rowSum / arr[i].length;
            averages.add(i, rowAvg);
        }
        var min = averages.get(0);
        int idx = 0;
        for (int i = 0; i < averages.size(); i++) {
            float avg = averages.get(i);
            if (avg < min) min = avg; idx = i;
        }
        return Arrays.toString(arr[idx]);
    }
}
