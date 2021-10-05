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
        int choice = 0;

        printInstructions();

        //Loop until the user want to quit, taking input and handling in a method
        
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
