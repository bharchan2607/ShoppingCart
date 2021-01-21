package com.shopping;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShoppingCartTest {

    @Test
    public void empty_new_cart(){
        //SEAT
        Shopper shopper = new Shopper(new ShoppingCart());
        assertTrue(shopper.getCart().isEmpty());
    }

    @Test
    public void addItemToEmptyCart(){
        Shopper shopper = new Shopper(new ShoppingCart());
        assertTrue(shopper.getCart().isEmpty());
        Item actualItem = new Item("Soap", 4.99, 1);

        shopper.getCart().addItemToCart(actualItem);
        assertEquals(4.99, shopper.getCart().getSubTotal());
    }

    @Test
    public void addItemToCart_returnsSubtotal(){
        Shopper shopper = new Shopper(new ShoppingCart());
        Item item1 = new Item("Samsung", 1100.00, 1);
        Item item2 = new Item("Rolex Watch", 11000.00, 1);
        Item item3 = new Item("Soap", 4.99, 1);


        shopper.getCart().addItemToCart(item1);
        shopper.getCart().addItemToCart(item2);
        shopper.getCart().addItemToCart(item3);
        assertEquals(12104.99, shopper.getCart().getSubTotal());
    }

    @Test
    public void checkQuantityInCart(){
        Shopper shopper = new Shopper(new ShoppingCart());
        Item item1 = new Item("Soap", 4.99, 2);

        shopper.getCart().addItemToCart(item1);
        assertEquals(2, shopper.getCart().getQuantityOfanItem("Soap"));

    }

    @Test
    public void getItemsFromCart(){
        Shopper shopper = new Shopper(new ShoppingCart());
        assertTrue(shopper.getCart().isEmpty());
        Item actualItem = new Item("Soap", 4.99, 1);
        shopper.getCart().addItemToCart(actualItem);

        assertEquals(List.of(actualItem), shopper.getCart().getItems());

    }

    @Test
    public void highlightItemsThatAreOnSale(){
        Shopper shopper = new Shopper(new ShoppingCart());
        Item item1 = new Item("Soap", 4.99, 1);
        Item item2 = new Item("Samsung", 1100.00, 1);
        Item item3 = new Item("Rolex Watch", 11000.00, 1);

        shopper.getCart().addItemToCart(item1);
        shopper.getCart().addItemToCart(item2);
        shopper.getCart().addItemToCart(item3);

        Item item4 = new Item("Handbag", 1500.00, 1, "RED");
        shopper.getCart().addItemToCart(item4);

        assertEquals(item4, shopper.getCart().highlightItemsOnSale());

    }

    @Test
    public void removeAnItemFromCart(){
        Shopper shopper = new Shopper(new ShoppingCart());
        Item item1 = new Item("Soap", 4.99, 1);
        Item item2 = new Item("Samsung", 1100.00, 1);
        Item item3 = new Item("Rolex Watch", 11000.00, 1);

        shopper.getCart().addItemToCart(item1);
        shopper.getCart().addItemToCart(item2);
        shopper.getCart().addItemToCart(item3);
        assertEquals(3, shopper.getCart().getItems().size());

        shopper.getCart().removeItemFromCart(item2);
        assertEquals(2, shopper.getCart().getItems().size());
        assertEquals(List.of(item1,item3), shopper.getCart().getItems());
    }

    @Test
    public void updateQuantity_afterRemoveAnItem(){
        Shopper shopper = new Shopper(new ShoppingCart());
        Item item1 = new Item("Soap", 4.99, 3);
        shopper.getCart().addItemToCart(item1);

        shopper.getCart().removeItemFromCart(item1);
        assertEquals(2, shopper.getCart().getQuantityOfanItem("Soap"));
    }
}
