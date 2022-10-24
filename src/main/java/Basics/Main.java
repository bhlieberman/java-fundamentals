package Basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println(pluralize("dog", 3));
        flipNHeads(5);
        clock();
    }

    private static String pluralize(String word, int num) {
        String sentence = "I own " + num + " " + word;
        return (num > 1 || num == 0) ? sentence + "s." : sentence;
    }

    private static void flipNHeads(int n) {
        int flips = 0;
        int heads = 0;
        while (heads < n) {
            double flip = Math.random();
            if (flip >= 0.5) {
                System.out.println("HEADS");
                heads++;
            } else {
                heads = 0;
                System.out.println("TAILS");
            }
            flips++;
        }
        System.out.println("It took " + flips + " flips to flip " + heads + " heads in a row.");
    }

    private static void clock() {
        String time = "";
        String current = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        while (true) {
            if (!time.equals(current)) {
                time = current;
                System.out.println(time);
            }
            current = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        }
    }
}
