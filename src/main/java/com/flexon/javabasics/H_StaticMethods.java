package com.flexon.javabasics;

public class H_StaticMethods {
	public static void main(String[] args) {
	
		//Static Methods
		H_Methods.addMethod(5, 6);
		H_Methods.myIntMethod(1000);
		
		//Non-Static Method   --> Only visible when instance is created
		H_Methods newMethodsInstance = new H_Methods();
		newMethodsInstance.divReturnMethod(5, 5);  
		
		int result = newMethodsInstance.subReturnMethod(5, 3);
		System.out.println("Result of Subtraction " + result);
		
		newMethodsInstance.addMethod(2, 2);   // warning because we are calling static
											  // static method from the instance created
	}
}
