package me.alex4386.gachon.sw14462.day25.ex14_1b;

import java.util.ArrayList;
import java.util.List;

public class ScoreReader {

    private ArrayList<Integer> scores = new ArrayList<Integer>();

    public ScoreReader() {
    }

    public void addScore(int score) {
        this.scores.add(score);
    }

    public double getAverage() {
        double sum = 0;
        for (Integer score : this.scores) {
            sum += score;
        }

        return sum / this.scores.size();
    }

    public List<Integer> getScoresAboveAverage() {
        double average = this.getAverage();

        List<Integer> data = new ArrayList<Integer>();
        for (Integer score : this.scores) {
            if (score > average) {
                data.add(score);
            }
        }

        return data;
    }
}

