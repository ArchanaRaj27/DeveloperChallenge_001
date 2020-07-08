package com.webscraper.model;

@lombok.Setter
@lombok.Getter
public class Total {

    // Total -
    // Net - Total of all the items (Sum of the items)
    // Vat - VAT on the gross amount (all items subjected to 20% VAT)
    // Gross - Total of goods including VAT

    private Double net = null;
    private Double vat = null;
    private Double gross = null;

    public Total(Double net, Double vat, Double gross) {
        this.net = net;
        this.vat = vat;
        this.gross = gross;
    }

    public Total() {

    }

}
