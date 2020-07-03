package com.flexon.javabasics;

public class C_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 2;
		int results;
		String name = "My name is ";
		
		/* *******************************************************************************
		 *								   Arithmetic                                    *
		 *********************************************************************************/
		System.out.println();
		System.out.println("************************* Relational Operators *************************");
		
		
		//Addition 
		results = x + y;
		System.out.println("Addition "+ x + " + " + y + " = "+ results );
		
		//String (Appends another String)
		System.out.println(name + "Deep");
		System.out.println();
		
		//Subtraction
		results = x - y;
		System.out.println("Subtraction "+ x + " - " + y + " = "+ results );
		
		//Multiplication
		results = x * y;
		System.out.println("Multiplication "+ x + " * " + y + " = "+ results );
		
		//Division
		results = x / y;
		System.out.println("Division "+ x + " / " + y + " = "+ results );
		
		//Modulus
		results = x % y;
		System.out.println("Modulus "+ x + " % " + y + " = "+ results );
		
		//Increment
		results = x++;
		System.out.println("Increment x = " + results );
		
		//Increment
		results = ++x;
		System.out.println("Increment x = " + results );
		
		//Decrement
		results = x--;
		System.out.println("Decrement x = " + results );
		
		//Decrement
		results = --x;
		System.out.println("Decrement x = " + results );
		
		
		/* *******************************************************************************
		 *								   Relational                                    *
		 *********************************************************************************/
		System.out.println();
		System.out.println("************************* Relational Operators *************************");
		
		boolean boolresult;
		
		//Equals (==)
		boolresult = x==y;
		System.out.println("Value of X = " + x + " Value of Y = " + y);
		System.out.println();
		System.out.println("Equals: x" + " == "+ "y" + " = " + boolresult);
		
		//Not Equals (==)
		boolresult = x!=y;
		System.out.println("Not Equals: x" + " != "+ "y" + " = " + boolresult);
		
		//Greater Equals (>=)
		boolresult = x>=y;
		System.out.println("Greater Than Equals: x" + " >= "+ "y" + " = " + boolresult);
		
		//Less Than Equals (<=)
		boolresult = x<=y;
		System.out.println("Less Than Equals: x" + " <= "+ "y" + " = " + boolresult);
		
		//Greater(>)
		boolresult = x>y;
		System.out.println("Greater Than: x" + " > "+ "y" + " = " + boolresult);
		
		//Less Than (<)
		boolresult = x<y;
		System.out.println("Less Than: x" + " < "+ "y" + " = " + boolresult);
	}

}
