package com.shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart(){
        items = new ArrayList<Item>();
    }
    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void addItemToCart(Item item) {

       for(Item currentItem: items){
           if(currentItem.getItemName().equals(item.getItemName())){
               currentItem.setQuantity(currentItem.getQuantity()+item.getQuantity());
               return;
           }
       }
        items.add(item);
    }

    public double getSubTotal() {
        double totalPrice = 0.0;
        for(Item item: items){
            totalPrice += item.getPrice()*item.getQuantity();
        }
        return totalPrice;
    }

    public int getQuantityOfanItem(String itemName) {
       return items.stream()
                .filter(item -> item.getItemName().equals(itemName))
                .mapToInt(item -> item.getQuantity())
               .findFirst()
               .getAsInt();
    }

    public List<Item> getItems() {
        return items;
    }

    public Item highlightItemsOnSale() {
       return items.stream()
                .filter(item -> "RED".equals(item.getIsOnSaleColor()))
                .findFirst()
                .get();
    }

    public void removeItemFromCart(Item item) {
        for(Item currentItem:items){
            if(currentItem.getItemName().equals(item.getItemName())){
                int quantity = currentItem.getQuantity();

                currentItem.setQuantity(--quantity);
                if(currentItem.getQuantity() <= 0){
                    items.remove(currentItem);
                }
                break;

            }
        }
    }
}
