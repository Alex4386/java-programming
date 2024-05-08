package me.alex4386.gachon.sw14462.day20.ex10_1d;

public class ShuffleCipher implements MessageEncoder {
    private int n;

    public ShuffleCipher(int n) {
        this.n = n;
    }

    @Override
    public String encode(String plainText) {
        char[] plainTextArray = plainText.toCharArray();
        char[] encodedTextArray = new char[plainTextArray.length];

        for (int i = 0; i < this.n; i++) {
            encodedTextArray = shuffle(plainTextArray);
        }

        return new String(encodedTextArray);
    }

    private char[] shuffle(char[] plainTextArray) {
        char[] encodedTextArray = new char[plainTextArray.length];

        // split into two arrays
        char[] firstHalf = new char[plainTextArray.length / 2 + 1];
        char[] secondHalf = new char[plainTextArray.length - firstHalf.length];

        // alternate between first and second half
        for (int i = 0; i < plainTextArray.length; i++) {
            if (i < firstHalf.length) {
                firstHalf[i] = plainTextArray[i];
            } else {
                secondHalf[i - firstHalf.length] = plainTextArray[i];
            }
        }

        // merge two arrays with alternating patterns
        for (int i = 0; i < plainTextArray.length; i++) {
            if (i % 2 == 0) {
                encodedTextArray[i] = firstHalf[i / 2];
            } else {
                encodedTextArray[i] = secondHalf[i / 2];
            }
        }

        return encodedTextArray;
    }
}
