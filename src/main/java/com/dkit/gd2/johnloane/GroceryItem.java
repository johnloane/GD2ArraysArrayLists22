package com.dkit.gd2.johnloane;

import java.util.Objects;

public class GroceryItem
{
    private String name;
    private float price;

    public GroceryItem(String name, float price)
    {
        this.name = name;
        this.price = price;
    }

    public GroceryItem()
    {
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


    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroceryItem that = (GroceryItem) o;
        return Float.compare(that.price, price) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, price);
    }
}
