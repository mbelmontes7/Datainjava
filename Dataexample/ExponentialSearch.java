package Dataexample;

import java.util.*;
import java.math.*;
//Exponential Search in Java: Algorithm, Implementation & Analysis Ch.5 Data Structures and Algorithms
//Exponential search is a searching algorithm that is used to find the position of a specific value in a sorted array.
public class ExponentialSearch {
    public static void main(String[] args) {
        //create an array
        int array[] = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};
        //looking for 50
        int searchValue = 50;
        //call the exponential search
        int result = expSearch(array, array.length, searchValue);
        System.out.println("Element is present at index: " + result);
    }

    //Exponential search algorithm
    static int expSearch(int array[], int n, int searchValue) {
        //if value is at position one
        if(array[0] == searchValue) {
            return 0;
        }
        //find the range for the binary search
        int i = 1;
        while (i < n && array[i] <= searchValue) {
            i = i * 2;
        }
        //now call the binary search
        return Arrays.binarySearch(array, (i / 2), Math.min(i, n), searchValue);
    }
}

// Output: Element is present at index: 9
// Exponential search is a search algorithm that works in two steps:
// 1. Determine the range where the element is likely to be.
// 2. Perform a binary search within that range.
//
// The first step is done using a loop that doubles its index on each iteration (hence the term "exponential").
// This is efficient because it quickly skips over large sections of the array that don't contain the target value.
//
// Once the range is found, the algorithm switches to binary search. Binary search works by repeatedly dividing the search range in half.
// If the target value is less than the middle element, it searches the left half.
// If the target value is greater than the middle element, it searches the right half.
// This is efficient because it eliminates half of the remaining elements on each iteration.
//
// The performance of this algorithm is O(log n) in Big O notation.
// This means that the time it takes to run the algorithm increases logarithmically with the size of the array.
// In other words, even for very large arrays, the algorithm is quite efficient.
// The "log" in O(log n) refers to the logarithm, which is the inverse of exponentiation.
// This reflects the fact that the algorithm divides the search space in half on each iteration.
