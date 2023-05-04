package com.bridgelabz;
// Define MyBinaryNode class with generic type K extending Comparable<K>
public class MyBinaryNode<K extends Comparable<K>> {
    K key; // Key of the node
    MyBinaryNode<K> left; // Left child node
    MyBinaryNode<K> right; // Right child node
    // Constructor to create a new node with a given key
    public MyBinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
