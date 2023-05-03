package com.bridgelabz;
/* implement the frequency of words in a sentence using a LinkedList to do the Hash Table operation in Java:
* Create a MyMapNode class with a Key-Value Pair.
* The Key would be the word and the Value would be the frequency of the word in the sentence.
* Create a LinkedList to store MyMapNodes.
* Implement a Hash Table using an array of LinkedLists. The Hash Table will store the words as Keys
  and the frequency as Values.
* To find the frequency of words in a sentence, split the sentence into words and add them to the Hash Table.*/
public class MyMapNode {
    String key;
    int value;
    MyMapNode next;

    public MyMapNode(String key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
