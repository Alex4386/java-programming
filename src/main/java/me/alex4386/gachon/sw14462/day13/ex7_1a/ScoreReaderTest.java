package me.alex4386.gachon.sw14462.day13.ex7_1a;

import java.util.Scanner;

public class ScoreReaderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int studentCount = scanner.nextInt();

        if (studentCount <= 0) {
            System.out.println("Invalid number of students");
            return;
        }

        ScoreReader scoreReader = new ScoreReader(studentCount);
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Enter the score of student " + (i + 1) + ": ");
            int score = scanner.nextInt();
            scoreReader.addScore(score);
        }

        System.out.println("Average score: " + scoreReader.getAverage());
        int[] scoresAboveAverage = scoreReader.getScoresAboveAverage();
        System.out.print("Scores above average: ");
        for (int i = 0; i < scoresAboveAverage.length; i++) {
            System.out.print(scoresAboveAverage[i] + " ");
        }
        System.out.println();
    }
}
