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
		private JMenuItem copyFile;
		private JMenuItem moveFile;
		

		
		public JMenuItem getMoveFile() {
			return moveFile;
		}

		public SwingInit() {
			this.menuBar=new JMenuBar();
			this.fileOperations=new JMenu(Message.fileOperations);
			this.copyFile=new JMenuItem(Message.copyFile);
			this.moveFile=new JMenuItem(Message.moveFile);
			this.frame=initialize(this.frame);
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
			
			return frame;
			
			
			
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
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	

}
