package Dataexample;


// public class Main {
//     public static void main(String[] args) {
//         NodeInsertio nodeInsertio = new NodeInsertio();
//         Node root = null;

//         int[] numbers = {5, 3, 7, 6, 2, 1, 8, 4};
//         for (int number : numbers) {
//             root = nodeInsertio.insertNode(root, number);
//         }

//         printInOrder(root);
//     }

//     public static void printInOrder(Node node) {
//         if (node != null) {
//             printInOrder(node.leftChild);
//             System.out.println(node.data);
//             printInOrder(node.rightChild);
//         }
//     }
// }
//In a binary search tree, the position of a value relative to the root (or any node, in fact) is determined by whether it is greater than or less than the value of the node.

// - If the value is less than the value of the node, it goes to the left side.
// - If the value is greater than the value of the node, it goes to the right side.

// This rule applies recursively to all nodes in the tree, not just the root. This property of binary search trees allows for efficient search and insertion operations.//