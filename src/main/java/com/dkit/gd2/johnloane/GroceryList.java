package com.dkit.gd2.johnloane;

import java.util.ArrayList;

public class GroceryList
{
    private ArrayList<GroceryItem> groceryList = new ArrayList<>();

    public GroceryList(ArrayList<GroceryItem> groceryList)
    {
        this.groceryList = groceryList;
    }

    public GroceryList()
    {

    }

    public ArrayList<GroceryItem> getGroceryList()
    {
        return groceryList;
    }

    @Override
    public String toString()
    {
        return "GroceryList{" +
                "groceryList=" + groceryList +
                '}';
    }

    public void printGroceryList()
    {
        System.out.println("You have " + groceryList.size() + " items in your grocery list costing " + costOfList());
        int i = 1;
        for(GroceryItem item : groceryList)
        {
            System.out.println(i + ". " + item);
            i++;
        }
    }

    public float costOfList()
    {
        float totalCost = 0;
        for(GroceryItem item : groceryList)
        {
            totalCost += item.getPrice();
        }
        return totalCost;
    }

    public void removeGroceryItem(String itemName)
    {
        int position = findItem(itemName);
        if(position >= 0)
        {
            removeGroceryItem(position);
        }

    }

    private int findItem(String searchItem)
    {
        return groceryList.indexOf(searchItem);
    }


    private void removeGroceryItem(int position)
    {
        groceryList.remove(position);
    }

    public void modifyGroceryItem(String currentItem, GroceryItem newItem)
    {
        int position = findItem(currentItem);
        if(position > 0)
        {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, GroceryItem newItem)
    {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }


}
