/**
 * @author Archana
 */
package com.webscraper.model;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.text.DecimalFormat;

/**
 * Product class
 * @attr title
 * @attr code
 * @attr description
 * @attr unitPrice
 * @attr kcalPer100g
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Product {
    @JsonProperty("title")
    private String title;
    @JsonProperty("code")
    private String code;
    @JsonProperty("kcal_per_100g")
    private Double kcalPer100g;
    @JsonProperty("unit_price")
    private Double unitPrice;
    @JsonProperty("description")
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
}
