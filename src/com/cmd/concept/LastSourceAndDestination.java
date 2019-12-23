package com.cmd.concept;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class LastSourceAndDestination {
	 public static void main(String[] args) {
		 String sourceDirectory="sourceDirectory";
		 String destinationDirectory="destinationDirectory";
		 boolean open=false;
		 Scanner scanner=new Scanner(System.in);
		 //here app will ask user to open external file
		 System.out.println("Open last saved source and destination directory? true for yes false for no");
		 //boolean input if user opens then file will be parsed else make json objects from chosen directory
		 open=scanner.nextBoolean();
		 scanner.nextLine();
		 if(open==true) {
			 System.out.println("Choose file which contains last saved source and destination directory:");
			 String lastFile=scanner.nextLine();
			 System.out.println("Reading json source files and parsing it to the variable...");
			 ObjectMapper map=new ObjectMapper();
			 try {
				SourceDestination sd=map.readValue(new File(lastFile), SourceDestination.class);
				System.out.println(sd.getSourceDirectory()+"\n"+sd.getDestinationDirectory());
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.exit(0);
		 }else {
			 System.out.println("Enter source and destination directory, etc...");
			 System.exit(0);
		 }
		
		 
		 //save last saved source and destination directory to json file located from user choice
		 //before loading, user must include json file location
		 //before going into app user will have a dialog box which will 
		 //ask him to load last saved locations if there is no 
		 //locations, app will open without parsing file 
		 //after user input directory it will be saved directly if
		 //user have last saved location, file will be parsed and values will be in
		 //the string source and destination directory
		 //add to the map source and destination directory keys are source directory and destination directory
		 //values input from keyboard from user 
		// Map<String, String> mapa=new HashMap<String, String>();
		 //mapa.put("sourceDirectory", sourceDirectory);
		 //mapa.put("destinationDirectory", destinationDirectory);
		 
		 //user will choose output directory
		 //directories.json are output files which will contain values from map
		 //for processing jackson library will be used and jackson databind also
		 String directoryToSaveFile="mydirectory";
		 String lastSavedDirectories="directories.json";
	     
		 //make json objects
		 ObjectMapper mapper=new ObjectMapper();
		 JsonNode rootNode=mapper.createObjectNode();
		 ObjectNode objectNode=(ObjectNode) rootNode;
		 objectNode.put("sourceDirectory", sourceDirectory);
		 objectNode.put("destinationDirectory", destinationDirectory);
		 
		 //add json object to file
		 JsonFactory factory = new JsonFactory();
		 try {
			JsonGenerator generator= factory.createGenerator(new File(directoryToSaveFile+"/"+lastSavedDirectories), JsonEncoding.UTF8);
			generator.useDefaultPrettyPrinter();
			mapper.writeTree(generator, rootNode);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 
		 
	
		  }

}
