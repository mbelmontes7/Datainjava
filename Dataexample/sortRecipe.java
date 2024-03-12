
// public class Main {
//   public static void main(String[] args) {
//     int steps = {1, 7, 9, 11, 4};
//     System.out.println("Before Sort: " );
//     for(int i = 0; i < steps.length; i++) {
//      System.out.println(steps[i] + ") ");
//     }
//   }
//  }
// public static void sortRecipe(int sortArray[]) {
//     int len = sortArray.length;
//    //start looping through the array
//     for(int j = 1; j < len; j++) {
//      //use a temp variable to keep track
//      int temp = sortArray[j];
//      //we are shifting down, so subtract 1
//      int i = j - 1;
//      //if we are at -1, we went past the beginning
//      //as long as j is > 0 and current bucket of the array
//      //is less than the temp variable, shift elements
//      while((j > -1) && (sortArray[i] > temp)) {
//       sortArray[i+1] = sortArray[i];
//       i--;
//      }
//       sortArray[i+1] = temp;
//     }
//   }

//   public static void sortRecipe(int sortArray[]) {
//     //start looping through the array
//     for(int i = 1; i < sortArray.length; i++) {
//      //start again in the array, this time
//      //decrementing by 1, until you've reached the beginning
//      //and the next element is greater than the current
//      for(int j = i; (j > 0 && sortArray[j-1] > sortArray[j]); j--) {
//       //save a temporary bucket (the ? from the graphic)
//       //re-sort elements so the next is greater than current
//       int temp = sortArray[j];
//       sortArray[j] = sortArray[j-1];
//       sortArray[j-1] = temp;
//      }
//     }
//   }

  //time check
// long startTime = System.nanoTime();
// // //call the Insertion Sort Method
// sortRecipe(steps);
//time check
// long endTime = System.nanoTime();
// long totalTime = endTime - startTime;
// System.out.println("Time taken " + totalTime + " ns");