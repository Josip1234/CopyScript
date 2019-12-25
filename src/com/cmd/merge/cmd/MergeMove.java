package com.cmd.merge.cmd;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class MergeMove {

	public static void main(String[] args) {
		
		//need to make check if destination is equal source directory 
		//if it is then terminate program with message
		//source directory is equal to destination directory.
		final String noneMessage="none";//in class message
		final String equalDirectories="Destination directory is equal to source directory. Please choose different source or destination directory.";//in class message
		final String emptySourceDir="There is no files in source directory please choose non empty directory.";//in class message
		final String sameFileName="There is already the same file name in this folder.";//in class message
		String file="";
		//choose source directory
		System.out.println("Choose source directory:");//in class message
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		String sourceDirectory=scanner.nextLine();
		
		//print chosen directory
		System.out.println("Chosen source directory:\n"+sourceDirectory);//in class message
		
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
		
	    System.out.println("List of files in source directory:\n");//in class message
	    if(filesInSourceDirectory.length>0) {
	    	for (String string : filesInSourceDirectory) {
				System.out.println(string+"\n");
			}
	    	
	    	 //choose file from source directory which you want to copy
		    System.out.println("Choose file from source directory:\n");//in class message
		    String fileToMove=scanner.nextLine();
		    file=fileToMove;
		    //print chosen file from source directory
		    System.out.println("You have chosen "+fileToMove+" from this directory: "+sourceDirectory);//in class message
	    	
	    	
	    }else {
	    	System.out.println(noneMessage);
	    	System.out.println(emptySourceDir);
	    	System.exit(0);
	    }
	    
	   
	
		
		//choose destination directory
	    System.out.println("Choose destination directory:");//in class message
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
	    //check if file name is equal to file which we want to copy
	    System.out.println("Chosen destination directory:\n"+destinationDirectory);//in class Message
	    String[] filesInDestinationDirectory;
	    File filesinDestination=new File(destinationDirectory);
	    filesInDestinationDirectory=filesinDestination.list();
	    System.out.println("List of files in destination directory:\n");//in class message under the setlistoffiles setter
	    
	    String fileInDirectory="";
	    
	    for (String string : filesInDestinationDirectory) {
			//System.out.println(string+"\n");
	    	if(string.equals(file)) {
				fileInDirectory=string;
				break;
			}
			
		}
	    
	    
	  //if there is already file in the same name in destination folder 
	  		//do not create new file do not delete from source directory
	  		if(fileInDirectory.equals(file)) {
	  			System.out.println(sameFileName);
	  			System.exit(0);
	  		}else {
	  			
	  			
	  		//create file under the name from file which we want to copy in destination folder
	  			//if failed exit the program with failed message
	  			//else print successfully message
	  			//output needs to be closed because it will not copy file content because other process will be used.
	  			try {
	  				FileOutputStream output=new FileOutputStream(destinationDirectory+"/"+file);
	  				output.close();
	  			} catch (IOException e) {
	  				System.out.println("File creation failed.");//in class message
	  				e.printStackTrace();
	  				System.exit(0);
	  			}
	  			System.out.println("File successfully created.");//in class message
	  			
	  			
				
	  			//get file name from source directory and the directory and put it into path string
	  			//if succesfully moved return successfuly message if not exit the program with message fail
	  			String path=sourceDirectory+"/"+file;
	  			String destination=destinationDirectory+"/"+file;
	  			
	  			try {
	  				Path temp=Files.move(Paths.get(path), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
	  				 if(temp != null) 
	  			        { 
	  			            System.out.println("File renamed and moved successfully"); //in class message
	  			        } 
	  			        else
	  			        { 
	  			            System.out.println("Failed to move the file"); //in class message
	  			        } 
	  			} catch (IOException e) {
	  				System.out.println("Failed file move");//substitute to File renamed and moved successfully.
	  				
	  				e.printStackTrace();
	  				System.exit(0);
	  			}
	  			System.out.println("File successfuly moved.");//substitute to Failed to move the file
	  			
	  			
	  			
	  			
	  			
	  		}
	    
	    
	    
	    
	
	    };
}
}
