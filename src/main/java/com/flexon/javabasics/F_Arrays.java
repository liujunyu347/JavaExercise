package com.flexon.javabasics;

public class F_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] thisClass = new String[10]; //Initializing an Array with 10 fixed elements
		
		thisClass[0] = "Deep";       //Array starts with 0 index 
		thisClass[9] = "John";
		
		System.out.println("******** String Array ********");
		System.out.println(thisClass[0]);
		System.out.println(thisClass[1]);
		System.out.println(thisClass[9]);	
		
		System.out.println();
		System.out.println();

		int[] scores = new int[10]; //Initializing an Array with 10 fixed elements
		
		scores[0] = 100;       //Array starts with 0 index 
		scores[9] = 90;
		
		System.out.println("******** Int Array ********");
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[9]);
		
		System.out.println();
		System.out.println();
		
		//Out of bound array 
		//System.out.println(scores[10]);
		
		int[] newArray = new int[] {100, 200, 300};   // What does this do??
		
		thisClass = new String[15];    // Creating new size of Array : Does this have the old data

		
	}

}
