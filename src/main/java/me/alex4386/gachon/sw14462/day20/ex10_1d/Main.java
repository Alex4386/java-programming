package me.alex4386.gachon.sw14462.day20.ex10_1d;

public class Main {
    public static void main(String[] args) {
        MessageEncoder[] encoders = new MessageEncoder[2];
        encoders[0] = new ShuffleCipher(1);
        encoders[1] = new SubstitutionCipher(3);

        String plainText = "All your base are belong to us.";
        System.out.println("Original Message: " + plainText);
        for (MessageEncoder encoder : encoders) {
            System.out.println("Encoded Message ("+encoder.getClass().getName().substring(encoder.getClass().getName().lastIndexOf('.') + 1)+"): " + encoder.encode(plainText));
        }
    }
}
