package com.dkit.gd2.johnloane;

public class GroceryItem
{
    private String name;
    private float price;

    public GroceryItem(String name, float price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public float getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        return name + " " + price;
    }
}
