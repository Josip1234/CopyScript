package com.cmd.swing.tutorials;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example4 {

	public static void main(String[] args) {
		/**
		 * Swing provides a magical and quick solution to the problem of computing the size of the JFrame and JButton.
The pack() method of the JFrame class is that magical solution. The method goes through all the components you
have added to the JFrame and decides their preferred size and sets the size of the JFrame just enough to display all
the components. When you call this method, you do not need to set the size of the JFrame. The pack() method will
calculate the size of the JFrame and set it for you. T
		 */
		JFrame frame=new JFrame("Adding component to jframe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton closeButton=new JButton("Close");
		Container contentPane=frame.getContentPane();
		contentPane.add(closeButton);
		
		frame.pack();
		frame.setVisible(true);

	}

}
