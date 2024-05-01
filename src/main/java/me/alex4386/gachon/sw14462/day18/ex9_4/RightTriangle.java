package me.alex4386.gachon.sw14462.day18.ex9_4;

public class RightTriangle extends ShapeBasics implements RightTriangleInterface
{
    private int height;
    private int width;

    public void set(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public boolean isOnSide(int x, int y) {
        if (x < 0 || y < 0 || x >= this.width || y >= this.height) {
            return false;
        }

        return x == 0 || y == 0 || y == (Math.round((this.height - 1) + (x * -this.height / (double) this.width)));
    }

    @Override
    public void drawHere() {
        super.drawHere();
        // the first * is already printed.
        for (int y = 0; y < this.height; y++) {
            if (y > 0) this.drawOffset();

            for (int x = 0; x < this.width; x++) {
                if (y == 0 && x == 0) continue;
                if (x == 0 || this.isOnSide(x, y)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void drawOffset() {
        for (int i = 0; i < this.getOffset(); i++) {
            System.out.print(" ");
        }
    }

    public double getArea() {
        return this.height * this.width / 2;
    }

    public double getCircumference() {
        return this.height + this.width + Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.width, 2));
    }
}
