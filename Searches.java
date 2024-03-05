import java.util.Arrays;


//The sequentialSearch() method in your code is an example of a 
//linear search algorithm. In terms of Big O notation, 
//linear search has a time complexity of O(n), where n is the number of elements in the array.
public class Searches {
    public static void main(String[] args) {
        // create an array
        double[] payments = {3.35, 12.07, 122.76, 7.33, 6.04, 681.78, -0.05, 45.25, 107.33, 6.25, 3.45, 3.45, 0.52};

        // what are we looking for?
        double searchKey = 7.33;
        System.out.println("Search Key found at: " + sequentialSearch(payments, searchKey));
    }

    public static int sequentialSearch(double[] arr, double key) {
        int arraySize = arr.length;
        for (int i = 0; i < arraySize; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
