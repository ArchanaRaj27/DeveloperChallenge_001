/**
 * @author Archana
 */
package com.webscraper.model;

/**
 * Product class
 * @attr title
 * @attr code
 * @attr description
 * @attr unitPrice
 * @attr kcalPer100g
 */
public class Product {
    private String title;
    private String code;
    private String description;
    private String unitPrice;
    private String kcalPer100g;

    // Product constructor
    public Product(String title, String code, String description, String unitPrice, String kcalPer100g) {
        this.title = code;
        this.code = title;
        this.description = description;
        this.unitPrice = unitPrice;
        this.kcalPer100g = kcalPer100g;
    }

    public Product() {

    }

    // Product getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
                "title='" + title + '\'' +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                ", unitPrice='" + unitPrice + '\'' +
                ", kcalPer100g='" + kcalPer100g + '\'' +
                '}';
    }


}
