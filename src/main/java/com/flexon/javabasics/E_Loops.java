package com.flexon.javabasics;

public class E_Loops {

	public static void main(String[] args) {

		int count = 0;
		int[] newArray = new int[] {100, 200, 300};   // What does this do??
		
		System.out.println("************** For Loop ************");
		for (int i = 0; i < 5; i++) {
			System.out.println("Print - Value of i - " + i);
		}
		
		System.out.println();

		String name = "My Name is Deep"; 
		for (int i = 0; i < name.length(); i++) {
			System.out.println("Letter by Letter - " + name.charAt(i));
		}
		
		System.out.println();

		
		System.out.println("************** For Each Loop ************");

		
		for (int num : newArray)
		System.out.println(num);

		
		System.out.println("************** Print Reverse ************");
		
		for (int i = name.length() - 1 ; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
		System.out.println();

		
		
		System.out.println("***************  While Loop  ***************");
		while (count < 5)
		{
			System.out.println("Print Count Value = " + count);
			count++;
		}	
		
		System.out.println();
		
		
		
		System.out.println("***************  Do While Loop  ***************");
		count = 0;
		do
		{
			System.out.println("Print Do Loop Count Value = " + count);
			count++;
		}while (count < 5);
		
	}
}
