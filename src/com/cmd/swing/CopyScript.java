package com.cmd.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;

import javafx.stage.FileChooser;

import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import javax.swing.JPanel;

public class CopyScript {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CopyScript window = new CopyScript();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CopyScript() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String title="Copy script Application";
		frame = new JFrame(title);
		frame.setResizable(false);
		frame.getContentPane().setBackground(SystemColor.window);
		frame.setBounds(200, 200, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		frame.getContentPane().add(panel);
		
		
		
		JButton btnChooseSourceDirectory = new JButton("Choose source directory");
		
		btnChooseSourceDirectory.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser=new JFileChooser();
				fileChooser.setBackground(SystemColor.window);
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				fileChooser.setDialogTitle("Choose source directory:");
				fileChooser.setApproveButtonText("Open directory");
				int returnValue=fileChooser.showOpenDialog(null);
				if(returnValue==JFileChooser.APPROVE_OPTION) {
					File seleFile = fileChooser.getSelectedFile();
					System.out.println("You selected: "+ seleFile);
					
					textField.setText(seleFile.toString());
				}
				
			}
		});
		panel.add(btnChooseSourceDirectory);
		
		textField = new JTextField();
		textField.setEditable(false);
		panel.add(textField);
		textField.setColumns(25);
		
		JButton btnNewButton = new JButton("Choose destin directory:");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser=new JFileChooser();
				fileChooser.setBackground(SystemColor.window);
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				fileChooser.setDialogTitle("Choose destination directory:");
				fileChooser.setApproveButtonText("Open directory");
				int returnValue=fileChooser.showOpenDialog(null);
				if(returnValue==JFileChooser.APPROVE_OPTION) {
					File seleFile = fileChooser.getSelectedFile();
					System.out.println("You selected: "+ seleFile);
					
					textField_1.setText(seleFile.toString());
				}
				
			}
		});
		panel.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		panel.add(textField_1);
		textField_1.setColumns(25);
		
		
		
	
		
	}

}
