package me.alex4386.gachon.sw14462.day11.ex6_4;

import java.util.Scanner;

public class Characteristic {

    private String description;
    private int rating;

    public Characteristic(String description) {
        this.description = description;
        this.rating = 0;
    }

    private boolean isValid(int aRating) {
        // range check
        return aRating >= 1 && aRating <= 10;
    }

    public void setRating(int aRating) {
        if (this.isValid(aRating)) {
            this.rating = aRating;
        } else {
            throw new IllegalArgumentException("Invalid rating");
        }
    }

    public void setRating() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Characteristic: "+this.description);
        System.out.print("Enter a rating: ");
        int aRating = scanner.nextInt();

        try {
            this.setRating(aRating);
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid Rating! Please enter a rating between 1 and 10.");
        }
    }


    public String getDescription() {
        return this.description;
    }

    public int getRating() {
        return this.rating;
    }

    private double getCompatibilityMeasure(Characteristic otherRating) {
        // early return to catch if it hasn't rated yet.
        if (this.rating == 0 || otherRating.rating == 0) {
            return 0.0;
        }

        return 1.0 - (Math.pow(this.rating - otherRating.rating, 2) / 81.0);
    }

    private boolean isMatch(Characteristic otherRating) {
        return this.description.equals(otherRating.description);
    }

    public double getCompatibility(Characteristic otherRating) {
        return this.isMatch(otherRating) ?
                this.getCompatibilityMeasure(otherRating) :
                0.0;
    }
}
