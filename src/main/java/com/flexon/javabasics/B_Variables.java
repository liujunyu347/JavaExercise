package com.flexon.javabasics;

public class B_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//This is a comment -- We can write anything to explain our code Blah Blah Blah
	/* *******************************************************************************
	 *									VARIABLES                                    *
	 *********************************************************************************/
		
	int x;      
	x = 1;        
	x = 2;
	x = 3;     
	x = 4;        
	
	System.out.println(x);
	String abc = "Hello World";    // Strings and int are data types
	
	/* *******************************************************************************
	 *									DATATYPES                                    *
	 *********************************************************************************/
	 
	int inT = 12345678;    // Range: -2,147,483,648(-2^31) to 2,147,483,647(2^31-1)
	short shorT = 12345;     // Range: -32768(-2^15) to 32767(2^15-1)  - 2 time smaller than int
	byte Byte = 123;        // Range: -128 to 127  - 4 times smaller than int
    long Long = 123456789;  // Range: -9,223,372,036,854,775,808(-2^63) .. 9,223,372,036,854,775,807(2^63-1)
    float _float = 12.01f;    // Used to save decimal point data; range is similar to int
    Double _double = 100.56d;  // Used to save large decimal point data; range is similar to long
    
    char chaR = 's';       // Used to only save a character in variable
    boolean booL = true;   // Used to save only true or false ; 1 or 0
    String words = "hello my Name is";  //Used to save words, sentences and other letters data
    
	}

}
