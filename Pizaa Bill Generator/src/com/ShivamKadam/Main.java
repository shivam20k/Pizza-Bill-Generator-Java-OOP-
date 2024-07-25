package com.ShivamKadam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Is the pizza vegetarian? (yes/no)");
        String vegInput = scanner.nextLine();
        boolean isVeg = vegInput.equalsIgnoreCase("yes");

        Pizza pizza = new Pizza(isVeg);

        System.out.println("Do you want to add extra cheese? (yes/no)");
        String cheeseInput = scanner.nextLine();
        if (cheeseInput.equalsIgnoreCase("yes")) {
            pizza.addExtraCheese();
        }

        System.out.println("Do you want to add extra toppings? (yes/no)");
        String toppingsInput = scanner.nextLine();
        if (toppingsInput.equalsIgnoreCase("yes")) {
            pizza.addExtraToppings();
        }

        System.out.println("Do you want a backpack? (yes/no)");
        String backpackInput = scanner.nextLine();
        if (backpackInput.equalsIgnoreCase("yes")) {
            pizza.addBackPack();
        }

        pizza.getBill();

        scanner.close();
    }
}
