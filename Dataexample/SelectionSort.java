package Dataexample;

public class SelectionSort

// selection sort = search through an array and keep track of the minimum value during 
 //     each iteration. At the end of each iteration, we swap variables.
 
 //     Quadratic time O(n^2)
 //     small data set = okay
 //     large data set = BAD 
 //Ch/12 
{
  void sort(int arr[])
  {
    int n = arr.length;
    // Traverse the unsorted subarray
    for (int i = 0; i < n-1; i++)
    {
      // Find the smallest element in unsorted array
      int min = i;
      for (int j = i+1; j < n; j++) {
        if (arr[j] < arr[min])
        min = j;
      }
      // Swap the smallest element with the first element
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }
  }
  // Prints the array
  void printArray(int arr[])
  {
    int n = arr.length;
    for (int i=0; i<n; ++i)
      System.out.print(arr[i]+" ");
    System.out.println();
  }
  // Test the code
  public static void main(String[] args)
  {
    SelectionSort ss = new SelectionSort();
    int arr[] = {95, 42, 13, 9, 23};
    ss.sort(arr);
    System.out.println("The sorted array is: ");
    ss.printArray(arr);
  }
}