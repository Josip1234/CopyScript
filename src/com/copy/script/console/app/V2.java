package com.copy.script.console.app;

import java.util.ArrayList;
import java.util.List;

import com.copy.script.console.input.KeyboardInput;
import com.copy.script.enums.Msg;
import com.copy.script.file.operations.File;
import com.copy.script.folders.and.paths.Folder;
import com.copy.script.folders.and.paths.Path;
import com.copy.script.messages.Message;

/***
 * 
 * @author Korisnik
 * @version 2.0.0
 * @since 30.3.2020 18:57
 */
public class V2 {
	
	@SuppressWarnings("unused")
	public static void init() {
		//list of files	
		List<File> files =new ArrayList<File>();
		//list of files to copy
		List<File> copyFiles=new ArrayList<File>();
		//list of files to delete
		List<File> deletionList=new ArrayList<File>();
		String mainFolder=Message.mainFolders;
		//main folder from which files are copied
		Folder mainMap=new Folder();
		//string for file path to copy
		Path destination=new Path();
		//string for file path to delete
		Path source=new Path();
		System.out.println(mainFolder);
		KeyboardInput input=new KeyboardInput();
		int key=0;
		System.out.println(Message.menuItem);
		key=input.integerInput();
		
		switch (key) {
		case 1:
			System.out.println(Message.chosenMapFolder);
		    input.setStringPointer();
		    mainMap.setFolderName("");
		    System.out.println(Message.chooseDestinationMap);
		    mainMap.setFolderName(input.stringInput());
		    System.out.println(mainMap.getFolderName()+Message.chosenDestinationFolder);
			break;
			
		case 2:
			System.out.println(Message.chosenDestinationFolder);
			input.setStringPointer();
			System.out.println(Message.chooseDestinationMap);
			mainMap.setFolderName(input.stringInput());
			System.out.println(Msg.In+" "+mainMap.getFolderName()+Message.mapFilesWillBeCopied);
			break;
			
		case 3: 
			System.out.println(Message.addedToDeletionList);
			input.setStringPointer();
			System.out.println(Message.chooseDestinationMap);
			mainMap.setFolderName(input.stringInput());
			System.out.println(mainMap.getFolderName()+" "+Message.addedToDeletionList);
			break;

		default:
			break;
		}
	}

}
