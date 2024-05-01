package me.alex4386.gachon.sw14462.day18.ex9_4;

public class Rectangle extends ShapeBasics implements RectangleInterface
{
    private int height;
    private int width;

    public void set(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void drawHere() {
        super.drawHere();
        // the first * is already printed.
        for (int i = 1; i < this.width; i++) {
            System.out.print("*");
        }
        System.out.println();

        // for the other lines, print * and spaces for offsets.
        for (int i = 1; i < this.height - 1; i++) {
            this.drawOffset();
            System.out.print("*");
            for (int j = 1; j < this.width - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < this.width; i++) {
            System.out.print("*");
        }

        System.out.println();
    }

    public void drawOffset() {
        for (int i = 0; i < this.getOffset(); i++) {
            System.out.print(" ");
        }
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getCircumference() {
        return 2 * (this.height + this.width);
    }
}
