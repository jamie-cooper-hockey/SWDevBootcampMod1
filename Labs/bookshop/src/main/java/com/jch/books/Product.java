package com.jch.books;

public abstract class Product {

    private String title;
    private double price;
    private double discount;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void setSaleDiscount(double salePercentage) {
        this.discount = salePercentage / 100.0;
    }

    public double calculateSalePrice() {
        return price - (price * discount);
    }

    protected double getSalePercentage() {
        return discount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void printer();

}
