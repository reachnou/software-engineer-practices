package org.example.principles.openclosed.good;

public class Clothes implements Goods{
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
