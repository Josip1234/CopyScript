package com.cmd.swing.tutorials;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example7 {

	public static void main(String[] args) {
		int horizontalGap=20;
		int verticalGap=10;
		JFrame frame=new JFrame("Flow layout test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane=frame.getContentPane();
		FlowLayout layout=new FlowLayout(FlowLayout.LEADING,horizontalGap,verticalGap);
		contentPane.setLayout(layout);
		frame.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		for (int i = 1; i <=3; i++) {
			contentPane.add(new JButton("Button "+i));
		}
		frame.pack();
		frame.setVisible(true);
		

	}

}
