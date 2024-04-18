package me.alex4386.gachon.sw14462.day14.ex7_6;

import java.util.Scanner;

public class TicTacToeUI {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner stdin = new Scanner(System.in);

        while (true) {
            game.displayBoard();
            if (game.hasWinner()) {
                System.out.println("Player " + game.getCurrentPlayer() + " wins!");
                break;
            } else if (game.isFull()) {
                System.out.println("It's a draw!");
                break;
            }

            System.out.print("Enter row and column (0-2) seperated by space for player " + game.getCurrentPlayer() + ": ");

            int row = stdin.nextInt();
            int col = stdin.nextInt();

            try {
                game.addMove(row, col);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
