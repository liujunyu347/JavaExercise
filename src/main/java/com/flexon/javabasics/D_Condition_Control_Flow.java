	package com.flexon.javabasics;

public class D_Condition_Control_Flow {

	public static void main(String[] args) {

		int value = 1;
		
		// ***************  If statement  ***************
		if(value == 1) 
			System.out.println("Value is equal to 1");
		
		
		// ***************  If - else  ***************
		if(value == 2) 
			System.out.println("Value is equal to 1");
		else 
		    System.out.println("Value is not equal to 1");
		
		
		// ***************  Else If  ***************
		value = 3;
		if(value == 1) 
			System.out.println("Value is equal to 1");
		else if (value == 2)
		    System.out.println("Value is not equal to 1");
		else if (value == 3)
		    System.out.println("Value is not equal to 1");
		else
			System.out.println("Value is not equal to 1");

		
		System.out.println();
		System.out.println();
		
		// Demonstrate not true ! flag 
		
		boolean flag = true;
		
		if(flag)
			System.out.println("This value of this flag is True");
		else 
			System.out.println("The value of this flag is False");
		
		
		System.out.println();
		System.out.println();
		
		// ***************  Case Switch Statement  ***************
		
		int month = 13;
		
		switch(month) {
		
		case 1 : System.out.println("January");
		       break;
		case 2 : System.out.println("February");
	       break;  
		case 3 : System.out.println("March");
	       break;
		case 4 : System.out.println("April");
	       break;
		case 5 : System.out.println("May");
	       break;
		case 6 : System.out.println("June");
	       break;
		case 7 : System.out.println("July");
	       break;
		case 8 : System.out.println("August");
	       break;
		case 9 : System.out.println("September");
	       break;
		case 10 : System.out.println("October");
	       break;
		case 11 : System.out.println("November");
	       break;
		case 12 : System.out.println("December");
	       break;
	    default: System.out.println("Not a Valid month");   
	       break;
		}
		
	}
}
