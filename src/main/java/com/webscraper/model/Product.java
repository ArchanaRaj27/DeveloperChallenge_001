/**
 * @author Archana
 */
package com.webscraper.model;


import com.fasterxml.jackson.annotation.JsonInclude;

import java.text.DecimalFormat;

/**
 * Product class
 * @attr title
 * @attr code
 * @attr description
 * @attr unitPrice
 * @attr kcalPer100g
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Product {
    private String title;
    private String code;
    private Double kcalPer100g;
    private Double unitPrice;
    private String description;

    // Product constructor
    public Product(String title, String code, String kcalPer100g, String unitPrice, String description) {
        this.title = code;
        this.code = title;
        if (kcalPer100g.length() > 0) {
            this.kcalPer100g = new Double(kcalPer100g);
        }
        else{
            this.kcalPer100g = null;
        }
        if (unitPrice.length() > 0) {
            this.unitPrice = new Double(unitPrice);
        }
        else{
            this.unitPrice = null;
        }
        this.description = description;
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

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getKcalPer100g() {
        return kcalPer100g;
    }

    public void setKcalPer100g(Double kcalPer100g) {
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
