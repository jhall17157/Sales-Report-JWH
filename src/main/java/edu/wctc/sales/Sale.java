package edu.wctc.sales;

import java.util.List;

public class Sale  {
    private String customerName;
    private String country;
    private double tax;
    private double amount;
    private double shipping;

    public Sale(String customerName, String country, double amount, double tax) {
        this.amount = amount;
        this.customerName = customerName;
        this.country = country;
        this.tax = tax;
    }

    public Sale (String country) {this.country = country;}

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getShipping() {
        return shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
