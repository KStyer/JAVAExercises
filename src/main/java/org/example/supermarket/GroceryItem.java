package org.example.supermarket;

public class GroceryItem {
    private String description;
    private float price;

    public GroceryItem(String constructorDescription, float constructorPrice){
        description=constructorDescription;
        price=constructorPrice;
    }
    public String getDescription(){
        return description;
    }
    public float getPrice(){
        return price;
    }
}
