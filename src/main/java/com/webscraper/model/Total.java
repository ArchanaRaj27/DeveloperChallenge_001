package com.webscraper.model;

public class Total {

    // Total -
    // Net - Total of all the items
    // Vat - VAT on the gross amount (all items subjected to 20% VAT)
    // Gross - Total of goods including VAT

    private double net = 0;
    private double vat = 0;
    private double gross = 0;

    public Total(double net, double vat, double gross) {
        this.net = net;
        this.vat = vat;
        this.gross = gross;
    }

    public Total() {

    }

    public double getNet() {
        return net;
    }

    public void setNet(double net) {
        this.net = net;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getGross() {
        return gross;
    }

    public void setGross(double gross) {
        this.gross = gross;
    }



}
