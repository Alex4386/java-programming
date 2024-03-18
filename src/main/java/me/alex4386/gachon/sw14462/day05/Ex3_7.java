package me.alex4386.gachon.sw14462.day05;

import java.util.Scanner;

public class Ex3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial velocity of the ball: ");
        double velocity = scanner.nextDouble();

        BouncingBall ball = new BouncingBall(velocity);
        int bounceCount = 0;

        while (true) {
            System.out.println(ball);
            boolean hasBounced = ball.nextTimestep();
            if (hasBounced) {
                System.out.println("Bounce!");
                bounceCount++;
                if (bounceCount >= 5) break;
            }
        }
    }
}
