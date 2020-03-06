package com.swing.version1.app;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import com.cmd.concept.messages.Message;

public class SwingInit implements CopyInterface {
	
	    
	    
	    
		private JFrame frame;
		
		private JMenuBar menuBar;
		
		private JMenu fileOperations;
		private JMenu directoryOperations;
		private JMenu openLastDirectories;
		private JMenu list;
		private JMenu terminateProgram;
		private JMenu newSession;
		
		private JMenuItem copyFile;
		private JMenuItem moveFile;
		private JMenuItem chooseFile;
		private JMenuItem deleteFile;
		private JMenuItem createFile;
		private JMenuItem defaultJson;
		private JMenuItem openJsonFile;
		private JMenuItem openSourceDirectories;
		private JMenuItem openDestinationDirectory;
		private JMenuItem listFilesInSource;
		private JMenuItem listFilesInDestination;
		

		
		
		

		public JMenuItem getMoveFile() {
			return moveFile;
		}

		public SwingInit() {
			this.menuBar=new JMenuBar();
			this.fileOperations=new JMenu(Message.fileOperations);
			this.directoryOperations=new JMenu(Message.directoryOperations);
			this.copyFile=new JMenuItem(Message.copyFile);
			this.moveFile=new JMenuItem(Message.moveFile);
			this.chooseFile=new JMenuItem(Message.chooseFile);
			this.deleteFile=new JMenuItem(Message.deleteFile);
			this.createFile=new JMenuItem(Message.createFile);
			this.openLastDirectories=new JMenu(Message.openLastDirectories);
			this.defaultJson=new JMenuItem(Message.defaultJson);
			this.openJsonFile=new JMenuItem(Message.openJsonFile);
			this.openSourceDirectories=new JMenuItem(Message.openSourceDirectory);
			this.openDestinationDirectory=new JMenuItem(Message.openDestinationDirectory);
			this.list=new JMenu(Message.list);
			this.listFilesInSource=new JMenuItem(Message.listFilesInSource);
			this.listFilesInDestination=new JMenuItem(Message.listFilesInDestination);
			this.terminateProgram=new JMenu(Message.terminateProgram);
			this.newSession=new JMenu(Message.newSession);
			
			
			this.frame=initialize(this.frame);
		}
		
		
		
		
		
		
	

		public JMenu getNewSession() {
			return newSession;
		}

		public JMenu getTerminateProgram() {
			return terminateProgram;
		}

		public JMenuItem getListFilesInDestination() {
			return listFilesInDestination;
		}

		public JMenuItem getListFilesInSource() {
			return listFilesInSource;
		}

		public JMenu getList() {
			return list;
		}

		public JMenuItem getOpenDestinationDirectory() {
			return openDestinationDirectory;
		}

		public JMenuItem getOpenSourceDirectories() {
			return openSourceDirectories;
		}

		public JMenuItem getOpenJsonFile() {
			return openJsonFile;
		}

		public JMenuItem getDefaultJson() {
			return defaultJson;
		}

		public JMenu getDirectoryOperations() {
			return directoryOperations;
		}

		public JMenuItem getDeleteFile() {
			return deleteFile;
		}

