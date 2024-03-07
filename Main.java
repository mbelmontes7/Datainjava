import java.util.*;


// How to Iterate Set in Java
// In this example, we will learn how to iterate over a Set in Java. We will use the Set interface and its implementation classes such as HashSet and TreeSet to demonstrate how to iterate over a Set in Java.
public class Main {
  public static void main(String[] args) {
    //put all code after this line
    //create our Set
    Set<String> trees = new HashSet<>(); //set each element is unique
    trees.add("Larch");
    trees.add("Pine");
    trees.add("Balsam");
    trees.add("Birch");
    trees.add("Ash");

    //iterate over set 
    for (String s : trees) {
      System.out.println("Tree = " + s);
      trees.forEach(System.out::println);

      Iterator<String> iterator = trees.iterator();
      while (iterator.hasNext()) {
        System.out.println("Iterator Result = " + iterator.next());
      }
    }

    //create our Set
    Set<String> trees2 = new TreeSet<>();
    trees2.add("Larch");
    trees2.add("Pine");
    trees2.add("Balsam");
    trees2.add("Birch");
    trees2.add("Ash");
    Iterator<String> iterator2 = trees2.iterator();
    while (iterator2.hasNext()) {
      System.out.println("Iterator Result = " + iterator2.next());
    }

    Set<Double> scores = new TreeSet<>();
    scores.add(1.59343);
    scores.add(.9934847);
    scores.add(-3.3444);
    Iterator<Double> iterator3 = scores.iterator();
    while (iterator3.hasNext()) {
      System.out.println("Score: " + iterator3.next());
    }
  }
}

//Explanation in easy terms to learn 
/* 
A Set in Java is like a real-world collection of unique items, like a stamp collection. 
Each stamp can only appear once in the collection.

HashSet and TreeSet are two types of Sets.
 A HashSet doesn't care about the order of its elements, like a box of random unique stamps.
  A TreeSet, on the other hand, always keeps its elements in ascending order, like a stamp album organized by year.

To look at each item in the Set, you can use a 'for' loop or a 'forEach'
 loop, which are like going through each stamp one by one.

The Iterator interface is another way to go through each item. 
It's like having a bookmark that remembers where you are in the collection.
It has methods to check if there's a next item and to get the next item, 
like moving the bookmark to the next stamp and looking at it. /* */