package me.alex4386.gachon.sw14462.day08.ex4_2b;

public class CounterTest {
    public static void main(String[] args) {
        Counter counter = new Counter();

        System.out.println("Increasing twice");
        counter.increase();
        counter.increase();

        assert counter.getCount() == 2;

        System.out.println("Decreasing once");
        counter.decrease();

        assert counter.getCount() == 1;

        System.out.println("Resetting counter");
        counter.resetCounter();

        assert counter.getCount() == 0;

        System.out.println("Test complete.");
    }
}
