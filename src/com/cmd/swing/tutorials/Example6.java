package com.cmd.swing.tutorials;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example6 {

	public static void main(String[] args) {
		/***
		 * The FlowLayout is the simplest layout manager in Swing. It lays out the components horizontally, and then vertically.
It lays the components in the order they are added to the container. When it is laying the components horizontally, it
may lay them left to right, or right to left. A FlowLayout tries to place all components into one row, giving them their preferred size. If all components do
not fit into one row, it starts another row. 
Every layout manager has to compute the height and width of the space
where it needs to lay out all components. A FlowLayout asks for width, which is the sum of the preferred widths of all
components. It asks for height, which is the height of the tallest component in the container. It adds extra space to the
width and height to account for horizontal and vertical gaps between the components. 

		 */
		
		
		JFrame frame=new JFrame("Flow layout test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane=frame.getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		for (int i = 1; i <= 3; i++) {
			contentPane.add(new JButton("Button "+i));
			
		}
		frame.pack();
		frame.setVisible(true);

	}

}
