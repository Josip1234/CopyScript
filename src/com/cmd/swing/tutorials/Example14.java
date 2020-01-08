package com.cmd.swing.tutorials;

import java.awt.Container;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example14 {

	public static void main(String[] args) {
          
		/***
		 * The GridBagLayout lays out components in a grid of rectangular cells arranged in rows and columns similar to the
GridLayout. However, it is much more powerful than the GridLayout. Its power comes with an added complexity in
its usage. It is not as easy to use as the GridLayout. There are so many things you can customize in the GridBagLayout
that it becomes hard to learn and use all of its features quickly.
It lets you customize many properties of the components, such as size, alignment, expandability, etc. Unlike the
GridLayout, all cells of the grid do not have to be of the same size. A component does not have to be placed exactly
in one cell. A component can span multiple cells horizontally as well as vertically. You can specify how a component
inside its cell should be aligned.
		 */
		
		String title="GridBagLayout in its Simplest Form";
		JFrame frame=new JFrame(title);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=frame.getContentPane();
		contentPane.setLayout(new GridBagLayout());
		
		for (int i = 1; i <= 9; i++) {
			contentPane.add(new JButton("Button "+i));
		}
		frame.pack();
		frame.setVisible(true);
		
	}

}
