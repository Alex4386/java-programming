package me.alex4386.gachon.sw14462.day08.ex4_3;

public class Main {
    public static void main(String[] args) {
        GradeDistribution gradeDistribution = new GradeDistribution();

        gradeDistribution.setGradeNums('A', 1);
        gradeDistribution.setGradeNums('B', 4);
        gradeDistribution.setGradeNums('C', 6);
        gradeDistribution.setGradeNums('D', 2);
        gradeDistribution.setGradeNums('F', 1);

        System.out.println("Grade Distribution");
        System.out.println("A: " + gradeDistribution.getGradeNums('A') + " (" + gradeDistribution.gradePercentage('A') + "%)");
        System.out.println("B: " + gradeDistribution.getGradeNums('B') + " (" + gradeDistribution.gradePercentage('B') + "%)");
        System.out.println("C: " + gradeDistribution.getGradeNums('C') + " (" + gradeDistribution.gradePercentage('C') + "%)");
        System.out.println("D: " + gradeDistribution.getGradeNums('D') + " (" + gradeDistribution.gradePercentage('D') + "%)");
        System.out.println("F: " + gradeDistribution.getGradeNums('F') + " (" + gradeDistribution.gradePercentage('F') + "%)");

        gradeDistribution.drawBarGraph();
    }
}