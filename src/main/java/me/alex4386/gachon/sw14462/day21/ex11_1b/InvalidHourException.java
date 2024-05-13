package me.alex4386.gachon.sw14462.day21.ex11_1b;

import me.alex4386.gachon.sw14462.day21.ex11_1a.InvalidTimeException;

public class InvalidHourException extends InvalidTimeException {
    public InvalidHourException() {
        this("Invalid Hour Range");
    }

    public InvalidHourException(String message) {
        super(message);
    }
}
