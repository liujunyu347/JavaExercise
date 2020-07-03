package com.flexon.javabasics;

public class H_Methods {

	public static void main(String[] args) {
		
		System.out.println("Print Method");  // pre-defined Java method
		
		myMethod();
		
		myStringMethod("Deep");
		
		addMethod(5,6);
		
		int results = addReturnMethod (10,10);    
		System.out.println("Addition is " + results);
	}

	public static void myMethod() {
		System.out.println("Hello!!");
		System.out.println();
	}
	
	public static void myStringMethod (String name) {
		System.out.println("My Name is " + name);
		System.out.println();
	}
	
	public static void myIntMethod (int num) {
		System.out.println("Number is " + num);
		System.out.println();
	}
	
	public static void addMethod (int num, int num2) {
		System.out.println("Addition is " + (num + num2));
		System.out.println();
	}
	
	//***************  Return Methods  *****************
	public static int addReturnMethod (int num, int num2) {
		return num + num2;
	}
	
	//***************  Static and Non Static Methods  *****************
	//For static methods we don't need to create instance of the class
	//Non-Static method can only be accesses through the instance of the class
	
	public int subReturnMethod (int num, int num2) {
		return num - num2;
	}	
	
	public int divReturnMethod (int num, int num2) {
		return num / num2;
	}
}
