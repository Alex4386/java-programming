package me.alex4386.gachon.sw14462.day03.coins;

public class CoinImpl {
    String name;
    int value;

    public CoinImpl(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public int reduceFrom(int amount) {
        return amount - this.value;
    }

    public boolean isPayable(int amount) {
        return amount >= this.value;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
