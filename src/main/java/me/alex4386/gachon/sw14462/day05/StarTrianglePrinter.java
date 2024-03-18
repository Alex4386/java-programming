package me.alex4386.gachon.sw14462.day05;

import java.io.PrintStream;

public class StarTrianglePrinter {
    int maxColumns;

    public StarTrianglePrinter(int maxColumns) {
        this.maxColumns = maxColumns;
    }

    public void print(PrintStream stream) {
        for (int i = 1; i < this.maxColumns; i++) {
            // Use nested for loops;
            // the outside loop controls the number of lines to write,
            // and the inside loop controls the number of asterisks to display on a line.
            for (int j = 0; j < i; j++) {
                stream.print("*");
            }
            stream.println("");
        }

        if (this.maxColumns > 1) {
            for (int i = this.maxColumns; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    stream.print("*");
                }
                stream.println("");
            }
        }
    }

}
