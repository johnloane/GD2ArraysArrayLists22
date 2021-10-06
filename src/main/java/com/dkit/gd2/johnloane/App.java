package com.dkit.gd2.johnloane;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Create a program using arrays that sorts a list of integers in descending order. Descending order is highest value to lowest
 * If the array has 106, 26, 81, 5, 15 your program should give back 106, 81, 21, 15, 5
 * Set up the program so that the numbers to sort are read in from the keyboard
 * Implement the following methods - getIntegers, printArray, sortIntegers
 * getIntegers returns an array of integers entered at the keyboard. Should aask the user for how many elements they want to enter
 * printArray prints an array of integers
 * sortArray should sort the array and return a new array of the sorted numbers
 * You will have to figure out how to copy the array elements from the passed array into a new array and sort them and return the new array
 *
 */
public class App 
{
    private static Scanner keyboard = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main( String[] args )
    {
        boolean quit = false;
        MenuOptions selectedOption = MenuOptions.PRINT_MENU;

        printInstructions();

        //Loop until the user want to quit, taking input and handling in a method
        while(selectedOption != MenuOptions.QUIT)
        {
            System.out.print("Enter your choice > ");
            selectedOption = MenuOptions.values()[Integer.parseInt(keyboard.nextLine().trim())];

            switch(selectedOption)
            {
                case PRINT_MENU:
                    printInstructions();
                    break;
                case PRINT_LIST:
                    groceryList.printGroceryList();
                    break;
                case ADD_TO_LIST:
                    addItem();
                    break;
                case MODIFY_LIST:
                    modifyItem();
                    break;
                case REMOVE_FROM_LIST:
                    removeItem();
                    break;
                case SEARCH_LIST:
                    searchForItem();
                    break;
                case QUIT:
                    quit = true;
                    break;
            }
        }

//        int[] myIntegers = getIntegers();
//        int[] sorted = sortIntegers(myIntegers);
//        printArray(sorted);

//        ArrayList<GroceryItem> johns_list = new ArrayList<>();
//        GroceryItem bread = new GroceryItem("Bread", 0.99f);
//        GroceryItem milk = new GroceryItem("Milk", 1.49f);
//        johns_list.add(bread);
//        johns_list.add(milk);
//
//        GroceryList testList = new GroceryList(johns_list);
//        testList.printGroceryList();

    }

    private static void printInstructions()
    {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print the options");
        System.out.println("\t 1 - To print the grocery list");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search the list");
        System.out.println("\t 6 - To quit the app");
    }

    private static void addItem()
    {
        System.out.print("Please enter the item name: ");
        String itemName = keyboard.nextLine();
        System.out.print("Please enter the item price: ");
        float itemPrice = keyboard.nextFloat();
        keyboard.nextLine();
        GroceryItem itemToAdd = new GroceryItem(itemName, itemPrice);
        groceryList.addGroceryItem(itemToAdd);
        groceryList.printGroceryList();
    }

    private static void modifyItem()
    {
        System.out.print("Current item name > ");
        String currentName = keyboard.nextLine();
        System.out.print("Current item price >");
        float currentPrice = keyboard.nextFloat();
        keyboard.nextLine();
        System.out.print("New item name >");
        String newName = keyboard.nextLine();
        System.out.print("Please enter new price > ");
        Float newPrice = keyboard.nextFloat();
        keyboard.nextLine();
        GroceryItem newItem = new GroceryItem(newName, newPrice);
        GroceryItem searchItem = new GroceryItem(currentName, currentPrice);
        groceryList.modifyGroceryItem(searchItem, newItem);
        groceryList.printGroceryList();
    }

    private static void removeItem()
    {
        System.out.print("Item to remove > ");
        String itemToRemove = keyboard.nextLine();

        System.out.print("Please price to remove > ");
        Float searchPrice = keyboard.nextFloat();
        keyboard.nextLine();

        GroceryItem removeItem = new GroceryItem(itemToRemove, searchPrice);
        groceryList.removeGroceryItem(removeItem);
    }

    private static void searchForItem()
    {
        System.out.print("Item to search for > ");
        String searchName = keyboard.nextLine();

        System.out.print("Please enter new price > ");
        Float searchPrice = keyboard.nextFloat();
        keyboard.nextLine();

        GroceryItem searchItem = new GroceryItem(searchName, searchPrice);

        if(groceryList.findItem(searchItem) >= 0)
        {
            System.out.println("Item found");
        }
        else
        {
            System.out.println("Not in the list");
        }
    }



    /*
    TODO for homework - Implement mergesort instead of bubblesort here
    This should change the complexity from O(n^2) to O(n)
     */

    private static int[] sortIntegers(int[] myIntegers)
    {
        int[] sortedArray = Arrays.copyOf(myIntegers, myIntegers.length);

        boolean flag = true;
        int temp;
        while(flag)
        {
            flag = false;
            for(int i=0; i < sortedArray.length-1;i++)
            {
                if(sortedArray[i] < sortedArray[i+1])
                {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    private static void printArray(int[] myIntegers)
    {
        int i =1;
        for(int myInt : myIntegers)
        {
            System.out.println("Element " + (i) + " is " + myInt);
            i++;
        }
    }

    private static int[] getIntegers()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many integers would you like to enter > ");
        int arraySize = keyboard.nextInt();
        int [] array = new int[arraySize];
        for(int i=0; i < array.length; i++)
        {
            System.out.print("Enter value " + (i +1) + " >");
            array[i] = keyboard.nextInt();
        }
        return array;
    }
}
