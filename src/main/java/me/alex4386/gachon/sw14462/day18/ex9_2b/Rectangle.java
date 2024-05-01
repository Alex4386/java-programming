package me.alex4386.gachon.sw14462.day18.ex9_2b;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle: width=" + width + ", height=" + height;
    }

    public boolean equals(Rectangle obj) {
        return this.width == obj.width && this.height == obj.height;
    }
}
