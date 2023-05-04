package com.bridgelabz;
import java.util.List;
import java.util.ArrayList;
public class MyHashTable {
    // Define class variables
    int bucket_size;
    LinkedList[] buckets;
    private MyMapNode head;

    // Define the constructor method
    public MyHashTable(int bucket_size) {
        // Initialize the bucket size and create an array of linked lists
        this.bucket_size = bucket_size;
        this.buckets = new LinkedList[bucket_size];

        // Loop through the bucket array and create a new linked list for each bucket
        for (int i = 0; i < bucket_size; i++) {
            this.buckets[i] = new LinkedList();
        }
    }

    // Define a private method to get the hash value of a key
    private int getHash(String key) {
        return Math.abs(key.hashCode() % this.bucket_size);
    }

    // Define the add method to add a key-value pair to the hash table
    public void add(String key, int value) {
        // Get the hash value of the key
        int hash_key = this.getHash(key);

        // Add the key-value pair to the linked list in the corresponding bucket
        this.buckets[hash_key].add(key, value);
    }

    // Define the getFrequency method to get the frequency of a key in the hash table
    public int getFrequency(String key) {
        // get the hash key for the given key
        int hash_key = this.getHash(key);
        // get the head of the linked list at the bucket corresponding to the hash key
        MyMapNode node = this.buckets[hash_key].head;
        // traverse the linked list to find the node with the given key
        while (node != null) {
            if (node.key.equals(key)) {
                // return the value of the node if the key matches
                return node.value;
            }
            node = node.next;
        }
        // return 0 if the key is not found in the hash table
        return 0;
    }

    public List<String> getWords() {
        // create a new ArrayList to hold the words in the hash table
        List<String> words = new ArrayList<>();
        // iterate over each bucket in the hash table
        for (LinkedList bucket : this.buckets) {
            // get the head of the linked list at the current bucket
            MyMapNode node = bucket.head;
            // traverse the linked list to add each word to the words ArrayList
            while (node != null) {
                words.add(node.key);
                node = node.next;
            }
        }
        // return the words ArrayList
        return words;
    }

    public void remove(String key) {
        // get the hash key for the given key
        int hashKey = this.getHash(key);
        // initialize variables for previous node and current node
        MyMapNode prevNode = null;
        MyMapNode currentNode = this.buckets[hashKey].head;
        // loop through the linked list until the end or until the node with the given key is found
        while (currentNode != null) {
            if (currentNode.key.equals(key)) {
                // if the node to remove is the head of the linked list
                if (prevNode == null) {
                    this.buckets[hashKey].head = currentNode.next;
                } else {
                    // if the node to remove is not the head of the linked list
                    prevNode.next = currentNode.next;
                }
                // exit the method after removing the node
                return;
            }
            // update previous and current nodes
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
    }
}