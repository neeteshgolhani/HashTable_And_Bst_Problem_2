package com.bridgelabz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class HashTableMain {
    // Define the main method
    public static void main(String[] args) {
        // Create a para string
        String para = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        // Split the para string into an array of words
        String[] word_list = para.split(" ");

        // Create a new hash table with the same length as the word array
        MyHashTable hash_table = new MyHashTable(word_list.length);

        // Loop through the word array and add each word to the hash table with a value of 1
        for (String word : word_list) {
            hash_table.add(word, 1);
        }
        // Remove the word "avoidable" from the hash table
        hash_table.remove("avoidable");
        // Get the list of words and sort them alphabetically
        List<String> word_list_sorted = new ArrayList<>(hash_table.getWords());
        Collections.sort(word_list_sorted);

        // Print out the frequencies of the words
        for (String word : word_list_sorted) {
            int frequency = hash_table.getFrequency(word);
            System.out.printf("The frequency of word '%s' is %d\n", word, frequency);
        }
    }
}