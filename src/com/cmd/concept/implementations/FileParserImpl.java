package com.cmd.concept.implementations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import com.cmd.concept.files.FileParser;
import com.cmd.concept.interfaces.FileOperations;
import com.cmd.concept.messages.Message;
import com.cmd.concept.pojo.SourceDestination;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class FileParserImpl extends Message implements FileOperations {
//probably some messages needed to be printed overhere
	@Override
	public SourceDestination returnLastSavedLinks(String file) throws JsonParseException, JsonMappingException, IOException {
		FileParser fileParser=new FileParser(file);
		return fileParser.getSourceDestination();
	}

	@Override
	public void createFile(SourceDestination destination, String file) {
		try {
			FileOutputStream output=new FileOutputStream(destination.getDestinationDirectory()+file);
			output.close();
			System.out.println(getFileCreationSuccess());
		} catch (FileNotFoundException e) {
			System.out.println(getFileCreationFailed());
		   e.printStackTrace();
		   System.exit(0);
		} catch (IOException e) {
			System.out.println(getFileCreationFailed());
			e.printStackTrace();
			System.exit(0);
		}
		getFileCreationSuccess();
		
	}

	@Override
	public void moveFile(SourceDestination sourceDestination, String file) {
		String path=sourceDestination.getSourceDirectory()+file;
		String destination=sourceDestination.getDestinationDirectory()+file;
		
		
			try {
				Path temp=Files.move(Paths.get(path), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
				 if(temp != null) 
			        { 
			            printMessage(getFileRenameAndMoveSuccess());
			        } 
			        else
			        { 
			            printMessage(getFileRenameAndMoveFailed());
			        } 
			} catch (IOException e) {
				 printMessage(getFileRenameAndMoveFailed());
				
				e.printStackTrace();
				System.exit(0);
			}
			printMessage(getFileRenameAndMoveSuccess());
		
	}

}
