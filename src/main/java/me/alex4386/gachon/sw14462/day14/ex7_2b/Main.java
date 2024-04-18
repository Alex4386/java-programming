package me.alex4386.gachon.sw14462.day14.ex7_2b;

public class Main {
    public static void main(String[] args) {
        double[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("double[][] arr = {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  {");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j != arr[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            if (i != arr.length - 1) {
                System.out.println(",");
            } else {
                System.out.println();
            }
        }
        System.out.println("};");

        System.out.println("Sum of row 0: " + ArrayUtils.getSum(arr, 0));
        System.out.println("Sum of row 1: " + ArrayUtils.getSum(arr, 1));
        System.out.println("Sum of row 2: " + ArrayUtils.getSum(arr, 2));

        System.out.println("Average of column 0: " + ArrayUtils.getAverage(arr, 0));
        System.out.println("Average of column 1: " + ArrayUtils.getAverage(arr, 1));
        System.out.println("Average of column 2: " + ArrayUtils.getAverage(arr, 2));
    }
}
