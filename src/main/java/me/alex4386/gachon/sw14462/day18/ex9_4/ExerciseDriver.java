package me.alex4386.gachon.sw14462.day18.ex9_4;

public class ExerciseDriver {
    public static void main() {
        RightTriangleInterface triangle = new RightTriangle();
        triangle.set(5, 10);

        Rectangle rectangle = new Rectangle();
        rectangle.set(5, 10);

        Square square = new Square(5);

        System.out.println("triangle (5, 10)");
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.print("Draw triangle:");
        triangle.drawAt(1);

        System.out.println("rectangle (5, 10)");
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.print("Draw rectangle:");
        rectangle.drawAt(1);

        System.out.println("square (5)");
        System.out.println("Square area: " + square.getArea());
        System.out.print("Draw square:");
        square.drawAt(1);
    }
}
