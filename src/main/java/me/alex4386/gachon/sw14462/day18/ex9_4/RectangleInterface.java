package me.alex4386.gachon.sw14462.day18.ex9_4;

/**
 Interface for a rectangle to be drawn on the screen.
 */
public interface RectangleInterface extends ShapeInterface, ExtraInterface {
    /**
     Sets the rectangle's dimensions.
     */
    public void set(int newHeight, int newWidth);
    public double getArea();
    public double getCircumference();
}
