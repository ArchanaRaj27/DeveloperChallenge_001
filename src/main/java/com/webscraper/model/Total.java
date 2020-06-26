package com.webscraper.model;


public class Total {

    // Total -
    // Net - Total of all the items (Sum of the items)
    // Vat - VAT on the gross amount (all items subjected to 20% VAT)
    // Gross - Total of goods including VAT

    private String net = null;
    private String vat = null;
    private String gross = null;

    public Total(String net, String vat, String gross) {
        this.net = net;
        this.vat = vat;
        this.gross = gross;
    }

    public Total() {

    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) { this.net = net; }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getGross() {
        return gross;
    }

    public void setGross(String gross) { this.gross = gross; }

}
