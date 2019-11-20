package com.restaurant;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        MenuItem fries = new MenuItem("French Fries with Housemade Ketchup", "Appetizer", 4.99, true);

        MenuItem chocolatePudding = new MenuItem ("Chocolate Pudding with Vanilla Cream", "dessert", 5.99, true);
        Menu deathByChocolate = new Menu();

        deathByChocolate.addItem(fries);
        deathByChocolate.addItem(chocolatePudding);

        System.out.println(deathByChocolate);
    }
}
