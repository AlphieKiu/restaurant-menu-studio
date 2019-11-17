package com.restaurant;

import java.util.Date;

public class MenuItem {

    private Integer id;
    private String name;
    private String description;
    private String category;
    private double price;
    private Date lastUpdateDate;

    public MenuItem(Integer id, String name, String description, String category, double price, Date lastUpdateDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.lastUpdateDate = lastUpdateDate;
    }
    public Integer getID() { return id; }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public Boolean getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setId(Integer aId) { this.id = aId}

    public void setName(String aName) {
        this.name = aName;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public void setPrice(double aPrice) {
        this.price = aPrice;
    }

    public void setLastUpdateDate(Date aLastUpdateDate) {
        this.lastUpdateDate = aLastUpdateDate;
    }


}
