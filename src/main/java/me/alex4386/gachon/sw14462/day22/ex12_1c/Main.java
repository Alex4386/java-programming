package me.alex4386.gachon.sw14462.day22.ex12_1c;

public class Main {
    public static void main(String[] args) {
        String tel = "010-1234-5678";
        System.out.println("Digit count of "+tel+" is "+countDigits(tel));
    }

    public static int countDigits(String str) {
        if (str.length() == 0) {
            return 0;
        }

        char firstChar = str.charAt(0);
        if (firstChar >= '0' && firstChar <= '9') {
            return 1 + countDigits(str.substring(1));
        }

        return countDigits(str.substring(1));
    }
}
