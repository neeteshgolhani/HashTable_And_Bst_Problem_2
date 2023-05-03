package com.bridgelabz;

public class MyHashTable {
    // Define class variables
    int bucket_size;
    LinkedList[] buckets;

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
        // Get the hash value of the key
        int hash_key = this.getHash(key);

        // Loop through the linked list in the corresponding bucket and return the value of the key if it is found
        MyMapNode node = this.buckets[hash_key].head;
        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }

        // Return 0 if the key is not found
        return 0;
    }
}