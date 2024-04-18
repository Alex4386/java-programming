package me.alex4386.gachon.sw14462.day14.ex7_2b;

public class ArrayUtils {
    /**
     * Returns the sum of elements in the indexed row of 2D array `arr`
     * @param arr 2D array
     * @param row row index to get sum
     * @return sum of elements in the row
     */
    public static double getSum(double[][] arr, int row) {
        return getSum1D(arr[row]);
    }

    /**
     * Returns the sum of elements of 1D array `arr`
     * @param arr 1D array
     * @return sum of elements in the array
     */
    private static double getSum1D(double[] arr) {
        double sum = 0;
        for (double value : arr) {
            sum += value;
        }
        return sum;
    }

    private static double getSumPerpendicular(double[][] arr, int column) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                sum += arr[i][column];
            } catch (ArrayIndexOutOfBoundsException e) {
                // ignore
            }
        }

        return sum;
    }

    public static double getAverage(double[][] arr, int column) {
        return getSumPerpendicular(arr, column) / arr.length;
    }
}
