package com.webscraper.model;

public class Product {
    private String itemCode;
    private String name;
    private String description;
    private String unitPrice;
    private String kcalPer100g;


    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getKcalPer100g() {
        return kcalPer100g;
    }

    public void setKcalPer100g(String kcalPer100g) {
        this.kcalPer100g = kcalPer100g;
    }

    @Override
    public String toString() {
        return "Product{" +
                "itemCode='" + itemCode + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unitPrice='" + unitPrice + '\'' +
                ", kcalPer100g='" + kcalPer100g + '\'' +
                '}';
    }
}
