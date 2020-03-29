package com.copy.script;


import java.util.ArrayList;
import java.util.List;


import com.copy.script.console.input.KeyboardInput;
import com.copy.script.file.operations.File;
import com.copy.script.folders.and.paths.Folder;
import com.copy.script.folders.and.paths.Path;
import com.copy.script.messages.Message;

public class Main {

	public static void main(String[] args) {
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
		
		break;
		
	case 3: 
		
		break;

	default:
		break;
	}
		
 /***
  *
			
			   case 2:
				System.out.println("Map where files will be copied has been chosen.");
				scanner.nextLine();
				System.out.println("Choose map location:");
				copyTo=scanner.nextLine();
				System.out.println("In "+ copyTo +" map  files will be copied.");
				break;
				
			   case 3:
				System.out.println("Added to deletion list.");
				scanner.nextLine();
				System.out.println("Choose map location:");
				deletionPath=scanner.nextLine();
				System.out.println(deletionPath+" added to deletion list.");
				break;

			    default:
  */

	}

}
