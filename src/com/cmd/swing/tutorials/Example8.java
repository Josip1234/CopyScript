package com.cmd.swing.tutorials;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example8 {

	public static void main(String[] args) {
		/**
		 * it has very limited use in a real world
applications because of the limitations discussed in this section. It is typically used for prototyping.
		 */
		JFrame frame=new JFrame("Flow layout nesting");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(new FlowLayout());
		JPanel panel=new JPanel();
		
		for (int i = 1; i <= 30; i++) {
			panel.add(new JButton("Button "+i));
		}
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);

	}

}
