package com.cmd.concept;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CMDConceptApp {

	public static void main(String[] args) {
		  // list of files
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
	      

	}

}
