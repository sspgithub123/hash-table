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
    }
}
