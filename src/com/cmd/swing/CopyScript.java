package com.cmd.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
import java.awt.Window;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

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
					int response=JOptionPane.showConfirmDialog(null, "Open last source and destination directory?",
							"Open last directories", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
					switch (response) {
					case JOptionPane.YES_OPTION:
						System.out.println("You have chosen yes.");
						break;
						
					case JOptionPane.NO_OPTION:
						CopyScript window = new CopyScript();
						window.frame.setVisible(true);
						break;
						

					case JOptionPane.CANCEL_OPTION:
						System.exit(0);
						break;
						
					case JOptionPane.CLOSED_OPTION:
						System.exit(0);
						break;
						
					default:
						window = new CopyScript();
						window.frame.setVisible(true);
						
						
					}
					
					
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
		frame.setType(Type.POPUP);
		frame.setResizable(false);
		frame.getContentPane().setBackground(SystemColor.window);
		frame.setBounds(200, 200, 600, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 574, 84);
		panel.setBackground(SystemColor.text);
		frame.getContentPane().add(panel);
		
		
		
		JButton btnChooseSourceDirectory = new JButton("Choose source directory");
		btnChooseSourceDirectory.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnChooseSourceDirectory.setBounds(0, 0, 100, 100);
		
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
		panel.setLayout(new GridLayout(0, 2, 10, 15));
		panel.add(btnChooseSourceDirectory);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setEditable(false);
		textField.setColumns(25);
		
		JButton btnNewButton = new JButton("Choose destination directory");
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setEditable(false);
		textField_1.setColumns(25);
		
		
		
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
					JButton btnNewButton_1 = new JButton("Choose file to move:");
					btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
					btnNewButton_1.setBounds(133, 95, 309, 41);
					frame.getContentPane().add(btnNewButton_1);
					
					btnNewButton_1.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							frame.setVisible(false);
							//here it will be visible tree view like list of files in folder and button which will be used
							//to select those files
							
						}
					});
				}
				
			}
		});
		
		
		
	
		
	}
}
