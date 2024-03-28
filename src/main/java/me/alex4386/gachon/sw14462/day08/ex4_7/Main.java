package me.alex4386.gachon.sw14462.day08.ex4_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BasketBallGame game = new BasketBallGame();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a score:");
            String line = scanner.nextLine();

            String[] thisArgs = line.split(" ");

            char team = thisArgs[0].charAt(0);
            int score;
            try {
                score = Integer.parseInt(thisArgs[1], 10);
                if (score > 3 || score <= 0) {
                    System.err.println("Invalid input!");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid input!");
                continue;
            }

            int teamIdx = 0;
            switch (team) {
                case 'A':
                case 'a':
                    teamIdx = 1;
                    break;
                case 'B':
                case 'b':
                    teamIdx = 2;
                    break;
            }

            if (teamIdx > 0) {
                addScore(game, teamIdx, score);
            }


        }
    }

    public static void addScore(BasketBallGame game, int teamIdx, int score) {
        switch (score) {
            case 1:
                game.addTeam1Point(teamIdx);
                break;
            case 2:
                game.addTeam2Point(teamIdx);
                break;
            case 3:
                game.addTeam3Point(teamIdx);
                break;
        }
    }
}
