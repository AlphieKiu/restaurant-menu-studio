package com.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String name;
    private ArrayList<MenuItem> items = new ArrayList<MenuItem>();

    public Menu(String name) {this.name = name;}

    public String getName() {return name;}

    public void setName(String aName) { name= aName;}

    public void addItem(MenuItem aItem) {items.add(aItem);}

    public ArrayList<String> getItems() {
        ArrayList<String> items = new ArrayList<>();

        for (MenuItem item: this.items) {
            String lineItem ="";

            lineItem += item.getName() + "\t";
            lineItem += item.getDescription() + "\t";
            lineItem += item.getCategory() + "\t";
            lineItem += item.getPrice() + "\t";
            lineItem += item.getIfNew();

            items.add(lineItem);
        }
        return items;
    }
}
