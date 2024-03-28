package me.alex4386.gachon.sw14462.day08.ex4_3;

public class GradeDistribution {
    final char grades[] = {'A', 'B', 'C', 'D', 'F'};
    int[] gradeNums = new int[5];

    public void setGradeNums(char letter, int num) {
        switch (letter) {
            case 'A':
                gradeNums[0] = num;
                break;
            case 'B':
                gradeNums[1] = num;
                break;
            case 'C':
                gradeNums[2] = num;
                break;
            case 'D':
                gradeNums[3] = num;
                break;
            case 'F':
                gradeNums[4] = num;
                break;
        }
    }

    public int getGradeNums(char letter) {
        switch (letter) {
            case 'A':
                return gradeNums[0];
            case 'B':
                return gradeNums[1];
            case 'C':
                return gradeNums[2];
            case 'D':
                return gradeNums[3];
            case 'F':
                return gradeNums[4];
            default:
                return 0;
        }
    }

    public int totalGradeNums() {
        int total = 0;
        for (int i = 0; i < gradeNums.length; i++) {
            total += gradeNums[i];
        }
        return total;
    }

    public double gradePercentage(char letter) {
        return ((double) getGradeNums(letter) / totalGradeNums()) * 100.0;
    }

    public void drawBarGraph() {
        int columns = 50;
        for (int i = 0; i < columns; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < gradeNums.length; i++) {
            double multiplier = (double) columns / 100.0;
            int counts = (int) Math.round(this.gradePercentage(grades[i]) * multiplier);
            for (int j = 0; j < counts; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
