package me.alex4386.gachon.sw14462.day18.ex9_2b;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return "Circle: radius=" + radius;
    }

    public boolean equals(Circle obj) {
        return this.radius == obj.radius;
    }
}
