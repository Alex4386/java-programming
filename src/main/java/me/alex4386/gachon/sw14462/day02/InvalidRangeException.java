package me.alex4386.gachon.sw14462.day02;

public class InvalidRangeException extends Exception {
    public InvalidRangeException() {
        super("The provided range is invalid");
    }
}
