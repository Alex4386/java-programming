package me.alex4386.gachon.sw14462.day20.ex10_1a;

public class RightTriangle extends Shape {
    private double width;
    private double height;

    public RightTriangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height / 2;
    }

    @Override
    public String toString() {
        return "RightTriangle: width=" + width + ", height=" + height;
    }

    public boolean equals(RightTriangle obj) {
        return this.width == obj.width && this.height == obj.height;
    }
}