		@Override
		public JFrame initialize(JFrame frame) {
			frame=new JFrame();
			frame.setTitle("Copy Script");
			frame.setType(Type.POPUP);
			frame.setBounds(100,100,450,300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			frame.setJMenuBar(getMenuBar());
			getMenuBar().add(getFileOperations());
			
			getCopyFile().setEnabled(false);
			getFileOperations().add(getCopyFile());
			
			getMoveFile().setEnabled(false);
			getFileOperations().add(getMoveFile());
			
			getChooseFile().setEnabled(false);
			getFileOperations().add(getChooseFile());
			
			getDeleteFile().setEnabled(false);
			getFileOperations().add(getDeleteFile());
			
			getCreateFile().setEnabled(false);
			getFileOperations().add(getCreateFile());
			
			getMenuBar().add(getDirectoryOperations());
			getDirectoryOperations().add(getOpenLastDirectories());
			
			getOpenLastDirectories().add(getDefaultJson());
			openDefaultJson(getDefaultJson());
			
			
			getOpenLastDirectories().add(getOpenJsonFile());
			openJsonFile(getOpenJsonFile());
			
			getDirectoryOperations().add(getOpenSourceDirectories());
			openSourceDirectory(getOpenSourceDirectories());
			
			getDirectoryOperations().add(getOpenDestinationDirectory());
			openDestinationDirectory(getOpenDestinationDirectory());
			
			getMenuBar().add(getList());
			
			getListFilesInSource().setEnabled(false);
			getList().add(getListFilesInSource());
			
			getListFilesInDestination().setEnabled(false);
			getList().add(getListFilesInDestination());
			
			getMenuBar().add(getTerminateProgram());
			
			getMenuBar().add(getNewSession());
			
			return frame;
			
			
			
		}
		
		

		public JMenu getOpenLastDirectories() {
			return openLastDirectories;
		}

		public JMenuItem getCreateFile() {
			return createFile;
		}

		public JMenuItem getChooseFile() {
			return chooseFile;
		}

		public JMenuItem getCopyFile() {
			return copyFile;
		}

		public JMenu getFileOperations() {
			return fileOperations;
		}

		public JMenuBar getMenuBar() {
			return menuBar;
		}

		public JFrame getFrame() {
			return frame;
		}

		@Override
		public void run() {
			EventQueue.invokeLater(new Runnable() {
				
				@Override
				public void run() {
					try {
						SwingInit init=new SwingInit();
						init.getFrame().setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			});
			
		}

		@Override
		public void openJsonFile(JMenuItem jsonFile) {
			jsonFile.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					getCopyFile().setEnabled(true);
					getMoveFile().setEnabled(true);
					getChooseFile().setEnabled(true);
					getDeleteFile().setEnabled(true);
					getCreateFile().setEnabled(true);
					getListFilesInSource().setEnabled(true);
					getListFilesInDestination().setEnabled(true);
					getOpenSourceDirectories().setEnabled(false);
					getOpenDestinationDirectory().setEnabled(false);
					
					
				}
			});
			
		}

		@Override
		public void openDefaultJson(JMenuItem defaultJson) {
			defaultJson.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					getCopyFile().setEnabled(true);
					getMoveFile().setEnabled(true);
					getChooseFile().setEnabled(true);
					getDeleteFile().setEnabled(true);
					getCreateFile().setEnabled(true);
					getListFilesInSource().setEnabled(true);
					getListFilesInDestination().setEnabled(true);
					getOpenSourceDirectories().setEnabled(false);
					getOpenDestinationDirectory().setEnabled(false);
					
					
				}
			});
		
			
			
			
		}

		@Override
		public void openSourceDirectory(JMenuItem source) {
			source.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					getListFilesInSource().setEnabled(true);
					getChooseFile().setEnabled(true);
					getCopyFile().setEnabled(false);
					getMoveFile().setEnabled(false);
					getDeleteFile().setEnabled(false);
					getCreateFile().setEnabled(false);
					getListFilesInDestination().setEnabled(false);
					getOpenLastDirectories().setEnabled(false);
					
			
					
					Jpanel panel=new Jpanel();
					panel.init();
					
					getFrame().getContentPane().add(panel.getJpanel());
					
					Jbutton chooseSource=new Jbutton();
					chooseSource.init();
					getFrame().getContentPane().add(chooseSource.getChooseSource());
					chooseSource.applyActionListener();
				
				
					
				
					
					
				}
			});
			
		}

		@Override
		public void openDestinationDirectory(JMenuItem destination) {
			destination.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					getListFilesInSource().setEnabled(false);
					getChooseFile().setEnabled(false);
					getCopyFile().setEnabled(true);
					getMoveFile().setEnabled(true);
					getDeleteFile().setEnabled(true);
					getCreateFile().setEnabled(true);
					getListFilesInSource().setEnabled(true);
					getListFilesInDestination().setEnabled(true);
					getOpenLastDirectories().setEnabled(true);
					
					
					
				}
			});
			
		}

		@Override
		public void init() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String returnSource() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void applyActionListener() {
			// TODO Auto-generated method stub
			
		}
		
	
	
		

	

}
