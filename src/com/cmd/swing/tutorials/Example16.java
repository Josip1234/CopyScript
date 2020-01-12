package com.cmd.swing.tutorials;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SpringLayout;

import javafx.scene.control.Button;

public class Example16 {

	public static void main(String[] args) {
       JFrame frame=new JFrame("Simplest spring layout");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Container contentPane=frame.getContentPane();
       
       SpringLayout layout=new SpringLayout();
       contentPane.setLayout(layout);
       
       JButton b1=new JButton("Button 1");
       JButton b2=new JButton("Little bugger button 2");
       
       contentPane.add(b1);
       contentPane.add(b2);
       
       frame.pack();
       frame.setVisible(true);
	}

}
