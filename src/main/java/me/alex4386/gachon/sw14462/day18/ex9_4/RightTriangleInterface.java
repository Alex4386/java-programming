package me.alex4386.gachon.sw14462.day18.ex9_4;

/**
 Interface for a right triangle to be drawn on the screen.
 */
public interface RightTriangleInterface extends ShapeInterface, ExtraInterface {
    /**
     Sets the right triangle's dimensions.
     */
    public void set(int newHeight, int newWidth);
}
