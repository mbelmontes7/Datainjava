package Dataexample;

public class    Bubbleexample{
	
	// bubble sort = pairs of adjacent elements are compared, and the elements
	//		            swapped if they are not in order.
	
	//				 Quadratic time O(n^2)
	//				 small data set = okay-ish
	//				 large data set = BAD (plz don't)
	
	public static void main(String[] args) {
		
		int array[] =  {9, 1, 8, 2, 7, 3, 6, 4, 5}; // 9 elements
		
		bubbleSort(array); // call the bubbleSort method
		
		for(int i : array) { // for each element in the array
			System.out.print(i); // print the element
		}
	}
	
	public static void bubbleSort(int array[]) { // bubbleSort method
		 // first loop traverses to the end of the list
		for(int i = 0; i < array.length - 1; i++) { // 9 - 1 = 8
			for(int j = 0; j < array.length - i - 1; j++) { // 9 - 0 - 1 = 8
				if(array[j] > array[j+1]) { // if the current element is greater than the next element
					int temp = array[j]; // create a temporary holding variable
					array[j] = array[j+1]; // flip the current element to the next element
					array[j+1] = temp; // flip the next element to the current element
				}
			}
		}
	}
}
