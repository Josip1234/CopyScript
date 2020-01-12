package com.cmd.swing.tutorials;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class Example17 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("SpringLayout2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane=frame.getContentPane();
		SpringLayout springLayout=new SpringLayout();
		contentPane.setLayout(springLayout);
		
		JButton b1=new JButton("Button 1");
		JButton b2=new JButton("Little Bigger Button 2");
		
		SpringLayout.Constraints b1c=new SpringLayout.Constraints();
		SpringLayout.Constraints b2c=new SpringLayout.Constraints();
		
		Spring yPadding=Spring.constant(20);
		
		b1c.setX(Spring.constant(10));
		b1c.setY(yPadding);
		
		b2c.setX(Spring.constant(150));
		b2c.setY(yPadding);
		
		contentPane.add(b1,b1c);
		contentPane.add(b2,b2c);
		
		frame.pack();
		frame.setVisible(true);
		

	}

}
