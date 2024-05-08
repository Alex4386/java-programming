package me.alex4386.gachon.sw14462.day20.ex10_1b;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle(10, 20);
        shapes[1] = new Circle(10);
        shapes[2] = new RightTriangle(10, 20);
        shapes[3] = new Circle(6);

        for (Shape s : shapes) {
            System.out.println(s);
            System.out.println("Area: " + s.getArea());
            System.out.println();
        }
    }
}
