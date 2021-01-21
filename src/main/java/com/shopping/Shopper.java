package com.shopping;

public class Shopper {
    private ShoppingCart cart;

    public Shopper(ShoppingCart shoppingCart) {
        this.cart = shoppingCart;
    }

    public ShoppingCart getCart() {
        return cart;
    }
}
