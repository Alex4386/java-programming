package me.alex4386.gachon.sw14462.day10;

import java.util.Scanner;

/**
 Demonstration of using the class DimensionConverter.
 */
public class DimensionConverterDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a measurement in inches: ");
        double inches = keyboard.nextDouble();
        double feet =
                DimensionConverter.convertInchesToFeet(inches);
        System.out.println(inches + " inches = " +
                feet + " feet.");
        System.out.print("Enter a measurement in feet: ");
        feet = keyboard.nextDouble();
        inches = DimensionConverter.convertFeetToInches(feet);
        System.out.println(feet + " feet = " +
                inches + " inches.");
    }
}
