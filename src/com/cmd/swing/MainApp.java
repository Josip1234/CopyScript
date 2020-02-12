package com.cmd.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Window.Type;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.Dialog.ModalExclusionType;

public class MainApp {

	private JFrame frmCopyScript;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp window = new MainApp();
					window.frmCopyScript.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCopyScript = new JFrame();
		frmCopyScript.setTitle("Copy Script");
		frmCopyScript.setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		frmCopyScript.setType(Type.POPUP);
		frmCopyScript.setBounds(100, 100, 450, 300);
		frmCopyScript.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmCopyScript.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File operations");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCopyFile = new JMenuItem("Copy file");
		mntmCopyFile.setEnabled(false);
		mnNewMenu.add(mntmCopyFile);
		
		JMenuItem mntmMoveFile = new JMenuItem("Move file");
		mntmMoveFile.setEnabled(false);
		mnNewMenu.add(mntmMoveFile);
		
		JMenuItem mntmChooseFile = new JMenuItem("Choose file");
		mntmChooseFile.setEnabled(false);
		mnNewMenu.add(mntmChooseFile);
		
		JMenuItem mntmDeleteFile = new JMenuItem("Delete file");
		mntmDeleteFile.setEnabled(false);
		mnNewMenu.add(mntmDeleteFile);
		
		JMenuItem mntmCreateNewFile = new JMenuItem("Create new file");
		mntmCreateNewFile.setEnabled(false);
		mnNewMenu.add(mntmCreateNewFile);
		
		JMenu mnDirectoryOperations = new JMenu("Directory operations");
		menuBar.add(mnDirectoryOperations);
		
		JMenuItem mntmOpenLastDirectories = new JMenuItem("Open last directories");
		mnDirectoryOperations.add(mntmOpenLastDirectories);
		
		JMenuItem mntmOpenDirectories = new JMenuItem("Open source directory");
		mnDirectoryOperations.add(mntmOpenDirectories);
		
		JMenuItem mntmOpenDestinationDirectory = new JMenuItem("Open destination directory");
		mnDirectoryOperations.add(mntmOpenDestinationDirectory);
		
		JMenu mnList = new JMenu("List");
		menuBar.add(mnList);
		
		JMenuItem mntmListFilesIn = new JMenuItem("List files in source");
		mntmListFilesIn.setEnabled(false);
		mnList.add(mntmListFilesIn);
		
		JMenuItem mntmListFilesIn_1 = new JMenuItem("List files in destination");
		mntmListFilesIn_1.setEnabled(false);
		mnList.add(mntmListFilesIn_1);
		
		JMenu mnTerminateProgram = new JMenu("Terminate program");
		menuBar.add(mnTerminateProgram);
		
	}

	
}
