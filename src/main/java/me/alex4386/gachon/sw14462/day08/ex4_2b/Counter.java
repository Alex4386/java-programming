package me.alex4386.gachon.sw14462.day08.ex4_2b;

public class Counter {
    private int count = 0;

    public void resetCounter() {
        this.count = 0;
    }

    public void increase() {
        count++;
    }

    public void decrease() {
        if (count <= 0) {
            throw new RuntimeException("Count cannot be negative");
        }
        count--;
    }

    public int getCount() {
        return count;
    }


}
