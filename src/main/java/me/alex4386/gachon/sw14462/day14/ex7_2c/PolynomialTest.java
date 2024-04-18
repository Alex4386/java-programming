package me.alex4386.gachon.sw14462.day14.ex7_2c;

public class PolynomialTest {
    public static void main(String[] args) {
        System.out.println("=== Polynomial Test ===");

        System.out.println("=== TEST 1 ===");
        Polynomial p = new Polynomial(3);
        p.setConstant(0, 3);
        p.setConstant(1, 5);
        p.setConstant(2, 0);
        p.setConstant(3, 2);
        System.out.println("P(x) = 3 + 5x + 2x^3");
        System.out.println("P(2) = " + p.evaluate(2));

        System.out.println("=== TEST 2 ===");
        Polynomial y = new Polynomial(2);
        y.setConstant(0, 1);
        y.setConstant(1, 2);
        y.setConstant(2, 3);
        System.out.println("P(x) = 1 + 2x + 3x^2");
        System.out.println("P(3) = " + y.evaluate(3));

        System.out.println("=== End of test ===");
    }
}
