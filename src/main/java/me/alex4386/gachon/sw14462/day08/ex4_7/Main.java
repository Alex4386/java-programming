package me.alex4386.gachon.sw14462.day08.ex4_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BasketBallGame game = new BasketBallGame();
        game.setTeamNames("Cats", "Dogs");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a score:");
            String line = scanner.nextLine();

            String[] thisArgs = line.split(" ");
            if (thisArgs.length < 2) {
                System.err.println("Invalid input!");
                continue;
            }

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
            } else {
                System.err.println("Invalid input!");
                continue;
            }

            String[] teams = game.getTeamNames();
            int[] scores = game.getTeamScores();
            System.out.print(teams[0]+" "+scores[0]+", "+teams[1]+" "+scores[1]+"; ");

            String winningTeam = game.getWinningTeamName();
            if (winningTeam != null) {
                System.out.println(winningTeam+" are winning.");
            } else {
                System.out.println("Both teams are tied.");
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
