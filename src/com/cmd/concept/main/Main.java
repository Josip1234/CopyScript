package com.cmd.concept.main;

import java.io.IOException;
import java.util.Map;

import com.cmd.concept.implementations.DirectoryImpl;
import com.cmd.concept.implementations.FileParserImpl;
import com.cmd.concept.implementations.InputImpl;
import com.cmd.concept.messages.Message;
import com.cmd.concept.pojo.Input;
import com.cmd.concept.pojo.SourceDestination;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Main {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String file="";
		
		SourceDestination sd=new SourceDestination();
		Input input=new Input();
		Message message=new Message();
		DirectoryImpl directoryImpl= new DirectoryImpl();
		FileParserImpl impl=new FileParserImpl();
		InputImpl inputImpl=new InputImpl();
		
		message.printMessage(message.getOpenLastDirectory());
		input.setOpen(input.nextBoolean());
		input.nextLine();
		
		if(input.isOpen()==true) {
			message.printMessage(message.getChooseFileLastSaved());
			String lastFile=input.nextLine();
			
			sd=impl.returnLastSavedLinks(lastFile);
			message.setListOffilesMessage(sd.getSourceDirectory());
			message.printMessage(message.getListOffilesMessage());	
			directoryImpl.printSourceDirectoryFiles(sd);
			file=inputImpl.enterFileToCopyOrMove();
			message.setChosenFileMessage(file, sd.getSourceDirectory());
			message.printMessage(message.getChosenFileMessage());
			if(sd.getDestinationDirectory().equals(sd.getSourceDirectory())) {
				message.printMessage(message.getEqualDirectories());
				System.exit(0);
						
			}else {
				
				message.setChosenDestinationDirectoryMessage(sd.getDestinationDirectory());
				message.printMessage(message.getChosenDestinationDirectoryMessage());
				String fileInDirectory=directoryImpl.returnFileNameInDestinationDirectory(sd, file);
				message.printMessage(fileInDirectory);
				
				if(fileInDirectory.equals(file)) {
					message.printMessage(message.getSameFileName());
					System.exit(0);
				}else {
					impl.createFile(sd, file);
					impl.moveFile(sd, file);
				}
				System.exit(0);
				
			}
			
					
		}else {
			 
				message.printMessage(message.getChooseSourceDirectory());
				sd.setSourceDirectory(input.nextLine());
				message.setChosenSource(sd.getSourceDirectory());
				message.printMessage(message.getChosenSource());
				
				directoryImpl.printSourceDirectoryFiles(sd);
			    message.printMessage(message.getChooseFileMessage());
			    file=input.nextLine();
				message.setChosenFileMessage(file, sd.getSourceDirectory());
				message.printMessage(message.getChosenFileMessage());
				
				message.printMessage(message.getChooseDestinationDirectoryMessage());
			    sd.setDestinationDirectory(input.nextLine());
			
			    
			    if(sd.getDestinationDirectory().equals(sd.getSourceDirectory())) {
			    	message.printMessage(message.getEqualDirectories());
			    	System.exit(0);
			    }else {
			    
			    message.setChosenDestinationDirectoryMessage(sd.getDestinationDirectory());
			    message.printMessage(message.getChosenDestinationDirectoryMessage());
			    
			   
			
			   String fileInDirectory=directoryImpl.returnFileNameInDestinationDirectory(sd, file);
			 	if(fileInDirectory.equals(file)) {
			  			message.printMessage(message.getSameFileName());
			  			System.exit(0);
			  		}else {
			  		    impl.saveLastEnteredSourceAndDestinationToFile(sd);
			  			impl.createFile(sd, file);
			  			impl.moveFile(sd, file);
			  			
			  		}
			    
			 
			 
			 
			 
			 System.exit(0);
		 }
			
			
			
			
			
			
		   
		}
	      

	}

}
