package com.ShivamKadam;

public class Pizza {
  private int price;
  private boolean veg;
  private int extraCheesePrice = 100;
  private int extraToppingsPrice = 150;
  private int backpackPrice = 20;
  private int basePizzaPrice;

  private boolean isExtraCheeseAdded = false;
  private boolean isExtraToppingsAdded = false;
  private boolean isBackPackAdded = false;

  public Pizza(boolean veg) {
    this.veg = veg;
    if (this.veg) {
      this.price = 300;
      this.basePizzaPrice = 300;
    } else {
      this.price = 400;
      this.basePizzaPrice = 400;
    }
  }

  public void addExtraCheese() {
    if (!isExtraCheeseAdded) {
      isExtraCheeseAdded = true;
      this.price += extraCheesePrice;
      System.out.println("Extra cheese added.");
    }
  }

  public void addExtraToppings() {
    if (!isExtraToppingsAdded) {
      isExtraToppingsAdded = true;
      this.price += extraToppingsPrice;
      System.out.println("Extra toppings added.");
    }
  }

  public void addBackPack() {
    if (!isBackPackAdded) {
      isBackPackAdded = true;
      this.price += backpackPrice;
      System.out.println("Backpack added.");
    }
  }

  public void getBill() {
    String bill = "";
    bill += "Base Pizza: " + basePizzaPrice + "\n";
    if (isExtraCheeseAdded) {
      bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
    }
    if (isExtraToppingsAdded) {
      bill += "Extra Toppings Added: " + extraToppingsPrice + "\n";
    }
    if (isBackPackAdded) {
      bill += "Backpack Added: " + backpackPrice + "\n";
    }
    bill += "Total Price: " + this.price + "\n";
    System.out.println(bill);
  }
}
