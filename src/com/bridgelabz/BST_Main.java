package com.bridgelabz;

public class BST_Main {
    public static void main(String[] args) {
        // Create a new instance of the binary search tree
        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();
        bst.add(56); // Add root node with key=56
        bst.add(30); // Add node with key=30
        bst.add(70); // Add node with key=70
        bst.printInOrder(); // Print the nodes in order
    }
}