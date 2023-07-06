package com.Java8.LambdaExpression;

import java.util.Scanner;

public class LambdaThread {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the value form given options: \n"
				+ "A --> First Thread (Numbers)\n"
				+ "B --> Second Thread (Table)\n"
				+ "--------------------------------------------------");
		
		String key = sc.next();
		
		if(key.equalsIgnoreCase("A")) {
		// first thread: Thread name -> Numbers
		Runnable thread1 = ()->{
			// The body of the thread
			
			// print numbers from 1 to 10
			for(int i=0; i<=10; i++) {
				System.out.println("Numbers:- 2" + i);
				
				// after run, thread will sleep for few seconds
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t= new Thread(thread1);
		t.setName("Numbers");
		t.start();
		}
		
		else if(key.equalsIgnoreCase("B")) {
			
		// Second thread: Thread Name-> Table
		Runnable thread2 = ()->{
			
			try {
				System.out.println("The table of two is:");
				// Thread for print the table of 2
				for(int i=1; i<=10; i++) {
					System.out.println(i*2);
					Thread.sleep(1000);
				}
				
			} catch (InterruptedException e2) {
				e2.printStackTrace();
			}
			
		};
		
		Thread t2 = new Thread(thread2);
		t2.setName("Table");
		t2.start();
	}
	}
}
