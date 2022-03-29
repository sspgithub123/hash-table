package com.bridgelabz;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        System.out.println("Welcome to the hash table program");
        Hashtable<Integer, String> h = new Hashtable<>();// Created Hashtable

        // Adding the mappings to hashtable
        h.put(1, "H");
        h.put(2, "A");
        h.put(3, "S");
        h.put(4, "H");
        h.put(5, "T");
        h.put(6, "A");
        h.put(7, "B");
        h.put(8, "L");
        h.put(9, "E");

        System.out.println("Welcome to the Hash table");
        System.out.println(h);
        System.out.println(" ");
        System.out.println("----------------------");

        // To Get the value of key
        String v = h.get(4); // to get the data at 4th index
        System.out.println("The value of the key is: ");
        System.out.println(v); // to print the value at above index
        System.out.println(" ");
        System.out.println("--------------------");

        // Removing a key and its value
        h.remove(5); // to delete key and value at index 5
        System.out.println("Removing the key and value: ");
        System.out.println(h);
        System.out.println(" ");
        System.out.println("-------------------");

    }
}
