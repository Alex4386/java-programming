package me.alex4386.gachon.sw14462.day14.ex7_2c;

public class Polynomial {
    private int degree;
    private double[] coefficients;

    public Polynomial(int max) {
        this.degree = max;
        this.coefficients = new double[max + 1];
        this.resetCoefficients();
    }

    /**
     * Resets all coefficients to 0
     */
    private void resetCoefficients() {
        for (int i = 0; i < this.coefficients.length; i++) {
            this.coefficients[i] = 0;
        }
    }

    public void setConstant(int i, double value) {
        if (i < 0 || i > this.coefficients.length - 1)
            throw new IllegalArgumentException("Invalid degree");

        this.coefficients[i] = value;
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < this.coefficients.length; i++) {
            result += this.coefficients[i] * Math.pow(x, i);
        }
        return result;
    }
}
