package me.alex4386.gachon.sw14462.day21.ex11_1a;

import me.alex4386.gachon.sw14462.day02.InvalidRangeException;

public class InvalidTimeException extends Exception {
    public InvalidTimeException() {
        this("Invalid Time Range");
    }

    public InvalidTimeException(String message) {
        super(message);
    }
}
