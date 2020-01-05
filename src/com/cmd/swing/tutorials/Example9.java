package com.cmd.swing.tutorials;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example9 {

	public static void main(String[] args) {
		/***
		 * The BorderLayout divides a container’s space into five areas: north, south, east, west, and center. When you add a
component to a container with a BorderLayout, you need to specify to which of the five areas you want to add the
component. The BorderLayout class defines five constants to identify each of the five areas. The constants are NORTH,
SOUTH, EAST, WEST, and CENTER.The default layout for the content pane of a JFrame is a BorderLayout.

You can add at most one component to one area of a BorderLayout. You may leave some areas empty. If you
want to add more than one component to an area of a BorderLayout, you can do so by adding those components to a
container, and then adding that container to the desired area.

The five areas in a BorderLayout (north, south, east, west, and center) are fixed in direction and are not
dependent on the orientation of components. Four more constants exist to specify areas in a BorderLayout. These
constants are PAGE_START, PAGE_END, LINE_START, and LINE_END. The PAGE_START and PAGE_END constants are the
same as the NORTH and SOUTH constants, respectively. The LINE_START and LINE_END constants change their positions
depending on the orientation of the container. If the container’s orientation is left to right, LINE_START is the same as
WEST, and LINE_END is the same as EAST. If the container’s orientation is right to left, LINE_START is the same as EAST,
and LINE_END is the same as WEST.
		 */

		JFrame frame=new JFrame("BorderLayout test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container=frame.getContentPane();
		
		container.add(new JButton("North"),BorderLayout.NORTH);
		container.add(new JButton("South"),BorderLayout.SOUTH);
		container.add(new JButton("East"),BorderLayout.EAST);
		container.add(new JButton("West"),BorderLayout.WEST);
		container.add(new JButton("Center"),BorderLayout.CENTER);
		
		frame.pack();
		frame.setVisible(true);
		
	}

}
