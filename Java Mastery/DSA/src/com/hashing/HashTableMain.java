package com.hashing;

import java.util.LinkedList;
import java.util.Scanner;

//chaning -->array of bucket (key ,value)
class HashTable {
	static class Pair {
		private int key; // key
		private String value;// value=name

		public Pair() {
			key = 0;
			value = "";
		}

		public Pair(int key, String value) {
			this.key = key;
			this.value = value;
		}

		public String toString() {

			return "Pair [key=" + key + ", value=" + value + "]";
		}

	}

	private static final int SLOTS = 10; // linked list references by default (null reference )
	private LinkedList<Pair> tabel[]; // linked list of pair

	public int hashFunction(int key) {
		return (key % SLOTS);// Hash function to find the slot
	}

	public HashTable() {
		tabel = new LinkedList[SLOTS]; // Create the array of linked lists
		for (int i = 0; i < SLOTS; i++) {
			tabel[i] = new LinkedList<>(); // Initialize each slot with an empty linked list
		}
	}

	public void put(int key, String value) {
		int slot = hashFunction(key);// Find the slot for the given key

		LinkedList<Pair> bucket = tabel[slot]; // access the bucket (Linked list) in that slot

		// Find the element (key-value) in the bucket in Linear search way
		for (Pair pair : bucket) {
			// If key is duplicated, replace the value
			if (key == pair.key) {
				pair.value = value;
				return;
			}
			
		}
		// if key is not found, create new pair and add into buckets
		Pair pair = new Pair(key, value);
		bucket.add(pair);

	}

	public String get(int key) {

		int slot = hashFunction(key);// Find the slot for the given key
		LinkedList<Pair> bucket = tabel[slot];// Access the bucket in that slot

		// find the element (key -value) in that -linear search
		for (Pair pair : bucket) {
			if (key == pair.key)
				return pair.value;// Return the value if the key is found
		}
		return null; // If key not found, return n
	}
}

public class HashTableMain {
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		Scanner sc = new Scanner(System.in);
		ht.put(1, "Gaurav");
		ht.put(1, "Patil");  //it replace Gaurav;
		ht.put(4, "Abhishek");
		ht.put(5, "Nidhi");
		ht.put(6, "Pratik");
		ht.put(7, "Sakshi");
		ht.put(25, "Rohit");
		ht.put(24, "Sneha");
		ht.put(25, "Mihir"); // collision chaning

		System.out.println("Enter roll to find: ");
		int roll = sc.nextInt();
		String name = ht.get(roll);
		System.out.println("Name found: " + name);
		sc.close();
	}
}
