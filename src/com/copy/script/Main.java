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
		String chosenMapFolder=Message.chosenMapFolder;
		String chosenMapForFileCopy=Message.choosenMapForFileCopy;
		String wrongNumberChoice=Message.wrongNumberChoice;
		String listOfFilesInFolder=Message.listOfFilesInFolder;
		String chooseAList=Message.chooseAList;
		String listForSelection=Message.listForSelection;
		String executeFiles=Message.executeFiles;
		String chosenFiles=Message.choosenFiles;
		String openingFile=Message.openingFile;
		
		System.out.println(mainFolder);
		System.out.println(menuItem);
		System.out.println(operations);
		
		int key=0;
		/***
		 * 
		 * "resource leak" implies that some system resource (usually memory) is being lost or wasted needlessly. 
		 * Usually this will impact you when you start getting OutOfMemoryErrors 
		 * thrown during the normal operation of your program.
		 * As others have said, you need to call 'close' on IO classes.
		 * This ensures that your Scanner is always closed, guaranteeing proper resource cleanup
		 * 
		 * 
		 */
		try {
			key = scanner.nextInt();
		} finally {
			scanner.close();
		}
		switch (key) {
		case 1:
			System.out.println(mainFolderOperations);
			System.out.println(chooseSubmenuItem);
			System.out.println(directoryOperations);
			scanner=new Scanner(System.in);
			try {
				key = scanner.nextInt();
			} finally {
				scanner.close();
			}
			switch (key) {
			case 1:
				System.out.println(chosenMapFolder);
		
				break;
			case 2:
				System.out.println(chosenMapForFileCopy);
	
				break;

			default:
				System.out.println(wrongNumberChoice);
		
				break;
			}
			
			break;
		case 2:
			System.out.println(listOfFilesInFolder);
			System.out.println(chooseAList);
			System.out.println(listForSelection+"\n"+executeFiles);
			try {
				key = scanner.nextInt();
			} finally {
				scanner.close();
			}
			switch (key) {
			case 1:
				System.out.println(chosenFiles);
				break;
				
			case 2:
				System.out.println(openingFile);
				break;

			default:
				break;
			}
	
			break;
     
		default:
			System.out.println(wrongNumberChoice);
	
			break;
		}
		
   scanner.close();

	}

}
