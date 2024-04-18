package me.alex4386.gachon.sw14462.day14.ex7_6;

public class TicTacToe {
    public static char[] availablePlayers = {'X', 'O'};
    private int turnIdx = 0;
    private char[][] board = new char[3][3];
    private boolean ended = false;


    public TicTacToe() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = 0;
            }
        }
    }

    public void addMove(int x, int y) {
        if (this.ended) {
            throw new IllegalStateException("Game has ended");
        }

        if (x < 0 || x >= 3 || y < 0 || y >= 3) {
            throw new IllegalArgumentException("Invalid position");
        }

        if (this.board[x][y] != 0) {
            throw new IllegalArgumentException("Position already taken");
        }

        this.board[x][y] = this.getCurrentPlayer();
        if (this.hasWinner()) {
            this.ended = true;
            return;
        }

        System.out.println("[DEBUG] Increment turnIdx");
        this.turnIdx++;
    }

    public char getCurrentPlayer() {
        return availablePlayers[this.turnIdx % 2];
    }

    public boolean isFull() {
        return this.turnIdx >= 9;
    }

    public boolean hasWinner() {
        // each player has at least 3 turns to win, so if user only took 2 turns, there is no winner
        if (this.turnIdx < 4) {
            return false;
        }

        for (int i = 0; i < 3; i++) {
            // -
            if (this.board[i][0] != 0 && this.board[i][0] == this.board[i][1] && this.board[i][1] == this.board[i][2]) {
                return true;
            }

            // |
            if (this.board[0][i] != 0 && this.board[0][i] == this.board[1][i] && this.board[1][i] == this.board[2][i]) {
                return true;
            }
        }

        // \
        if (this.board[0][0] != 0 && this.board[0][0] == this.board[1][1] && this.board[1][1] == this.board[2][2]) {
            return true;
        }

        // /
        if (this.board[0][2] != 0 && this.board[0][2] == this.board[1][1] && this.board[1][1] == this.board[2][0]) {
            return true;
        }

        return false;
    }

    public char getWinner() {
        if (this.hasWinner()) {
            return this.getCurrentPlayer();
        }
        return 0;
    }

    public void reset() {
        this.turnIdx = 0;
        this.ended = false;
        this.resetBoard();
    }

    private void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = 0;
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                char player = board[i][j];
                if (player == 0) {
                    player = ' ';
                }

                System.out.print(player + " | ");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }
}
