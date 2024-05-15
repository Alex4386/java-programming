package me.alex4386.gachon.sw14462.day22.ex12_5;

public class Main {
    public static long getTotalGrains(int k, long grains) {
        if (k == 1) {
            return grains;
        } else {
            return grains + getTotalGrains(k - 1, grains * 2);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            long totalGrains = getTotalGrains(i, 1);
            System.out.println("Total grains on " + i + " squares: " + totalGrains);
        }
    }
}
