package Dataexample;


import java.util.*;


public class HashTable {
    public static void main(String[] args) {
        // create a new hash table to store library books by id and subject
        Hashtable<String, String> libraryBooks = new Hashtable<>();
        // (a) store books in a library by code and subject area
        libraryBooks.put("748.5", "Stained Glass");
        libraryBooks.put("553.8", "Gems");
        libraryBooks.put("363.739", "Air Pollution");
        // (b) retrieve a book by its id
        System.out.println("Retrieve book by id 748.5: " + libraryBooks.get("748.5"));
        System.out.println("Retrieve book by id 300.8: " + libraryBooks.get("300.8"));
        // (c) check to see if id exists
        System.out.println("If id 553.8 exists:" + libraryBooks.containsKey("553.8"));
        System.out.println("if id 448.7 exists:" + libraryBooks.containsKey("448.7"));
        // (d) check to see if a subject exists
        System.out.println("If subject Gems exists:" + libraryBooks.containsValue("Gems"));
        // (e) print out all the values contained in the hash table
        Enumeration<String> enumeration = libraryBooks.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println("hashtable values: " + enumeration.nextElement());
        }
        // (f) find the size of the hash table
        System.out.println("Size of hashtable in Java: " + libraryBooks.size());
        // (g) clear the hash table
        libraryBooks.clear();
        // (h) check to see if hash table is empty
        System.out.println("Is hash table empty?" + libraryBooks.isEmpty());
        
    }
}

/*
 * Follow-up Questions Answer Key
1. You will get a compile error if you insert a key value pair into a hash table with no key. For example, the code: libraryBooks.put("Stained Glass"); will cause the following error: method Map.put(Object,Object) is not applicable

2. Yes, the search is case-sensitive. For example, the code: System.out.println('If subject Gems exists:' + libraryBooks.containsValue("gems")); will return the following: If subject Gems exists:false

3. When the key does not exist, the return value is null. For example, the code: System.out.println("Retrieve book by id 900.800: " + libraryBooks.get("900.800")); returns the output: Retrieve book by id 900.800: null
 */