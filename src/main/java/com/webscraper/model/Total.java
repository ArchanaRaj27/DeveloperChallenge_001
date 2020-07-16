package com.webscraper.model;

import com.fasterxml.jackson.annotation.JsonProperty;

@lombok.Setter
@lombok.Getter
public class Total {

    // Total -
    // Net - Total of all the items (Sum of the items)
    // Vat - VAT on the gross amount (all items subjected to 20% VAT)
    // Gross - Total of goods including VAT
    @JsonProperty("Net")
    private Double net = null;
    @JsonProperty("VAT")
    private Double vat = null;
    @JsonProperty("Gross")
    private Double gross = null;

    public Total(Double net, Double vat, Double gross) {
        this.net = net;
        this.vat = vat;
        this.gross = gross;
    }

    public Total() {

    }

}
