package com.cmd.concept.implementations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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

}
