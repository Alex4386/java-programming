package me.alex4386.gachon.sw14462.day11.ex6_4;

public class CharacteristicTest {
    public static void main(String[] args) {
        Characteristic character1 = new Characteristic("Sample Description for Characteristic 1, 3 and 4");
        Characteristic character2 = new Characteristic("Sample Description for Characteristic 2");
        Characteristic character3 = new Characteristic("Sample Description for Characteristic 1, 3 and 4");
        Characteristic character4 = new Characteristic("Sample Description for Characteristic 1, 3 and 4");

        System.out.println("character1.getDescription() = " + character1.getDescription());
        System.out.println("character2.getDescription() = " + character2.getDescription());
        System.out.println("character3.getDescription() = " + character3.getDescription());
        System.out.println("character4.getDescription() = " + character4.getDescription());

        System.out.println("Requesting rating for character1...");
        character1.setRating();
        System.out.println("character1.getRating() = " + character1.getRating());

        if (character1.getRating() == 0) {
            System.out.println("Due to invalid rating input, character1's rating is still 0. Provisioning instance's rating to 5.");
            character1.setRating(5);
        }

        System.out.println("Setting rating for character2 to "+character1.getRating());
        character2.setRating(character1.getRating());
        System.out.println("character2.getRating() = " + character2.getRating());

        System.out.println("Setting rating for character3 to "+character1.getRating());
        character3.setRating(character1.getRating());
        System.out.println("character3.getRating() = " + character2.getRating());

        System.out.println("Setting rating for character4 to 9");
        character4.setRating(1);
        System.out.println("character4.getRating() = " + character4.getRating());

        System.out.println("character1.getCompatibility(character2) = " + character1.getCompatibility(character2));
        System.out.println("character1.getCompatibility(character3) = " + character1.getCompatibility(character3));
        System.out.println("character1.getCompatibility(character4) = " + character1.getCompatibility(character4));
    }
}
