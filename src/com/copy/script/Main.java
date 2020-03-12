package com.copy.script;

import java.util.Scanner;

import com.copy.script.messages.Message;


public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String operations=Message.folderOperations+"\n"+Message.listOperations+"\n";
		String directoryOperations=Message.chooseDirectoryLocation+"\n"+Message.chooseDirectoryForFileCopy;
		String listForSelection=Message.listForSelection;
		String executeFiles=Message.executeFiles;
		System.out.println(Message.mainFolders);
		System.out.println(Message.menuItem);
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
		 *
		try {
			key = scanner.nextInt();
		} finally {
			scanner.close();
		}*/
		key = scanner.nextInt();
		switch (key) {
		case 1:
			System.out.println(Message.mainFolderOperations);
			System.out.println(Message.chooseSubmenuItem);
			System.out.println(directoryOperations);
			
			try {
				key = scanner.nextInt();
			} finally {
				scanner.close();
			}
			switch (key) {
			case 1:
				System.out.println(Message.chosenMapFolder);
		
				break;
			case 2:
				System.out.println(Message.choosenMapForFileCopy);
	
				break;

			default:
				System.out.println(Message.wrongNumberChoice);
		
				break;
			}
			
			break;
		case 2:
			System.out.println(Message.listOfFilesInFolder);
			System.out.println(Message.chooseAList);
			System.out.println(listForSelection+"\n"+executeFiles);
			try {
				key = scanner.nextInt();
			} finally {
				scanner.close();
			}
			switch (key) {
			case 1:
				System.out.println(Message.choosenFiles);
				break;
				
			case 2:
				System.out.println(Message.openingFile);
				break;

			default:
				break;
			}
	
			break;
     
		default:
			System.out.println(Message.wrongNumberChoice);
	
			break;
		}
		
 

	}

}
