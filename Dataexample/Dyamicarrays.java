package Dataexample;
import java.util.*;

public class Dyamicarrays {
 public static void main(String[] args) {
  System.out.println("Hello - Welcome to Dynamic Arrays");
 }
 //new class for dynamic arrays
 public static class DynamicArray {
  //create the array
  int[] topScores;
  //we'll create an array that's 1 bucket
  //this is called a constructor
  public DynamicArray() {
   topScores = new int[1];
  }
   //let's pretend we have received another top score, so we'll set our position/bucket in the array to 2
  int bucket = 2;
  public int get(int bucket) {
   if(bucket >= topScores.length) {
    return 0;
   } else {
    return topScores[bucket];
   }
  }
  
  void put(int bucket, int value) {
   if(bucket >= topScores.length) {
    //we're already bigger than the array allows; increase the size
    int updatedSize = 2 * bucket;
    int[] newScores = new int[updatedSize];
    System.arraycopy(topScores, 0, newScores, 0, topScores.length);
    topScores = newScores;
    System.out.println("Array increased to " + updatedSize);
   }
   topScores[bucket] = value;
  }
 }
}