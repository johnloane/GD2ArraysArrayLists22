package com.dkit.gd2.johnloane;

import java.util.ArrayList;

public class GroceryList
{
    private ArrayList<GroceryItem> groceryList = new ArrayList<>();

    public GroceryList(ArrayList<GroceryItem> groceryList)
    {
        this.groceryList = groceryList;
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
    /* TODO
    Write for Homework
     */
    public void removeGroceryItem(String itemName)
    {

    }

    /* TODO
    Write for Homework
     */
    public void removeGroceryItem(int position)
    {

    }
    /* TODO finish for homework */
    public void modifyGroceryItem(int position, GroceryItem newItem)
    {

    }


}
