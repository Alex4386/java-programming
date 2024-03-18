package me.alex4386.gachon.sw14462.day05;

public class BouncingBall {
    double height;
    double velocity;
    int currentTimestep = 0;

    public BouncingBall(double velocity) {
        this(0, velocity);
    }

    public BouncingBall(double height, double velocity) {
        this.height = height;
        this.velocity = velocity;
    }

    public boolean nextTimestep() {
        // At time zero, the ball begins at height zero and has an initial velocity supplied by the user.
        if (currentTimestep > 0) {
            velocity -= 32;
        }

        height += velocity;
        currentTimestep++;

        if (height < 0) {
            this.bounce();
            return true;
        }

        return false;
    }

    public void bounce() {
        this.height *= -0.5;
        this.velocity *= -0.5;
    }

    @Override
    public String toString() {
        return "Time: "+currentTimestep+" Height: "+height;
    }
}
