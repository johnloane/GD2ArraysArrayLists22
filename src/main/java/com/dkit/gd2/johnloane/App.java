package com.dkit.gd2.johnloane;

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
    public static void main( String[] args )
    {
        int[] myIntegers = getIntegers();
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }
}
