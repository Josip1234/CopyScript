package com.copy.script.console.app;

import com.copy.script.console.input.KeyboardInput;
import com.copy.script.messages.Message;

/***
 * 
 * @author Korisnik
 * @version 1.0.0
 * This class is the copy of main which will be activated by only calling 
 * static function from this class. That way implementation 
 * has been separated from main. 
 */
public class V1 {
	public static void activate() {
		KeyboardInput input=new KeyboardInput();
		System.out.println(Message.mainFolders);
		System.out.println(Message.menuItem);
		System.out.println(Message.operations);
	
		int key=0;
	
		key = input.integerInput();
		switch (key) {
		case 1:
			System.out.println(Message.mainFolderOperations);
			System.out.println(Message.chooseSubmenuItem);
			System.out.println(Message.directoryOperations);
			
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
			System.out.println(Message.listForSelect);
			
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
