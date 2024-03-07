package Dataexample;
import java.util.*;

public class PositionalList{
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

    public void addNodeAtStart(int data) {
        Node n = new Node(data);
        if (size == 0) {
            head = n;
            tail = n;
            n.next = head;
        } else {
            Node temp = head;
            n.next = temp;
            head = n;
            tail.next = head;
        }
        size++;
    }

    public void print() {
        System.out.print("Positional List:");
        Node temp = head;
        if (size <= 0) {
            System.out.print("List is empty");
        } else {
            do {
                System.out.print(" " + temp.data);
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println();
    }

    public int elementAt(int index) {
        if (index > size) {
            return -1;
        }
        Node n = head;
        while (index - 1 != 0) {
            n = n.next;
            index--;
        }
        return n.data;
    }

    public static void main(String[] args) {
        PositionalList pl = new PositionalList();
        for (int i = 0; i < 25; i++) {
            pl.addNodeAtStart(i + 5);
        }
        pl.print();
        System.out.println("Element at 21st Index = " + pl.elementAt(21));
    }
}
