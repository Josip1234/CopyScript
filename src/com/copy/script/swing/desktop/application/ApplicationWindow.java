package com.copy.script.swing.desktop.application;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.copy.script.messages.Message;

import java.awt.SystemColor;
import java.awt.Window.Type;
/***
 * @author Korisnik
 * @category User interface
 * @apiNote This is desktop application for current created application. Current application only has cmd use, this one will have desktop use.
 * @version 1.0*/
public class ApplicationWindow {

	private JFrame frmCopyscript;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationWindow window = new ApplicationWindow();
					window.frmCopyscript.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ApplicationWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * Open application, display first message
	 */
	private void initialize() {
		
		frmCopyscript = new JFrame();
		frmCopyscript.setType(Type.POPUP);
		frmCopyscript.setBackground(SystemColor.inactiveCaption);
		frmCopyscript.setForeground(SystemColor.controlLtHighlight);
		frmCopyscript.setTitle("CopyScript");
		frmCopyscript.setBounds(100, 100, 450, 300);
		frmCopyscript.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JOptionPane.showMessageDialog(null, Message.applicationIsOpen);
	}

}
