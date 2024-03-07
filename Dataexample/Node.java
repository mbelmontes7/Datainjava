package Dataexample;

//First, create a Node class
class Node {
    //The left and right child of the current node are created,
    //as well as the current node and its key value
    int key;
    Node left, right;
    public Node(int item)
    {
     key = item;
     left = right = null;
    }
   }
   //Now in the BinaryTree class file, add the code to create the new Node (root) and invoke the constructors
   class BinaryTree {
    
    // Root
    Node root;
    
    // Constructors
    BinaryTree(int key) {
     root = new Node(key);
    }
    BinaryTree() {
     root = null;
    }
   }
   //Finally edit the Main.java file to create the main function to invoke the tree
   public class Main {
   public static void main(String args)
   {
     BinaryTree tree = new BinaryTree();
    
     // Create root
     tree.root = new Node(1);
    
    //The tree now looks like this:
    /*
    
     1
     / \
     NULL NULL
    */
     tree.root.left = new Node(2);
     tree.root.right = new Node(3);
    
    /* Now we've moved 2 and 3, which become children of
     1 left (2) and right (3)
    
      1
      / \
     2 3
     / \ / \
     NULL NULL NULL NULL
     */
    
    //last step
    tree.root.left.left = new Node(4);
    
     /* Now we make 4 become the left-hand child of 2, the rest are empty
     4 becomes left child of 2
      1
      / \
      2 3
     / \ / \
     4 NULL NULL NULL
     / \
     NULL NULL
    */
   }
   