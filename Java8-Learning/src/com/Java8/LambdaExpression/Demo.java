package com.Java8.LambdaExpression;

interface lambda{
	public void lambdaExpressionMethod();
}

public class Demo{
	public static void main(String[] args) {
		lambda lam = ()->{
			System.out.println("Hello Lambda!");
		};
		lam.lambdaExpressionMethod();
	}
}