package me.alex4386.gachon.sw14462.day18.ex9_4;

public abstract class ShapeBase implements ShapeInterface
{
    private int offset;
    public abstract void drawHere();
    public void drawAt(int lineNumber)
    {
        for (int count = 0; count < lineNumber; count++)
            System.out.println();
        drawHere();
    }
}
