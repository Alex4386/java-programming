package me.alex4386.gachon.sw14462.day09.ex5_10;

public class Movie {
    private String name;
    private MovieMPAARating rating;

    private int usersRatedTerrible;
    private int usersRatedBad;
    private int usersRatedOK;
    private int usersRatedGood;
    private int usersRatedGreat;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MovieMPAARating getMPAARating() {
        return this.rating;
    }

    public void setMPAARating(MovieMPAARating rating) {
        this.rating = rating;
    }

    public void addRating(int rating) {
        switch (rating) {
            case 1:
                this.usersRatedTerrible++;
                break;
            case 2:
                this.usersRatedBad++;
                break;
            case 3:
                this.usersRatedOK++;
                break;
            case 4:
                this.usersRatedGood++;
                break;
            case 5:
                this.usersRatedGreat++;
                break;
            default:
                break;
        }
    }

    public double getAverage() {
        return (double) (
            (this.usersRatedTerrible * 1) +
            (this.usersRatedBad * 2) +
            (this.usersRatedOK * 3) +
            (this.usersRatedGood * 4) +
            (this.usersRatedGreat * 5)
        ) / (
            this.usersRatedTerrible +
            this.usersRatedBad +
            this.usersRatedOK +
            this.usersRatedGood +
            this.usersRatedGreat
        );
    }

    // TODO: Implement equals method and test it.
    public boolean equals(Movie movie) {
        return
            this.name.equals(movie.getName()) &&
            this.rating.equals(movie.getMPAARating()) &&
            this.usersRatedTerrible == movie.usersRatedTerrible &&
            this.usersRatedBad == movie.usersRatedBad &&
            this.usersRatedOK == movie.usersRatedOK &&
            this.usersRatedGood == movie.usersRatedGood &&
            this.usersRatedGreat == movie.usersRatedGreat;
    }
}

enum MovieMPAARating {
    G(1), PG(2), PG13(3), R(4), NC17(5);

    private final int ratingId;
    MovieMPAARating(int ratingId) {
        this.ratingId = ratingId;
    }

    public int getRatingId() {
        return this.ratingId;
    }
}

