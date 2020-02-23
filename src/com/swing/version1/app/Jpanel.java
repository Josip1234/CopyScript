package com.swing.version1.app;

import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.JPanel;

public class Jpanel implements JPanelInterface {
	private JPanel jpanel;

	public Jpanel() {
		this.jpanel = new JPanel();;
	}
	
	
	public JPanel getJpanel() {
		return jpanel;
	}


	@Override
	public void init() {
		getJpanel().setBounds(0,0,574,84);
		getJpanel().setBackground(SystemColor.text);
		getJpanel().setLayout(new GridLayout(0,2,10,15));
		//getJpanel().add(getChooseSource());
		
	}
}
