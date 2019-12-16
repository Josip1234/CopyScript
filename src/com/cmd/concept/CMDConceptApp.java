package com.cmd.concept;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CMDConceptApp {

	public static void main(String[] args) {
		//simulated list of file in one directory
		List<String> files=new ArrayList<String>();
		files.add("test1.txt");
		files.add("test2.mp4");
		files.add("test3.jpg");
		files.add("test4.docx");
		files.add("test5.3db");
		files.add("test6.pdf");
		files.add("test7.xmls");
		
		//choose your directory
		System.out.println("Choose your directory:");
		Scanner scanner=new Scanner(System.in);
		String directory=scanner.nextLine();
		
		//print directory
		System.out.println("You have chosen this directory:"+ directory);
		
		//print list of files in this directory
		System.out.println("Here is a list of files in this directory:");
	    
		for (String string : files) {
			System.out.println(string+"\n");
		}
		
		//choose file from directory to copy
		System.out.println("Chose file which you want to copy:");
		String fileToCopy=scanner.nextLine();
		//initialize message string
		String message="";
		//get file from list and return message if there is no such a file in the list
		String getFileFromList="";
		for (String string : files) {
			if(fileToCopy.equals(string)) {
				getFileFromList=string;
				break;
				
			}else
			{
				message="There is no such a file in this directory.";
			}
		}
		
		//if file from the list is equal inputed file to copy print chosen file else print message and terminate app
		if(getFileFromList.equals(fileToCopy)) {
			System.out.println("You have chosen this file: "+getFileFromList);
		}else {
			System.out.println("Message:"+ message);
			System.exit(0);
			
		}
		//make path with file and print it
		String path=directory+"\\"+getFileFromList;
		System.out.println("Full path of the file is:\n"+path);
		
		//choose destination directory
		System.out.println("Choose directory for file to move:");
		String moveDirectory=scanner.nextLine();
		
		//print destination directory
		System.out.println("You have chosen this directory:\n"+moveDirectory);
		
		//after submit event is clicked, this is simulation.
		System.out.println("Clicked ok.");
		
		
		//simulation file move
		//generate random number up to 10000
		Random random=new Random();
		int time=random.nextInt(10000);
		
		//simulate by iterating by time pseudorandom generator
		for (int i = 0; i < time; i++) {
			
			System.out.println("Moving file...");
			
		}
		//after move is finished print message
		message="File has been moved.";
		System.out.println(message);
		
		/* 
		 * 
		 *   napraviti novi izbornik
		 *   // list of files
		  List<String> files=new ArrayList<String>();
		  // list of files to copy
		  List<String> copyFiles=new ArrayList<String>();
		  //list of files to delete
		  List<String> deletionList=new ArrayList<String>();
	      String mainFolders="Main folder menu";
	      //main folder from which files are copied 
	      String mainMap="";
	      //string for file path to copy
	      String copyTo="";
	      //string for file path to delete
	      String deletionPath="";
	      System.out.println(mainFolders);
	      int key=0;
	      System.out.println("Choose one of the menu item:");
	      System.out.println("1. Folder operations\n2.List operations\n");
	      @SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
	      key=scanner.nextInt();
	      
	      switch (key) {
		case 1:
			System.out.println("Main folder operations");
			System.out.println("Choose one of the submenu item:");
			System.out.println("1)Choose map location\n2)Choose map for file copy\n3)Choose map for deletion");
			scanner=new Scanner(System.in);
			key=scanner.nextInt();
			switch (key) {
			   case 1:
				scanner.nextLine();
			    mainMap="";
				System.out.println("Choose map location:");
				mainMap=scanner.nextLine();
				System.out.println(mainMap + " map folder is chosen.");
				break;
			
			   case 2:
				scanner.nextLine();
				System.out.println("Choose map location:");
				copyTo=scanner.nextLine();
				System.out.println("In "+ copyTo +" map  files will be copied.");
				break;
				
			   case 3:
				scanner.nextLine();
				System.out.println("Choose map location:");
				deletionPath=scanner.nextLine();
				System.out.println(deletionPath+" added to deletion list.");
				break;

			    default:
				   System.out.println("Wrong number choice.");
				  break;
			}
			break;
			
		case 2:
			System.out.println("List of files in folders");
			System.out.println("Choose a list:");
			System.out.println("1.List for file selection\n2.Execute files\n3. Copy files");
			key=scanner.nextInt();
			switch (key) {
			case 1:
				System.out.println("You have chosen these files:");
				break;
				
			case 2:
			    System.out.println("Opening file...");	
				break;
			
			case 3:
				System.out.println("Files is being copied...");
			
				break;

			default:
				break;
			}
			break;
		
			
		

		default:
			System.out.println("You picked the wrong numbers");
			break;
		}
	      
*/
	}

}
