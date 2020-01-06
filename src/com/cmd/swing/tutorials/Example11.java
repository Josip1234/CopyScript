package com.cmd.swing.tutorials;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example11 {

	public static void main(String[] args) {
		/**
		 * The BoxLayout arranges components in a container either horizontally in one row or vertically in one column.
You need to use the following steps to use a BoxLayout in your program:
• Create a container, for example, a JPanel.
JPanel hPanel = new JPanel();
• Create an object of the BoxLayout class. Unlike other layout managers, you need to pass the
container to the constructor of the class. You also need to pass the type of box you are creating
(horizontal or vertical) to its constructor. The class has four constants: X_AXIS, Y_AXIS,
LINE_AXIS, and PAGE_AXIS. The constant X_AXIS is used to create a horizontal BoxLayout
that lays out all components from left to right. The constant Y_AXIS is used to create a
vertical BoxLayout that lays out all components from top to bottom. The other two constants,
LINE_AXIS and PAGE_AXIS, are similar to X_AXIS and Y_AXIS. However, they use the
orientation of the container in laying out the components.
// Create a BoxLayout for hPanel to lay out
// components from left to right
BoxLayout boxLayout = new BoxLayout(hPanel, BoxLayout.X_AXIS);
• Set the layout for the container.
hPanel.setLayout(boxLayout);
• Add the components to the container.
hPanel.add(new JButton("Button 1"));
hPanel.add(new JButton("Button 2"));

A BoxLayout tries to give the preferred width to all components in a horizontal layout and the preferred height in
a vertical layout. In a horizontal layout, the height of the tallest component is given to all other components. If it cannot
adjust the height of a component to match the tallest component in the group, it aligns the component horizontally along
the center.
		 */
		
		JFrame frame=new JFrame("Boxlayout test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=frame.getContentPane();
		
		JPanel hPanel = new JPanel();
		BoxLayout boxLayout=new BoxLayout(hPanel, BoxLayout.X_AXIS);
		hPanel.setLayout(boxLayout);
		
		for (int i = 1; i <= 3; i++) {
			hPanel.add(new JButton("Button "+i));
			
		}
		
		contentPane.add(hPanel, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);

	}

}
