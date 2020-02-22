package com.swing.version1.app;

import java.awt.SystemColor;
import java.io.File;

import javax.swing.JFileChooser;

import com.cmd.concept.messages.Message;

public class FileChooser implements ChooserInterface {
	
	private JFileChooser sourceChooser;

	public FileChooser() {
		this.sourceChooser = new JFileChooser();
	}

	
	
	
	public JFileChooser getSourceChooser() {
		return sourceChooser;
	}




	@Override
	public void init() {
		getSourceChooser().setBackground(SystemColor.window);
		getSourceChooser().setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		Message message=new Message();
		getSourceChooser().setDialogTitle(message.getChooseSourceDirectory());
		getSourceChooser().setApproveButtonText(Message.openDirectory);
		
	}




	@Override
	public String returnSource() {
		String directory="";
		int returnValue=getSourceChooser().showOpenDialog(null);
		if(returnValue==JFileChooser.APPROVE_OPTION) {
			File selectedDir = getSourceChooser().getSelectedFile();
			directory=selectedDir.toString();
		}
		return directory;
	}
	
	
	/**
	 * 	
			
			
			
			

			if(returnValue==JFileChooser.APPROVE_OPTION) {
				File seleFile = fileChooser.getSelectedFile();
				System.out.println("You selected: "+ seleFile);
				
				textField.setText(seleFile.toString());
			}
	 * 
	 * 
	 */
}
