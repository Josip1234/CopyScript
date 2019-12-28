package com.cmd.concept;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cmd.concept.pojo.SourceDestination;
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
		 String sourceDirectory="sourceDirectory"; //in merge three classes
		 String destinationDirectory="destinationDirectory";//in merge three classes
		 boolean open=false;//in merge three classes
		 Scanner scanner=new Scanner(System.in);//in merge three classes
		 //here app will ask user to open external file
		 System.out.println("Open last saved source and destination directory? true for yes false for no");//in merge three classes
		 //boolean input if user opens then file will be parsed else make json objects from chosen directory
		 open=scanner.nextBoolean();//in merge three classes
		 scanner.nextLine();//in merge three classes
		 if(open==true) {//in merge three classes
			 System.out.println("Choose file which contains last saved source and destination directory:");//in merge three classes
			 String lastFile=scanner.nextLine();//in merge three classes
			 System.out.println("Reading json source files and parsing it to the variable...");//in merge three classes
			 ObjectMapper map=new ObjectMapper();//in merge three classes
			 try {//in merge three classes
				SourceDestination sd=map.readValue(new File(lastFile), SourceDestination.class);//in merge three classes
				System.out.println(sd.getSourceDirectory()+"\n"+sd.getDestinationDirectory());//in merge three classes
			} catch (JsonParseException e) {//in merge three classes
				// TODO Auto-generated catch block
				e.printStackTrace();//in merge three classes
			} catch (JsonMappingException e) {//in merge three classes
				// TODO Auto-generated catch block
				e.printStackTrace();//in merge three classes
			} catch (IOException e) {//in merge three classes
				// TODO Auto-generated catch block
				e.printStackTrace();//in merge three classes
			}//in merge three classes
			 System.exit(0);//in merge three classes
		 }else {//in merge three classes
			 System.out.println("Enter source and destination directory, etc...");//in merge three classes
			 System.exit(0);//in merge three classes
		 }//in merge three classes
		
		 
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
