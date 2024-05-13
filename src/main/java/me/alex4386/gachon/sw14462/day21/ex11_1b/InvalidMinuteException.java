package me.alex4386.gachon.sw14462.day21.ex11_1b;

import me.alex4386.gachon.sw14462.day21.ex11_1a.InvalidTimeException;

public class InvalidMinuteException extends InvalidTimeException {
    public InvalidMinuteException() {
        this("Invalid Minute Range");
    }

    public InvalidMinuteException(String message) {
        super(message);
    }
}
