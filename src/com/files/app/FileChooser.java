package com.files.app;

import java.awt.SystemColor;

import javax.swing.JFileChooser;

import com.cmd.concept.messages.Message;

public class FileChooser implements FileChooserInterface{

/***
 * File chooser for source and destination directories
 */
private JFileChooser sourceChooser;
private JFileChooser destinationChooser;

/***
 * Make a instances of file chooser files
 */
public FileChooser() {
	this.sourceChooser=new JFileChooser();
	this.destinationChooser=new JFileChooser();
}
/***
 * 
 * @return initialized jfile chooser objects which will be used to use functions from jfile chooser
 */
public JFileChooser getSourceChooser() {
	return sourceChooser;
}

public JFileChooser getDestinationChooser() {
	return destinationChooser;
}
/***
 * Initialize source chooser set background and file selection mode and open directory dialog title
 */
@Override
public void initSource() {
	getSourceChooser().setBackground(SystemColor.window);
	getSourceChooser().setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	Message message=new Message();
	getSourceChooser().setDialogTitle(message.getChooseSourceDirectory());
	getSourceChooser().setApproveButtonText(Message.openDirectory);
	
}
@Override
public void initDestination() {
	// TODO Auto-generated method stub
	
}





}
