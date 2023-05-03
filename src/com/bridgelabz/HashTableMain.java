package com.bridgelabz;

public class HashTableMain {
    // Define the main method
    public static void main(String[] args) {
        // Create a sentence string
        String sentence = "To be or not to be";

        // Split the sentence string into an array of words
        String[] word_list = sentence.split(" ");

        // Create a new hash table with the same length as the word array
        MyHashTable hash_table = new MyHashTable(word_list.length);

        // Loop through the word array and add each word to the hash table with a value of 1
        for (String word : word_list) {
            hash_table.add(word, 1);
        }

        // Loop through the word array again
        for (String word : word_list) {
            // Get the frequency of the word in the hash table
            int frequency = hash_table.getFrequency(word);

            // Print the word and its frequency to the console
            System.out.printf("The word '%s' appears %d times in the sentence.\n", word, frequency);
        }
    }
}
