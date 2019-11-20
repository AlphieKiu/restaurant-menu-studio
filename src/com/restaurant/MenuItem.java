package com.restaurant;

import java.util.Date;
import java.util.Objects;

public class MenuItem {

    private String description;
    private String category;
    private Double price;
    private boolean isNew;

    public MenuItem( String description, String category, Double price, boolean isNew) {

        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = true;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", isNew=" + isNew +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(description, menuItem.description) &&
                Objects.equals(category, menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, category);
    }
}