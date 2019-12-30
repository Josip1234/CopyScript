package com.cmd.merge.cmd;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
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

public class ThreeClassMerge {

	public static void main(String[] args) {
		
		final String noneMessage="none";//in class message
		final String equalDirectories="Destination directory is equal to source directory. Please choose different source or destination directory.";//in class message
		final String emptySourceDir="There is no files in source directory please choose non empty directory.";//in class message
		final String sameFileName="There is already the same file name in this folder.";//in class message
		String file="";//in main
		
		
		String sourceDirectory="";//init sourcedestination in main
		String destinationDirectory="";//init sourcedestination in main
		boolean open=false;//init input class in main
		
		Scanner scanner=new Scanner(System.in);//init input class in main
		System.out.println("Open last saved source and destination directory? true for yes false for no");//in class message
		open=scanner.nextBoolean();//setter to set boolean input value in main
		scanner.nextLine();//input is set to next line to get string ina main
		
		 if(open==true) {//in main class
			 System.out.println("Choose file which contains last saved source and destination directory:");//in class message in main too
			 String lastFile=scanner.nextLine();//in main
			 System.out.println("Reading json source files and parsing it to the variable...");//not needed only for testing purposes
			 ObjectMapper map=new ObjectMapper();//in file parser
			 try {
				SourceDestination sd=map.readValue(new File(lastFile), SourceDestination.class);//in file parser
				System.out.println(sd.getSourceDirectory()+"\n"+sd.getDestinationDirectory());//not needed only for testing purposes
				sourceDirectory=sd.getSourceDirectory();//in file parser
				destinationDirectory=sd.getDestinationDirectory();//in file parser
				
				String[] filesInSourceDirectory; //in directory impl
				File filesInSource=new File(sourceDirectory); // in directory impl
				filesInSourceDirectory=filesInSource.list(); // in directory impl
				
			    System.out.println("List of files in source directory:\n");//in class message and main class
			    if(filesInSourceDirectory.length>0) {//in directory impl
			    	for (String string : filesInSourceDirectory) {//in directory impl
						System.out.println(string+"\n");//in directory impl
					}//in directory impl
			  //-----------------------------------------------------------------------------------------  	
			    	 //choose file from source directory which you want to copy
				    System.out.println("Choose file from source directory:\n");//in class message
				    String fileToMove=scanner.nextLine();//inputOperations
				    file=fileToMove;
				    //print chosen file from source directory
				    System.out.println("You have chosen "+fileToMove+" from this directory: "+sourceDirectory);//in class message
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
				  				FileOutputStream output=new FileOutputStream(destinationDirectory+"/"+file);//file parser impl
				  				output.close();//file parser impl
				  			} catch (IOException e) {//file parser impl
				  				System.out.println("File creation failed.");//in class message
				  				e.printStackTrace();//file parser impl
				  				System.exit(0);//file parser impl
				  			}
				  			System.out.println("File successfully created.");//in class message//file parser impl
				  			
				  			
							
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
				    
				 
				 
				 
				 
				 System.exit(0);
			 }
				    
				    
			    	
			    }else {//in directory impl
			    	System.out.println(noneMessage);//in directory impl
			    	System.out.println(emptySourceDir);//in directory impl
			    	System.exit(0);//in directory impl, maybe unessesary
			    }
			} catch (JsonParseException e) {
				
				e.printStackTrace();
			} catch (JsonMappingException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			 System.exit(0);
		 }else {
			 
			 System.out.println("Enter source and destination directory, etc...");//not needed
			 
				//choose source directory
				System.out.println("Choose source directory:"); //input impl
				sourceDirectory=scanner.nextLine();//input impl
				
				//print chosen directory
				System.out.println("Chosen source directory:\n"+sourceDirectory);//in class message
				
				
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
				    String fileToMove=scanner.nextLine();//inputOperations
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
			    destinationDirectory=scanner.nextLine();//input impl
			    
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
			    
			    System.out.println("Choose directory to save last opened surce and destination directory:");//in class message
			    String directoryToSaveFile=scanner.nextLine();
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
			    
			 
			 
			 
			 
			 System.exit(0);
		 }

	}
	}
}

	


