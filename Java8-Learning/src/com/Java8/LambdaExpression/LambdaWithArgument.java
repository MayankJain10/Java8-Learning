package com.Java8.LambdaExpression;

public class LambdaWithArgument {
	public static void main(String[] args) {
		Lambda lam = (a, b)->{
			return a+b;
		};
		int result = lam.sum(10, 20);
		System.out.println("The sum of two numbers is: " + result);
		
		
		Length len = (str)->{
			return str.length();
		};
		int info = len.getlength("Mayank Jain");
		System.out.println("The length of the string is: " + info);
	}
}
