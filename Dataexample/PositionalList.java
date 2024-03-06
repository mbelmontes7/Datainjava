package Dataexample;
import java.util.*;


public class PositionalList {
    //initialize everything to 0. Head and tail are empty to start
    public int size = 0;
    public Node head = null;
    public Node tail = null;

    //create the class for the node
    class Node {
        int data;
        Node next;

        //constructor to setup the node
        public Node(int data) {
            this.data = data;
        }
    }

    public void addNodeAtStart(int data) { //add node at the start
        Node n = new Node(data); //create a new node
        if (size == 0) { //if the size is 0
            head = n;   
            tail = n;
            n.next = head; //set the next node to head
        } else { //if the size is not 0
            Node temp = head; //create a new node
            n.next = temp; //set the next node to temp
            head = n;
            tail.next = head;
        }
        size++;    //increment the size
    }

    public void print() {
        System.out.print("Positional List:");
        Node temp = head; 
        if (size <= 0) { //if the size is less than or equal to 0
            System.out.print("List is empty");
        } else {
            do {
                System.out.print(" " + temp.data); //print the data
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PositionalList pl = new PositionalList();
        for (int i = 0; i < 25; i++) {  //for loop to add 25 nodes
            pl.addNodeAtStart(i + 5);   //add node at the start
        }
        pl.print();
        System.out.println("Element at 21st Index = " + pl.elementAt(21)); //print the element at 21st index
    }
    
    public int elementAt(int index) { //method to get the element at a specific index
        if(index > size){ //if the index is greater than the size
            return -1;
        }
        Node n = head; //create a new node
        while(index - 1 != 0){ //while the index - 1 is not equal to 0
            n=n.next; //set the next node
            index--;    //decrement the index -- It is commonly used to keep track of the current position or index in a data structure, such as an array or a list. By decrementing the index, we are moving to the previous position in the data structure.
        }
        return n.data;
    }
}
