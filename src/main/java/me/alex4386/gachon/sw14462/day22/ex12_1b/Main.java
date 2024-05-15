package me.alex4386.gachon.sw14462.day22.ex12_1b;

public class Main {
    public static String getWordFromDigit(int digit) {
        String[] word = new String[] {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };

        return word[digit];
    }


    public static void displayAsWords(int number) {
        if (number >= 10) {
            displayAsWords(number / 10);
            System.out.print(" " + getWordFromDigit(number % 10));
        }
        else {
            System.out.print(getWordFromDigit(number));
        }
    }

    // iterative version
    public static void displayAsWordsIterative(int number) {
        StringBuilder result = new StringBuilder();

        do {
            result.insert(0, getWordFromDigit(number % 10) + " ");
            number /= 10;
        } while (number != 0);

        System.out.print(result.toString().trim());
    }

    public static void main(String[] args) {
        System.out.println("Printing 1234 as words:");
        displayAsWordsIterative(1234);
        System.out.println();
    }
}
