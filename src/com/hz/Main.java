package com.hz;

import discount.Calculator;

public class Main {

    public static void main(String[] args) {

        Product butter = new Butter(3);
        Product appleSyrup = new AppleSyrup(2);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addToCart(butter);

        Calculator calc = new Calculator();

        System.out.println("Prijs zonder korting: " + calc.getTotalPrice(shoppingCart));
        System.out.println("Totale korting: " + calc.getDiscount(shoppingCart));
        System.out.println("Prijs met korting: " + calc.calculateDiscount(shoppingCart));
    }
}
