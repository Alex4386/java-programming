package me.alex4386.gachon.sw14462.day06;

public class CheckService {
    public static double acceptCheck(double checkAmount) {
        double fee = 0;
        if (checkAmount < 10) {
            fee = 1;
        } else if (checkAmount < 100) {
            fee = 0.1 * checkAmount;
        } else if (checkAmount < 1000) {
            fee = 5;
            fee += 0.05 * checkAmount;
        } else {
            fee = 40;
            fee += 0.01 * checkAmount;
        }

        return fee;
    }
}
