package com.bridgelabz;
public class MyBinarySearchTree<K extends Comparable<K>> {
    // create a root node
    MyBinaryNode<K> root;

    // initialize root as null
    public MyBinarySearchTree() {
        this.root = null;
    }

    // add a new node to the tree
    public void add(K key) {
        // create a new node with the given key
        MyBinaryNode<K> new_node = new MyBinaryNode<>(key);

        // if the tree is empty, make the new node the root
        if (this.root == null) {
            this.root = new_node;
            return;
        }

        // start at the root
        MyBinaryNode<K> node = this.root;
        while (true) {
            // compare the new key to the current node's key
            int compare = key.compareTo(node.key);
            if (compare == 0) {
                // the key already exists, so don't add it again
                return;
            } else if (compare < 0) {
                // the new key is smaller than the current node's key
                // if there's no left child, add the new node there
                if (node.left == null) {
                    node.left = new_node;
                    return;
                }
                // move to the left child and check again
                node = node.left;
            } else {
                // the new key is larger than the current node's key
                // if there's no right child, add the new node there
                if (node.right == null) {
                    node.right = new_node;
                    return;
                }
                // move to the right child and check again
                node = node.right;
            }
        }
    }

    // print the nodes in order
    public void printInOrder() {
        printInOrder(this.root);
    }

    // print the nodes in order starting from a given node
    private void printInOrder(MyBinaryNode<K> node) {
        if (node != null) {
            // recursively print the left subtree
            printInOrder(node.left);

            // print the current node
            System.out.print(node.key + " ");

            // recursively print the right subtree
            printInOrder(node.right);
        }
    }
}

