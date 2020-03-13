package com.copy.script;



import com.copy.script.console.input.KeyboardInput;
import com.copy.script.messages.Message;


public class Main {

	public static void main(String[] args) {
		KeyboardInput input=new KeyboardInput();
		input.setIntPointer();
		
		String operations=Message.folderOperations+"\n"+Message.listOperations+"\n";
		String directoryOperations=Message.chooseDirectoryLocation+"\n"+Message.chooseDirectoryForFileCopy;
		String listForSelection=Message.listForSelection;
		String executeFiles=Message.executeFiles;
		System.out.println(Message.mainFolders);
		System.out.println(Message.menuItem);
		System.out.println(operations);
	
		int key=0;
	
		key = input.integerInput();
		switch (key) {
		case 1:
			System.out.println(Message.mainFolderOperations);
			System.out.println(Message.chooseSubmenuItem);
			System.out.println(directoryOperations);
			
			key = input.integerInput();
			
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
			
			key = input.integerInput();
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
