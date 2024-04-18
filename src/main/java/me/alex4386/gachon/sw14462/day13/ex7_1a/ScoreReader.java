package me.alex4386.gachon.sw14462.day13.ex7_1a;

public class ScoreReader {
    private int[] scores;
    private int currentIdx;

    public ScoreReader(int size) {
        this.scores = new int[size];
        this.currentIdx = 0;
    }

    public void addScore(int score) {
        if (this.currentIdx >= this.scores.length) {
            System.out.println("Scores are full");
            return;
        }

        this.scores[this.currentIdx] = score;
        this.currentIdx++;
    }

    public double getAverage() {
        double sum = 0;
        for (int i = 0; i < this.currentIdx; i++) {
            sum += this.scores[i];
        }

        return sum / this.currentIdx;
    }

    public int[] getScoresAboveAverage() {
        double average = this.getAverage();

        int size = 0;
        for (int i = 0; i < this.currentIdx; i++) {
            if (this.scores[i] > average) {
                size++;
            }
        }

        int[] data = new int[size];
        for (int i = 0, j = 0; i < this.currentIdx; i++) {
            if (this.scores[i] > average) {
                data[j] = this.scores[i];
                j++;
            }
        }

        return data;
    }
}
