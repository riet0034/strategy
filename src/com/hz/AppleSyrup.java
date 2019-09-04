package com.hz;

public class AppleSyrup extends Product {

    private double _price;

    public AppleSyrup(double price) {
        super(price);
        _price = price;
    }

    @Override
    public double get_price() {
        return _price;
    }
}
