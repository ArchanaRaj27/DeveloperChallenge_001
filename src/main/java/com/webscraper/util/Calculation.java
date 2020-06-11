package com.webscraper.util;

import com.webscraper.model.Product;
import com.webscraper.model.Total;

import java.util.List;

public class Calculation {

    public Total doCalculate(List<Product> products){
        Total total = new Total();
        total.setNet(12.34);
        total.setGross(25.6);
        total.setVat(3.78);

        return total;
    }
}
