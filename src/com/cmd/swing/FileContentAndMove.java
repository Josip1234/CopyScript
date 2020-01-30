package com.cmd.swing;

import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Window.Type;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class FileContentAndMove {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileContentAndMove window = new FileContentAndMove();
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
	public FileContentAndMove() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		String title="File content and file move";
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
		String testDirectory="C:\\Users\\Korisnik\\Desktop\\test2/";
		
		
		String[] filesInDirectory;
		
		File listFile=new File(testDirectory);
		filesInDirectory=listFile.list();
		
		
		testDirectory=returnFolderNameFromPath(testDirectory);
		DefaultMutableTreeNode node=new DefaultMutableTreeNode(testDirectory);
		
		for (String string : filesInDirectory) {
			node.add(new DefaultMutableTreeNode(string));
		}
		
		
		
		JTree tree = new JTree(node);
	    
		panel.add(tree);
		
	}
	//this function will be special class for slash removal.
	public String returnFolderNameFromPath(String path) {
		String folder="";
		String removeSlash="";
		char slash='/';
		char[] chars=path.toCharArray();
		int index=0;
		//find last index of backslash
		for (int i = 0; i < chars.length; i++) {
			if(chars[i]=='\\') {
				index=i;
			}else {
				continue;
			}
		}
		//if last index, connect to string folder name
		for (int i = 0; i < chars.length; i++) {
			if(index>=i) {
				continue;
			}else {
				removeSlash+=chars[i];
			}
		}
		//remove slash if exists from string
		//slash is at end we only need chars until the end
		char[] slashRemoval=removeSlash.toCharArray();
		for (int i = 0; i < slashRemoval.length; i++) {
			if(slashRemoval[i]==slash) break;
			else folder+=slashRemoval[i];
		}
		
		return folder;
	}
}
