package com.copy.script;

import java.util.Scanner;

import com.copy.script.messages.Message;


public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String mainFolder=Message.mainFolders;
		String menuItem=Message.menuItem;
		String operations=Message.folderOperations+"\n"+Message.listOperations+"\n";
		String mainFolderOperations=Message.mainFolderOperations;
		String chooseSubmenuItem=Message.chooseSubmenuItem;
		String directoryOperations=Message.chooseDirectoryLocation+"\n"+Message.chooseDirectoryForFileCopy;
		
		System.out.println(mainFolder);
		System.out.println(menuItem);
		System.out.println(operations);
		
		int key=0;
		key=scanner.nextInt();
		
		switch (key) {
		case 1:
			System.out.println(mainFolderOperations);
			System.out.println(chooseSubmenuItem);
			System.out.println(directoryOperations);
			
			break;

		default:
			break;
		}
		
		/**
		 * 
		 *
	 
	      
	      switch (key) {
		case 1:
			
			
			scanner=new Scanner(System.in);
			key=scanner.nextInt();
			switch (key) {
			   case 1:
				System.out.println("Map folder is chosen.");
				break;
			
			   case 2:
				System.out.println("Map where files will be copied has been chosen.");
				break;
				

			    default:
				   System.out.println("Wrong number choice.");
				  break;
			}
			break;
			
		case 2:
			System.out.println("List of files in folders");
			System.out.println("Choose a list:");
			System.out.println("1.List for file selection\n2.Execute files");
			key=scanner.nextInt();
			switch (key) {
			case 1:
				System.out.println("You have chosen these files:");
				break;
				
			case 2:
			    System.out.println("Opening file...");	
				break;
			

			default:
				break;
			}
			break;
		
			
		

		default:
			System.out.println("You picked the wrong numbers");
			break;
		}
	      
		 * 
		 * 
		 * 
		 */

	}

}
