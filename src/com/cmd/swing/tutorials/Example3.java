package com.cmd.swing.tutorials;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example3 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Adding component to jframe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=frame.getContentPane();
		
		JButton closeButton=new JButton("Close");
		contentPane.add(closeButton);
		
		frame.setBounds(50,50,300,200);
		frame.setVisible(true);

	}

}
