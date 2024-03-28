package me.alex4386.gachon.sw14462.day08.ex4_4;

public class PurchaseDemo {
    public static void main(String[] args) {
        Purchase oranges = new Purchase();
        oranges.setName("Oranges");
        oranges.setPrice(10, 2.99);

        Purchase eggs = new Purchase();
        eggs.setName("Eggs");
        eggs.setPrice(12, 1.69);

        Purchase apples = new Purchase();
        apples.setName("Apples");
        apples.setPrice(3, 1.00);

        Purchase watermelons = new Purchase();
        watermelons.setName("Watermelons");
        watermelons.setPrice(1, 4.39);

        Purchase bagels = new Purchase();
        bagels.setName("Bagels");
        bagels.setPrice(6, 3.50);

        oranges.setNumberBought(2 * 12);
        eggs.setNumberBought(3 * 12);
        apples.setNumberBought(20);
        watermelons.setNumberBought(2);
        bagels.setNumberBought(1 * 12);

        double totalCost =
                oranges.getTotalCost() +
                eggs.getTotalCost() +
                apples.getTotalCost() +
                watermelons.getTotalCost() +
                bagels.getTotalCost();

        System.out.println("Total Cost: "+totalCost);

    }
}
