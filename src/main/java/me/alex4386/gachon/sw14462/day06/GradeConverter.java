package me.alex4386.gachon.sw14462.day06;

public class GradeConverter {
    public static double letterGradeToGradePoint(char grade) {
        double point = 0.0;
        switch (grade) {
            case 'A':
                point = 4.0;
                break;
            case 'B':
                point = 3.0;
                break;
            case 'C':
                point = 2.0;
                break;
            case 'D':
                point = 1.0;
                break;
            case 'F':
            default:
                point = 0.0;
                break;
        }

        return point;
    }
}
