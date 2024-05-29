package me.alex4386.gachon.sw14462.day25.ex14_1b;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreReaderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ScoreReader scoreReader = new ScoreReader();

        int i = 0;
        while (true) {
            System.out.print("Enter the score of student " + (i + 1) + " (Enter -1 to stop) : ");
            int score = scanner.nextInt();
            if (score < 0) break;

            scoreReader.addScore(score);
            i++;
        }

        System.out.println("Average score: " + scoreReader.getAverage());
        List<Integer> scoresAboveAverage = scoreReader.getScoresAboveAverage();
        System.out.print("Scores above average: ");
        printIterable(scoresAboveAverage);

        System.out.println();
    }

    public static <U, T extends Iterable<U>> void printIterable(T iter) {
        boolean first = true;
        for (Object item : iter) {
            if (!first) System.out.print(", ");
            first = false;
            System.out.print(item);
        }
        System.out.println();
    }
}
