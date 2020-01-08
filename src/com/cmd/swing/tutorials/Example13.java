package com.cmd.swing.tutorials;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example13 {

	public static void main(String[] args) {
		
		/***
		 * 
		 * A GridLayout arranges components in a rectangular grid of equally sized cells. Each component is placed in exactly
one cell. It does not respect the preferred size of the component. It divides the available space into equally sized
cells and resizes each component to the cell’s size.
You can specify either the number of rows or the number of columns in the grid. If you specify both, only the
number of rows is used, and the number of columns is computed. Suppose ncomponents is the number of components
added to the container, and nrows and ncols are the specified number of rows and columns. If nrows is greater than
zero, the number of columns in the grid is computed using the following formula:
ncols = (ncomponents + nrows - 1)/nrows
If nrows is zero, the number of rows in the grid is computed using the following formula:
nrows = (ncomponents + ncols - 1)/ncols
You cannot specify a negative number for nrows or ncols, and at least one of them must be greater than zero.
Otherwise, a runtime exception is thrown.
You can create a GridLayout using one of the following three constructors of the GridLayout class:
• GridLayout()
• GridLayout(int rows, int cols)
• GridLayout(int rows, int cols, int hgap, int vgap)
You can specify the number of rows, the number of columns, a horizontal gap, and a vertical gap between two
cells in the grid. You can also set these properties using the methods setRows(), setColumns(), setHgap(), and
setVgap().
The no-args constructor creates a grid of one row. The number of columns is the same as the number of
components added to the container.
		 * 
		 * 
		 * 
		 * A GridLayout is a simple layout manager to code by hand. However, it is not very powerful, for two reasons.
First, it forces each component to have the same size, and second, you cannot specify the row and column number
(or exact location) of a component in the grid. That is, you can only add a component to the GridLayout.
		 * 
		 */
		
		JFrame frame=new JFrame("GridLayout Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=frame.getContentPane();
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(3,0));
		
		for (int i = 1; i <= 9; i++) {
			buttonPanel.add(new JButton("Button "+i));
			
		}
		
		contentPane.add(buttonPanel,BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);

	}

}
