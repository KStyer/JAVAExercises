package org.example.supermarket;

public class SupermarketApplication {
//create a grocery store item with a price and get the price for 5 of that item
//create a grocery store item with a price per lb and get the price for 3.7 lb of it
//create a grocery store item with a buy 2, get 1 free and get the price for 5 of that item
    public static void main(String[] args) {
        GroceryItem item = new GroceryItem("yogurt", (float)3.29);
        System.out.println(item.getDescription());
        System.out.println(item.getPrice());
        System.out.println(item.getPrice() + (item.getPrice()));
        System.out.println("Hello world!");
    }
}
