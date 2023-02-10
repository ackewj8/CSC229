package com.mycompany.integerarray;
import java.util.Scanner;

/**
 *
 * @author willi
 */
public class IntegerArray {
    public static void selectionSort(int[] a, int size) { // Selection sort algorithm
        int outer, inner, min;
        for (outer = 0; outer < size - 1; outer++) {
            min = outer;
            for (inner = outer + 1; inner < size; inner++) {
                if (a[inner] < a[min]) {
                    min = inner;
                }
            }
            int temp = a[outer];
            a[outer] = a[min];
            a[min] = temp;
        }
    }
    
    public static int linearSearch(int nmList[], int n, int x) { // Linear search algorithm
        int i = 0;
        
        for (i = 0; i <= n; ++i) {
            if (nmList[i] == x) {
                return i;
            }
        }
        return -1;
    }
    
    public static int binarySearch(int search, int[] array) { // Binary search algorithm
        int start = 0;
        int end = array.length - 1;
        
        while (start <= end) {
            
            int middle = (start + end) / 2;
            
            if (search < array[middle]) {
                end = middle - 1;
            }
            
            if (search > array[middle]) {
                start = middle + 1;
            }
            
            if (search == array[middle]) {
                return middle;
            }
        }
        return -1;
    }
    
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in); // Scanner reads user input
        int reader; // Used to read the series array of integers
        int search; // Used to find a certain integer
        int searchIndex; // Index of where the integer was found
        int size = 5; // Size of the array
        int[] series = new int[5]; // Array that integers are read into
        for(int i = 0;i < series.length; ++i) { // Loop iterates until all integer values are entered for all elements
            System.out.println("Please enter an integer: ");
            reader = scnr.nextInt();
            series[i] = reader;
        }
        System.out.println("Now sorting array..."); // Message indicating that the array is being sorted
        selectionSort(series, size); // Function to execute a selection sort
        for(int j = 0;j < size; ++j) { // Printing out the sorted array
            System.out.println(series[j]);
        }
        // Asking the user what integer they would like to search for
        System.out.println("What integer would you like to search for?: ");
        search = scnr.nextInt(); // Search is assigned the integer that scnr read
        int choice; // Used to choose between linear search and binary search
        // User is presented a choice between linear search and binary search
        System.out.println("How would you like to sort this array? (1:Linear/2:Binary)?: ");
        choice = scnr.nextInt();
        // Ensures the user only inputs either a 1 or a 2 for choice
        while(choice < 1 || choice > 2) {
            System.out.println("How would you like to sort this array? (1:Linear/2:Binary)?: ");
            choice = scnr.nextInt();
        }
        if(choice == 1) { // A choice value of 1 activates linear search
            searchIndex = linearSearch(series, size, search);
            if(searchIndex != -1) { // A return value other than -1 indicates a success
                System.out.println("I found " + search + " at index " + searchIndex + ".");
            }
            else { // A return value of -1 indicates that search was not found
                System.out.println("Integer " + search + " was not found.");
            }
        }
        else if(choice == 2) { // A choice value of 2 activates binary search
            searchIndex = binarySearch(search, series);
            if(searchIndex != -1) { // A return value other than -1 indicates a success
                System.out.println("I found " + search + " at index " + searchIndex + ".");
            }
            else { // A return value of -1 indicates that search was not found
                System.out.println("Integer " + search + " was not found.");
            }
        }
    }
}
