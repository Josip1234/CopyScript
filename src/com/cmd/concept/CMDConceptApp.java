package com.cmd.concept;

import java.util.Scanner;

public class CMDConceptApp {

	public static void main(String[] args) {
	      String mainFolders="Main folder menu";
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
				System.out.println("Map folder is chosen.");
				break;
			
			   case 2:
				System.out.println("Map where files will be copied has been chosen.");
				break;
				
			   case 3:
				System.out.println("Added to deletion list.");
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
	      

	}

}
