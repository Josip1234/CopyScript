package com.cmd.merge.cmd;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.cmd.concept.SourceDestination;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ThreeClassMerge {

	public static void main(String[] args) {
		
		final String noneMessage="none";//in class message
		final String equalDirectories="Destination directory is equal to source directory. Please choose different source or destination directory.";//in class message
		final String emptySourceDir="There is no files in source directory please choose non empty directory.";//in class message
		final String sameFileName="There is already the same file name in this folder.";//in class message
		String file="";
		
		
		String sourceDirectory="";
		String destinationDirectory="";
		boolean open=false;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Open last saved source and destination directory? true for yes false for no");
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
				
				e.printStackTrace();
			} catch (JsonMappingException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			 System.exit(0);
		 }else {
			 
			 System.out.println("Enter source and destination directory, etc...");
			 
				//choose source directory
				System.out.println("Choose source directory:");
				sourceDirectory=scanner.nextLine();
				
				//print chosen directory
				System.out.println("Chosen source directory:\n"+sourceDirectory);//in class message
			 
			 
			 
			 
			 System.exit(0);
		 }

	}

	}

