package me.alex4386.gachon.sw14462.day02;

import java.time.LocalDateTime;

public class AgeCalculator {
    private final int birthYear;

    public AgeCalculator(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() throws NotBornYetException {
        LocalDateTime now = LocalDateTime.now();
        int yr = now.getYear();
        if (yr < this.birthYear) {
            throw new NotBornYetException();
        }

        return now.getYear() - this.birthYear;
    }
}

class NotBornYetException extends Exception {
    public NotBornYetException() {
        super("The requested user have not born yet!");
    }
}
