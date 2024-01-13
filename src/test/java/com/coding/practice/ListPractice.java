package com.coding.practice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
	//Interface <Wrapper Class> anyName = new Collection Class<>();  
	static List<Integer> listName = new ArrayList<>(); 
	
	public static void main(String[] args) {
		listName.add(3); 
		listName.add(6); 
		listName.add(9); 
		listName.remove(0); 
		System.out.println(listName.size()); // to find length
		System.out.println(listName);
	}
	
}
