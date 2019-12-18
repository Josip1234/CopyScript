package com.cmd.merge.cmd.concept;

import java.io.File;
import java.util.Scanner;

public class MergeMove {

	public static void main(String[] args) {
		
		//need to make check if destination is equal source directory 
		//if it is then terminate program with message
		//source directory is equal to destination directory.
		final String noneMessage="none";
		final String equalDirectories="Destination directory is equal to source directory. Please choose different source or destination directory.";
		final String emptySourceDir="There is no files in source directory please choose non empty directory.";
		//choose source directory
		System.out.println("Choose source directory:");
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		String sourceDirectory=scanner.nextLine();
		
		//print chosen directory
		System.out.println("Chosen source directory:\n"+sourceDirectory);
		
		//list files in source directory
		//create new file object of directory
		//add files from source directory to the list of string array
		//loop and print files of source directory
		//print the files only if any of files exist in directory
		//if there is no files print none, same as destination
		//if there is nothing in source directory, terminate app
		//print message there is no files in source directory please choose 
		//non empty directory
		String[] filesInSourceDirectory;
		File filesInSource=new File(sourceDirectory);
		filesInSourceDirectory=filesInSource.list();
		
	    System.out.println("List of files in source directory:\n");
	    if(filesInSourceDirectory.length>0) {
	    	for (String string : filesInSourceDirectory) {
				System.out.println(string+"\n");
			}
	    	
	    	 //choose file from source directory which you want to copy
		    System.out.println("Choose file from source directory:\n");
		    String fileToMove=scanner.nextLine();
		    
		    //print chosen file from source directory
		    System.out.println("You have chosen "+fileToMove+" from this directory: "+sourceDirectory);
	    	
	    	
	    }else {
	    	System.out.println(noneMessage);
	    	System.out.println(emptySourceDir);
	    	System.exit(0);
	    }
	    
	   
	
		
		//choose destination directory
	    System.out.println("Choose destination directory:");
	    String destinationDirectory=scanner.nextLine();
	    
	    //after destination directory is chosen this check if 
	    //destination directory is equal to source directory if it is then 
	    //app is terminated with message
	    if(destinationDirectory.equals(sourceDirectory)) {
	    	System.out.println(equalDirectories);
	    	System.exit(0);
	    }else {
	    
	    //print chosen destination directory
	    //print list of files of destination directory
	    System.out.println("Chosen destination directory:\n"+destinationDirectory);
	    String[] filesInDestinationDirectory;
	    File filesinDestination=new File(destinationDirectory);
	    filesInDestinationDirectory=filesinDestination.list();
	    System.out.println("List of files in destination directory:\n");
	    
	    if(filesInDestinationDirectory.length>0) {
	    for (String string : filesInDestinationDirectory) {
			System.out.println(string+"\n");
		}
	}else {
		System.out.println(noneMessage);
	}
	    };
}
}
