package Dataexample;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.SortedMap;

//Sorted Maps in Data Structures: Definition & Overview


public class students {
 public static void main (String[] args) {
  // Create a TreeMap
  // Student IDs and money raised
  TreeMap<Integer, Integer> student = new TreeMap<Integer, Integer>();
  student.put(9, 30);
  student.put(10, 25);
  student.put(5, 15);
  System.out.println("The students that volunteered in Grade 5 are: " + student.subMap(10, 20)); //subMap is a method that returns a portion of the array
 }
}

// Lesson sumary 
/* 
The TreeMap is an extension of the map data type where regardless of the order 
in which the key-value pairs are inserted, the key-value pairs will always be saved in an
 order that is sorted by the key. To find the first or the lowest value of the key, use the 
 firstEntry() method. The lastEntry() method can be used to retrieve the highest value of th
  key stored in the TreeMap. The floorKey() retrieves next lowest key (equal to or lower than) 
  compared to a given key value . The ceilingKey() retrieves the key that is the next greatest
   key (equal to or higher than) compared to a given key value. Both floorKey and ceilingKey 
   return null if no key matching the criteria is found.

The higherKey() method retrieves the next higher key in the TreeMap, and the l
owerKey() retrieves the next lower key in the TreeMap. The subMap(fromKey,toKey) 
retrieves all key-value pairs starting from fromKey(inclusive) and ending at toKey(exclusive). */