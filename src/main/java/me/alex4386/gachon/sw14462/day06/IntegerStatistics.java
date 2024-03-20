package me.alex4386.gachon.sw14462.day06;

public class IntegerStatistics {
    long total;
    int count;

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    boolean finalized = false;

    public IntegerStatistics() {
        total = 0;
        count = 0;
    }

    public boolean add(int value) {
        if (finalized) return true;

        if (value < 0) {
            this.finalized = true;
            return true;
        }

        if (value < min) min = value;
        if (value > max) max = value;

        total += value;
        count++;

        return false;
    }

    public boolean hasFinalized() {
        return this.finalized;
    }

    public int getMin() {
        return this.min;
    }

    public int getMax() {
        return this.max;
    }

    public int getCount() {
        return this.count;
    }

    public double getAverage() {
        return ((double) total) / count;
    }
}
