package discount;

import com.hz.Product;
import com.hz.ShoppingCart;
import java.util.ArrayList;

public class Calculator {

    public double getTotalPrice(ShoppingCart shoppingCart) {
        double totalPrice = 0;

        for (Product product : shoppingCart.getAll()) {
            totalPrice += product.get_price();
        }
        return totalPrice;
    }

    // berekent 20% op ieder product
    public double getDiscount(ShoppingCart shoppingCart) {
        return getTotalPrice(shoppingCart) * 0.2;
    }

    // geeft totaal korting terug
    public double calculateDiscount(ShoppingCart shoppingCart) {
        return this.getTotalPrice(shoppingCart) - this.getDiscount(shoppingCart);
    }
}
