package Dataexample;

import java.util.HashMap;
import java.util.Map;

public class map { // Add missing class declaration
    public static void main(String[] args) { 
        Map<String, Integer> arrayCars = new HashMap<>(); 
        //keys and values
        //HashMap is not ordered
        //LinkedHashMap is ordered
        //TreeMap sorts in natural order
        //HashMap is the most efficient
        //associative array
        //lookup type of data structure student id and student name as for example 
        arrayCars.put("Toyota", 6); //put method means add to the array
        arrayCars.put("Ford", 10); //if you know the key you can get the value
        arrayCars.put("Honda", 5);
        arrayCars.put("Chrysler", 4);
        arrayCars.put("Honda", 10);

        System.out.println(arrayCars.get("Honda"));
        System.out.println(arrayCars.containsValue(10)); 

        if (arrayCars.containsKey("Honda")) { 
            System.out.println(arrayCars.containsKey("Honda")); //containsKey is a method that checks if the key is in the array
        }

        System.out.println(arrayCars.size()); //size is a method that returns the size of the array
    }
}
//Notes from the lecture CHAPTER 10 MAPS

//map array data type stores data in key value pairs
//each key is unique and is associated with a value
//keys are used to access elements
//look up type situation    
//put method adds elements to the array
//get method retrieves elements from the array
//containsValue method checks if a value is in the array
//containsKey method checks if a key is in the array
//size method returns the size of the array\

