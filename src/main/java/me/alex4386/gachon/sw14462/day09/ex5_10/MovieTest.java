package me.alex4386.gachon.sw14462.day09.ex5_10;

public class MovieTest {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setName("The Lion King");
        movie1.setMPAARating(MovieMPAARating.G);
        movie1.addRating(5);

        Movie movie2 = new Movie();
        movie2.setName("The Lion King");
        movie2.setMPAARating(MovieMPAARating.G);
        movie2.addRating(5);

        Movie movie3 = new Movie();
        movie3.setName("Finding Nemo");
        movie3.setMPAARating(MovieMPAARating.G);
        movie3.addRating(4);

        System.out.println("Comparing movie1 and movie2 (both are \"The Lion King\"): " + movie1.equals(movie2));
        System.out.println("Comparing movie1 and movie3 (\"The Lion King\" and \"Finding Nemo\"): " + movie1.equals(movie3));
    }
}
