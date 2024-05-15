package me.alex4386.gachon.sw14462.day22.ex12_3;

public class GoldenRatioCalculator {
    private int current = 0;
    private int prevValue = Integer.MIN_VALUE;
    private int thisValue = Integer.MIN_VALUE;

    public void next() {
        this.current++;
        if (this.thisValue == Integer.MIN_VALUE) {
            this.thisValue = 0;
        } else if (this.prevValue == Integer.MIN_VALUE) {
            this.thisValue = 1;
            this.prevValue = 0;
        } else {
            int bakPrev = this.prevValue;
            this.prevValue = this.thisValue;
            this.thisValue = bakPrev + this.prevValue;
        }
    }

    public boolean doCalculation() {
        return thisValue != Integer.MIN_VALUE && prevValue != Integer.MIN_VALUE && this.prevValue != 0;
    }

    public String getCalculation() {
        return this.doCalculation() ? this.thisValue+"/"+this.prevValue : "";
    }

    public double getCalculationResult() {
        return this.doCalculation() ? (double)this.thisValue/(double)this.prevValue : 0.0;
    }

    public String getFibonacciCalculationStatus() {
        StringBuilder builder = new StringBuilder();
        builder.append("Fibonacci #");
        builder.append(this.current);
        builder.append(" = ");
        builder.append(this.thisValue);
        if (this.doCalculation()) {
            builder.append("; ");
            builder.append(this.getCalculation());
            builder.append(" = ");
            builder.append(this.getCalculationResult());
        }

        return builder.toString();
    }

    public void printFibonacciCalculationStatus() {
        System.out.println(this.getFibonacciCalculationStatus());
    }
}
