package com.cmd.concept.implementations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.cmd.concept.files.FileParser;
import com.cmd.concept.interfaces.FileOperations;
import com.cmd.concept.messages.Message;
import com.cmd.concept.pojo.Input;
import com.cmd.concept.pojo.SourceDestination;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

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

	@Override
	public void saveLastEnteredSourceAndDestinationToFile(SourceDestination sourceDestination) {
		printMessage(getChooseDirectoryToSaveLastOpened());
	    Input input=new Input();
	    String directoryToSaveFile=input.nextLine();
	     File file=new File(directoryToSaveFile);
	     if(!file.exists()) {
	    	 System.exit(0);
	     }
	    
	    
		 String lastSavedDirectories="directories.json";
	     
		 
		
		 ObjectMapper mapper=new ObjectMapper();
		 JsonNode rootNode=mapper.createObjectNode();
		 ObjectNode objectNode=(ObjectNode) rootNode;
		 objectNode.put("sourceDirectory", sourceDestination.getSourceDirectory());
		 objectNode.put("destinationDirectory", sourceDestination.getDestinationDirectory());
		 
		 
		 JsonFactory factory = new JsonFactory();
		 try {
			JsonGenerator generator= factory.createGenerator(new File(directoryToSaveFile+"/"+lastSavedDirectories), JsonEncoding.UTF8);
			generator.useDefaultPrettyPrinter();
			mapper.writeTree(generator, rootNode);
		} catch (Exception e) {
			
			e.printStackTrace();
			System.exit(0);
		}
	    
		
		
	}

	/*
	@Override
	public Map<String, String> removeDoubleValueFromString(SourceDestination sourceDestination) {
		String source=sourceDestination.getSourceDirectory();
		String destination=sourceDestination.getDestinationDirectory();
		source=returnCleanedString(source);
	    destination=returnCleanedString(destination);
	    Map<String, String> map=new HashMap<String, String>();
	    map.put("source", source);
	    map.put("destination", destination);
		return map;
	}

	//convert the string to the array of char and store it in a linked hash set
	//that will preserve your ordering, and remove duplicates
	@Override
	public String returnCleanedString(String string) {
		char[] chars = string.toCharArray();
		Set<Character> charSet=new LinkedHashSet<Character>();
		for (Character character : charSet) {
			charSet.add(character);
		}
		StringBuilder sb =new StringBuilder();
		for (Character character : charSet) {
			sb.append(character);
		}
		return sb.toString();
	}
*/


}
