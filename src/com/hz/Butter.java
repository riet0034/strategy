package com.hz;

public class Butter extends Product {

    private double _price;

    public Butter(double price) {
        super(price);
        _price = price;
    }

    @Override
    public double get_price() {
        return _price;
    }
}
