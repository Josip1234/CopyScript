package com.cmd.concept.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

import com.cmd.concept.implementations.InputImpl;
import com.cmd.concept.interfaces.UserInput;
import com.cmd.concept.messages.Message;

public class Main {

	public static void main(String[] args) {
		InputImpl impl=new InputImpl();
		impl.input();
		
		
		/*Message msg=new Message();
	
		//choose source directory
		System.out.println(msg.getChooseSourceDirectory());//in class message
	
		msg.setChosenSource("some source");
		//print chosen directory
		System.out.println(msg.getChosenSource());//in class message
		
		msg.setListOffilesMessage("source");
	
	    System.out.println(msg.getListOffilesMessage());//in class message
	
	    	
	    	
	    	 //choose file from source directory which you want to copy
		    System.out.println(msg.getChooseFileMessage());//in class message
		    
		    msg.setChosenFileMessage("mojfile.txt", "sourceDirectory");
	
		    //print chosen file from source directory
		    System.out.println(msg.getChosenFileMessage());//in class message
	    	
	    	
	
	    	System.out.println(msg.getNoneMessage());
	    	System.out.println(msg.getEmptySourceDir());
	  
	    
	   
	
		
		//choose destination directory
	    System.out.println(msg.getChooseDestinationDirectoryMessage());//in class message
	    
	    msg.setChosenDestinationDirectoryMessage("destinationDirectory");
	    
	    System.out.println(msg.getChosenDestinationDirectoryMessage());//in class Message
	    
	    msg.setListOffilesMessage("destination");
	   
	    System.out.println(msg.getListOffilesMessage());//in class message under the setlistoffiles setter
	    
	  				System.out.println(msg.getFileCreationFailed());//in class message
	 
	  			System.out.println(msg.getFileCreationSuccess());//in class message
	  			 
	  			            System.out.println(msg.getFileRenameAndMoveSuccess()); //in class message
	  			  
	  			            System.out.println(msg.getFileRenameAndMoveFailed()); //in class message
	 
	  				System.out.println(msg.getFileRenameAndMoveFailed());//substitute to File renamed and moved successfully.
	  				
	  			System.out.println(msg.getFileRenameAndMoveSuccess());//substitute to Failed to move the file
	  		*/
	      

	}

}
