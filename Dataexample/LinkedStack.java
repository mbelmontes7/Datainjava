// package Dataexample; // Add the missing package declaration

// import java.util.NoSuchElementException;
// import java.util.Stack;

// //LinkedStack.java
// public class LinkedStack<E> extends Stack<E> {
//     private class Node {
//      int plate;
//      Node next;
//      public Node(int current) {
//         plate = current;
//      }
//     }
//     public static class StackOperations { // Change the main method to static
//         public static void main(String[] args) { // Add the missing array brackets
//          int plate;
//          LinkedStack<Integer> lottaPlates = new LinkedStack<>(); // Parameterize the LinkedStack instantiation
//          //let's add some plates
//          plate = 25;
//          for(int i = plate; i < 150; i++) {
//             lottaPlates.push(i+5);
//          }
//          //is the stack empty?
//          if(lottaPlates.isEmpty()) {
//             System.out.println("Empty Stack");
//          } else {
//             //peek at the top
//             System.out.println("Peeking at the top = " + lottaPlates.peek());

//             //show the size
//             System.out.println("Size of the stack = " + lottaPlates.size());

//             //pop off the top one
//             System.out.println("Popping the top = " + lottaPlates.pop());
//          }
//         }
//     }
//     private Node top;
//     //constructor to start an empty stack
//     public LinkedStack() {
//      top = null;
//     }
//     public void push(int current) {
//      Node c = new Node(current);
//      c.next = top;
//      top = c;
//     }
//     public int pop() {
//      int returnPlate;
//      returnPlate = top.plate;
//      top = top.next;
//      return returnPlate;
//     }
//  public boolean isEmpty() {
//      return top == null;
//     }
//         public int size() {
//          int counter = 0;
//          for(Node node = top; node != null; node=node.next) {
//                 counter ++;
//          }
//          return counter;
//         }
//                 public int peek() {
//                  if (top == null) {
//                                 throw new NoSuchElementException();
//                  }
//                  return top.plate;
//                 }
// } // Add this closing brace
