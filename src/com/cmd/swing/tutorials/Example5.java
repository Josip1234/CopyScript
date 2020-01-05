package com.cmd.swing.tutorials;

import java.awt.Component;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example5 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Adding component to jframe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton closeButton=new JButton("Close");
		JButton helpButton=new JButton("Help");
		
		Container contentPane=frame.getContentPane();
		contentPane.add(closeButton);
		contentPane.add(helpButton);
		
		frame.pack();
		frame.setVisible(true);
		
		Component[] comps=contentPane.getComponents();
		System.out.println("Content Pane has"+comps.length+" components.");

	}

}
