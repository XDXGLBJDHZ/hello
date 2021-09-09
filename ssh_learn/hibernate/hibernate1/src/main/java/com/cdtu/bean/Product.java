package com.cdtu.bean;

/**
 * @author ME08I
 * @date 2021/8/29
 */
public class Product {
    private int id;
    private String name;
    private String serialName;
    private double price;
    private int stock;

    public Product() {
    }

    public Product(String name, String serialName, double price, int stock) {
        this.name = name;
        this.serialName = serialName;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialName() {
        return serialName;
    }

    public void setSerialName(String serialName) {
        this.serialName = serialName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
