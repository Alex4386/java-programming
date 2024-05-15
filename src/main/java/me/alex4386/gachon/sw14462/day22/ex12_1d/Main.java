package me.alex4386.gachon.sw14462.day22.ex12_1d;

public class Main {
    // check if string is palindrome, ignoring case and spaces, punctuation marks and cases utilizing recursion
    public static boolean checkPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }

        char firstChar = s.charAt(0);
        char lastChar = s.charAt(s.length() - 1);

        if (!Character.isLetterOrDigit(firstChar)) {
            return checkPalindrome(s.substring(1));
        } else if (!Character.isLetterOrDigit(lastChar)) {
            return checkPalindrome(s.substring(0, s.length() - 1));
        } else if (Character.toLowerCase(firstChar) != Character.toLowerCase(lastChar)) {
            return false;
        }

        return checkPalindrome(s.substring(1, s.length() - 1));
    }

    public static void palindromeChecker(String s) {
        if (checkPalindrome(s)) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        palindromeChecker("radar");
        palindromeChecker("\"Straw? No, too stupid a fad, I put soot on warts.\"");
        palindromeChecker("sensor");
    }
}
