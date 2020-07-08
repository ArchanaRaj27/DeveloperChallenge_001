package com.webscraper.util;

import com.webscraper.model.Product;
import com.webscraper.model.Total;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

public class Calculation {
    // Net - Total of all the items (Sum of the items)
    // Vat - VAT on the gross amount (all items subjected to 20% VAT)
    // Gross - Total of goods including VAT
    public Total doCalculate(List<Product> products){
        Total total = new Total();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        // Calculation of NET value
        double netLocal = 0;
        for (int i = 0; i < products.size(); i++ ){
            netLocal += products.get(i).getUnitPrice();
            total.setNet(new Double(decimalFormat.format(netLocal)));
        }
        // Calculation of VAT value
        double vatLocal = 0;
        vatLocal = netLocal * 0.2;
        total.setVat(new Double(decimalFormat.format(vatLocal)));
        // Calculation of Gross value
        double grossLocal = 0;
        grossLocal = netLocal + vatLocal;
        total.setGross(new Double(decimalFormat.format(grossLocal)));

        return total;
    }
}
