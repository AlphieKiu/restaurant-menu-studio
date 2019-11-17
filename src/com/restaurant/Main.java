package com.restaurant;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu ("Alphie's Restaurant");
        menu.addItem(new MenuItem("fries", "french fries with housemade ketchup", "side", 5.0, true));

        System.out.println(menu.getName());
        System.out.println(menu.getItems());
    }
}
