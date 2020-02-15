package com.cmd.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Window.Type;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
		
		JMenu mntmOpenLastDirectories = new JMenu("Open last directories");
		mnDirectoryOperations.add(mntmOpenLastDirectories);
		
		JMenuItem mntmDefaultJson = new JMenuItem("Default json");
		mntmOpenLastDirectories.add(mntmDefaultJson);
		
		JMenuItem mntmOpenJsonFile = new JMenuItem("Open json file");
		mntmOpenLastDirectories.add(mntmOpenJsonFile);
		
	
		
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
		
		mntmOpenJsonFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			   System.out.println(e.getActionCommand());
			   System.out.println(mntmCopyFile.getActionCommand());
			   mntmCopyFile.setEnabled(true);
			   mntmMoveFile.setEnabled(true);
			   mntmChooseFile.setEnabled(true);
			   mntmDeleteFile.setEnabled(true);
			   mntmCreateNewFile.setEnabled(true);
			   mntmListFilesIn.setEnabled(true);
			   mntmListFilesIn_1.setEnabled(true);
			   mntmOpenDirectories.setEnabled(false);
			   mntmOpenDestinationDirectory.setEnabled(false);
			   
				
			}
		});
		
		mntmDefaultJson.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			   System.out.println(e.getActionCommand());
			   System.out.println(mntmCopyFile.getActionCommand());
			   mntmCopyFile.setEnabled(true);
			   mntmMoveFile.setEnabled(true);
			   mntmChooseFile.setEnabled(true);
			   mntmDeleteFile.setEnabled(true);
			   mntmCreateNewFile.setEnabled(true);
			   mntmListFilesIn.setEnabled(true);
			   mntmListFilesIn_1.setEnabled(true);
			   mntmOpenDirectories.setEnabled(false);
			   mntmOpenDestinationDirectory.setEnabled(false);
				
			}
		});
		
	mntmOpenDirectories.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			mntmListFilesIn.setEnabled(true);
			mntmChooseFile.setEnabled(true);
			
			  mntmCopyFile.setEnabled(false);
			   mntmMoveFile.setEnabled(false);
			   mntmDeleteFile.setEnabled(false);
			   mntmCreateNewFile.setEnabled(false);
			   mntmListFilesIn_1.setEnabled(false);
			   
			   mntmOpenLastDirectories.setEnabled(false);
			
		}
	});
		mntmOpenDestinationDirectory.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mntmListFilesIn.setEnabled(false);
				mntmChooseFile.setEnabled(false);
				
				  mntmCopyFile.setEnabled(true);
				   mntmMoveFile.setEnabled(true);
				   mntmDeleteFile.setEnabled(true);
				   mntmCreateNewFile.setEnabled(true);
				   mntmListFilesIn_1.setEnabled(true);
				   
				   mntmOpenLastDirectories.setEnabled(false);
				
			}
		});
		}
	
};
/*		
mntmOpenLastDirectories.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mntmCopyFile.setEnabled(true);
				mntmMoveFile.setEnabled(true);
				mntmCreateNewFile.setEnabled(true);
			    mntmChooseFile.setEnabled(true);
			    mntmDeleteFile.setEnabled(true);
			    mntmListFilesIn.setEnabled(true);
			    mntmListFilesIn_1.setEnabled(true);
			    
				
			}
		});
		
	}*/


