package com.cmd.swing.tutorials;

import javax.swing.JFrame;

public class Example2 {

	public static void main(String[] args) {
		//our app will have 800x600 resolution
		JFrame frame=new JFrame("Revised simplest swing");
		//after exit set close program operations or it will be running whole time
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(50, 50, 200, 200);
		frame.setVisible(true);
		

	}

}
