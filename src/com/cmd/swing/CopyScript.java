package com.cmd.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import java.awt.Insets;
import javax.swing.JTextField;

public class CopyScript {

	private JFrame frame;
	private JTextField txtChosenSource;
	private JTextField txtChosenDestination;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		txtChosenSource = new JTextField();
		txtChosenSource.setText("Chosen source...");
		GridBagConstraints gbc_txtChosenSource = new GridBagConstraints();
		gbc_txtChosenSource.insets = new Insets(0, 0, 5, 5);
		gbc_txtChosenSource.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtChosenSource.gridx = 2;
		gbc_txtChosenSource.gridy = 0;
		frame.getContentPane().add(txtChosenSource, gbc_txtChosenSource);
		txtChosenSource.setColumns(10);
		
		JButton btnChooseSource = new JButton("Choose source");
		btnChooseSource.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_btnChooseSource = new GridBagConstraints();
		gbc_btnChooseSource.insets = new Insets(0, 0, 5, 0);
		gbc_btnChooseSource.gridx = 8;
		gbc_btnChooseSource.gridy = 0;
		frame.getContentPane().add(btnChooseSource, gbc_btnChooseSource);
		
		txtChosenDestination = new JTextField();
		txtChosenDestination.setText("Chosen destination...");
		GridBagConstraints gbc_txtChosenDestination = new GridBagConstraints();
		gbc_txtChosenDestination.insets = new Insets(0, 0, 5, 5);
		gbc_txtChosenDestination.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtChosenDestination.gridx = 2;
		gbc_txtChosenDestination.gridy = 1;
		frame.getContentPane().add(txtChosenDestination, gbc_txtChosenDestination);
		txtChosenDestination.setColumns(10);
		
		JButton btnChooseDestination = new JButton("Choose destination");
		GridBagConstraints gbc_btnChooseDestination = new GridBagConstraints();
		gbc_btnChooseDestination.insets = new Insets(0, 0, 5, 0);
		gbc_btnChooseDestination.gridx = 8;
		gbc_btnChooseDestination.gridy = 1;
		frame.getContentPane().add(btnChooseDestination, gbc_btnChooseDestination);
		
		JButton btnMoveFile = new JButton("Move file");
		GridBagConstraints gbc_btnMoveFile = new GridBagConstraints();
		gbc_btnMoveFile.insets = new Insets(0, 0, 5, 5);
		gbc_btnMoveFile.gridx = 2;
		gbc_btnMoveFile.gridy = 2;
		frame.getContentPane().add(btnMoveFile, gbc_btnMoveFile);
		
		JButton btnListOfSource = new JButton("List of source");
		GridBagConstraints gbc_btnListOfSource = new GridBagConstraints();
		gbc_btnListOfSource.insets = new Insets(0, 0, 5, 0);
		gbc_btnListOfSource.gridx = 8;
		gbc_btnListOfSource.gridy = 2;
		frame.getContentPane().add(btnListOfSource, gbc_btnListOfSource);
		
		JButton btnListOfDestination = new JButton("List of destination");
		GridBagConstraints gbc_btnListOfDestination = new GridBagConstraints();
		gbc_btnListOfDestination.gridx = 8;
		gbc_btnListOfDestination.gridy = 3;
		frame.getContentPane().add(btnListOfDestination, gbc_btnListOfDestination);
		
	}

}
