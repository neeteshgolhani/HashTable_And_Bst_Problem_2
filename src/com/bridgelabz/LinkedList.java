package com.bridgelabz;

public class LinkedList {
    MyMapNode head; // Declare a MyMapNode called "head" that will be used to point
    // to the first node in the LinkedList.

    public LinkedList() { // Constructor method for the LinkedList class.
        this.head = null; // Set the head to null, indicating that the LinkedList is initially empty.
    }

    public void add(String key, int value) { // Method to add a new node to the LinkedList,
        // taking a String key and an integer value as parameters.
        MyMapNode node = this.head; // Create a new MyMapNode called "node" and set it equal to the head
        // of the LinkedList.

        while (node != null) { // While loop that will iterate through the LinkedList until it
            // reaches the end or finds a node with the same key as the one we're trying to add.
            if (node.key.equals(key)) { // Check if the key of the current node matches the key
                // we're trying to add.
                node.value += value; // If it does, increment the value of the node by the value
                // we're trying to add.
                return; // Exit the method.
            }
            node = node.next; // If it doesn't, move on to the next node in the LinkedList.
        }

        MyMapNode new_node = new MyMapNode(key, value); // If we've reached the end of the LinkedList
        // without finding a node with the same key, create a new MyMap
        new_node.next = this.head;
        this.head = new_node;
    }
}
