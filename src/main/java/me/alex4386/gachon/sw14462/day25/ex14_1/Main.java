package me.alex4386.gachon.sw14462.day25.ex14_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        while (true) {
            System.out.print("Enter the name of the pet (type \"exit\" to exit): ");
            String name = scanner.nextLine();
            if (name.equals("exit")) break;

            System.out.print("Enter the age of the pet: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the weight of the pet: ");
            double weight = scanner.nextDouble();

            Pet pet = new Pet(name, age, weight);
            pets.add(pet);

            scanner.nextLine();
        }

        // sort by its name.
        for (int i = 0; i < pets.size(); i++) {
            for (int j = i + 1; j < pets.size(); j++) {
                if (pets.get(i).getName().compareTo(pets.get(j).getName()) > 0) {
                    Pet temp = pets.get(i);
                    pets.set(i, pets.get(j));
                    pets.set(j, temp);
                }
            }
        }

        for (Pet pet : pets) {
            pet.writeOutput();
        }
    }
}
