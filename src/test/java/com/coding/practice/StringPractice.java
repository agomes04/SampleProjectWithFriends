package com.coding.practice;

public class StringPractice {

	public static void main(String[] args) {
		// String literal (Pool, Thread safe, Synchronized, fast performance, IMMUTABLE)
		String name = "Achilles"; // Pool
		name.concat("Gomes"); // IMMUTABLE
		System.out.println(name);
		
		// Heap (Heap, Thread safe, Synchronized, fast performance, IMMUTABLE)
		String object = new String("Gomes"); // Heap
		object.concat("Achilles"); // IMMUTABLE
		System.out.println(object);
		
		// Heap (Heap, Thread safe, Synchronized, slow performance, MUTABLE)
		StringBuffer sbfer = new StringBuffer("Vincent"); // Heap
		sbfer.append(" Gomes"); // MUTABLE
		System.out.println(sbfer);
		
		// Heap (Heap, Not Thread safe, Not Synchronized, fast performance, MUTABLE)
		StringBuilder sbldr = new StringBuilder("Mason"); // Heap
		sbldr.append(" Gomes"); // MUTABLE
		System.out.println(sbldr);
	}

}
