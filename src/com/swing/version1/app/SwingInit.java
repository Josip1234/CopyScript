package com.swing.version1.app;

import java.awt.EventQueue;
import java.awt.Window.Type;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.cmd.concept.messages.Message;

public class SwingInit implements CopyInterface {

		private JFrame frame;
		
		private JMenuBar menuBar;
		
		private JMenu fileOperations;
		private JMenu directoryOperations;
		private JMenu openLastDirectories;
		
		private JMenuItem copyFile;
		private JMenuItem moveFile;
		private JMenuItem chooseFile;
		private JMenuItem deleteFile;
		private JMenuItem createFile;
		private JMenuItem defaultJson;
		private JMenuItem openJsonFile;
		private JMenuItem openSourceDirectories;
		private JMenuItem openDestinationDirectory;
		

		
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
			this.frame=initialize(this.frame);
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
			
			getOpenLastDirectories().add(getOpenJsonFile());
			
			getDirectoryOperations().add(getOpenSourceDirectories());
			
			getDirectoryOperations().add(getOpenDestinationDirectory());
			
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
	
		
		/***
		 * 
		 *     
		
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
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	

}
