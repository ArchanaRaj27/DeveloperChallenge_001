package com.webscraper.model;


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

    public Double getNet() {
        return net;
    }

    public void setNet(Double net) { this.net = net; }

    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }

    public Double getGross() {
        return gross;
    }

    public void setGross(Double gross) { this.gross = gross; }

}
