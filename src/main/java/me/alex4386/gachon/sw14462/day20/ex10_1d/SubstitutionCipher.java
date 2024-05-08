package me.alex4386.gachon.sw14462.day20.ex10_1d;

public class SubstitutionCipher implements MessageEncoder {
    private int shift;

    public SubstitutionCipher(int shift) {
        this.shift = shift;
    }

    @Override
    public String encode(String plainText) {
        StringBuilder encodedText = new StringBuilder();

        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + shift);
                if (c > 'Z') {
                    c = (char) (c - 26);
                }
            } else if (c >= 'a' && c <= 'z') {
                c = (char) (c + shift);
                if (c > 'z') {
                    c = (char) (c - 26);
                }
            }
            encodedText.append(c);
        }

        return encodedText.toString();
    }
}
