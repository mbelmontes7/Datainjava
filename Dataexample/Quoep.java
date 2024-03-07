package Dataexample;
import java.util.PriorityQueue; // Add the missing import statement

public class Quoep {
    public static void main(String[] args) {
        PriorityQueue<String> myPriorityQueue = new PriorityQueue<>();
        // All code in the lesson goes after this line
        myPriorityQueue.add("Augustus"); // Fix the invalid character constant
        myPriorityQueue.add("Tiberius"); // Fix the invalid character constant
        myPriorityQueue.add("Caligula"); // Fix the invalid character constant
        myPriorityQueue.add("Claudius"); // Fix the invalid character constant
        myPriorityQueue.add("Nero"); // Fix the invalid character constant
        myPriorityQueue.add("Galba"); // Fix the invalid character constant
        myPriorityQueue.add("Otho"); // Fix the invalid character constant
        myPriorityQueue.add("Aulus Vitellius"); // Fix the invalid character constant
        myPriorityQueue.add("Vespasian"); // Fix the invalid character constant
        myPriorityQueue.add("Titus"); // Fix the invalid character constant
        myPriorityQueue.add("Domitian"); // Fix the invalid character constant
        myPriorityQueue.add("Nerva"); // Fix the invalid character constant

        myPriorityQueue.remove(); // Move this statement inside the main method
        System.out.println(myPriorityQueue); // Move this statement inside the main method
    }
} // Remove the extra closing brace
