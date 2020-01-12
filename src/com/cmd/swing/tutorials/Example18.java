package com.cmd.swing.tutorials;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SpringLayout;

public class Example18 {

	public static void main(String[] args) {
	   JFrame frame=new JFrame("SpringLayout2");
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   Container contentPane=frame.getContentPane();
	   
	   SpringLayout layout=new SpringLayout();
	   contentPane.setLayout(layout);
	   
	   JButton b1=new JButton("Button 1");
	   JButton b2=new JButton("Little Bigger Button 2");
	   
	   contentPane.add(b1);
	   contentPane.add(b2);
	   
	   layout.putConstraint(SpringLayout.WEST, b1, 10, SpringLayout.WEST, contentPane);
	   

	}

}
