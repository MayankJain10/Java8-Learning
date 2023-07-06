package com.Java8.LambdaExpression;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindowApplication {
	public static void main(String[] args) {
		
		// window : object JFrame
		JFrame jf = new JFrame("My Window");
		jf.setSize(400, 400);
		jf.setLayout(new FlowLayout());
		
		// create button and add in JFrame
		JButton button = new JButton("Click Me!");
		button.addActionListener((ActionEvent e)->{
			System.out.println("Button Click");
			JOptionPane.showMessageDialog(null, "Hey, Button Click");
		});
		/*new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button Click");
				JOptionPane.showMessageDialog(null, "Hey, Button Click");
			}
		}*/
				
		
		jf.add(button);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}

}
