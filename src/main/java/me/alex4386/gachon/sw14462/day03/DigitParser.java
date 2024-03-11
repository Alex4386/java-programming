package me.alex4386.gachon.sw14462.day03;

public class DigitParser {
    protected int integer;
    protected int currentDigitPow;

    public DigitParser(int integer) {
        this.integer = integer;
        this.currentDigitPow = DigitParser.digitPow(integer) - 1;
    }

    public static int digitPow(int integer) {
        return String.valueOf(integer).length();
    }

    public int nextDigit() {
        if (this.currentDigitPow < 0) {
            return -1;
        }

        int digit = (int) ((this.integer / Math.pow(10, this.currentDigitPow)) % 10);
        this.currentDigitPow--;
        return digit;
    }
}
