package com.swing.version1.app;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.cmd.concept.messages.Message;

public class Jbutton implements JButtonInterface {
	
	private JButton chooseSource;
	
	

	public Jbutton() {
		this.chooseSource=new JButton(Message.openSourceDirectory);
	}

    

	public JButton getChooseSource() {
		return chooseSource;
	}



	@Override
	public void init() {
		getChooseSource().setFont(new Font("Tahoma", Font.PLAIN, 12));
		getChooseSource().setBounds(0,0,100,100);
		
			
		
		
	}



	@Override
	public void applyActionListener() {
		
		getChooseSource().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileChooser fileChooser=new FileChooser();
				fileChooser.init();
				System.out.println(fileChooser.returnSource());
				
				
				
			}
		});
	
	}




		
	}


