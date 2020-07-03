package com.flexon.javabasics;

public class G_StringsDemo {

	public static void main(String[] args) {
		
		String str = "ABCDEFDEF";
		
		System.out.println( "Length of String is: " + str.length());
		
		//Get one letter or part of string
		System.out.println("Print a Character " + str.charAt(4));
		System.out.println();
		
		//Checking if string contains another string or character
		System.out.println("Does str contains DEF " + str.contains("DEF"));		
		System.out.println("Does str contains DEEP " + str.contains("DEEP"));
		System.out.println();
		
		//Get the index of a letter or where first word occurs - left to right
		System.out.println("Index of word DEF " + str.indexOf("DEF"));
		System.out.println("Index of word DEF " + str.indexOf("E"));
		System.out.println();

		//First Occurence from right to left
		System.out.println("Last Index of word DEF " + str.lastIndexOf("DEF"));
		System.out.println("Last Index of word E " + str.lastIndexOf("E"));
		System.out.println();

		//Getting a part of String
		System.out.println("Print Substring " + str.substring(2));
		System.out.println("Print Substring " + str.substring(4));

		System.out.println("Print Substring with two args " + str.substring(2,4));
		System.out.println();

		//Comparing strings
		System.out.println("************ Comparing Strings ************");
		System.out.println();
		
		if (str == "ABCDEFDEF")
			System.out.println("Comparing String using ==");
		
		if(str.equals("ABCDEFDEF"))
			System.out.println("Comparing String using .equals");
		
		if(str.equalsIgnoreCase("abcdefDEF"))
			System.out.println("Comparing String using .equalsIgnoreCase");
		
	}

}
