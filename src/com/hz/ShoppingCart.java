package com.hz;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Product> _products;

    public ShoppingCart() {
        this._products = new ArrayList();
    }

    public void addToCart(Product product) {
        this._products.add(product);
    }

    public ArrayList<Product> getAll() {

        return this._products;
    }
}
