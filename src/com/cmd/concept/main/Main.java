package com.cmd.concept.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

import com.cmd.concept.implementations.DirectoryImpl;
import com.cmd.concept.implementations.FileParserImpl;

import com.cmd.concept.messages.Message;
import com.cmd.concept.pojo.SourceDestination;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Main {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		FileParserImpl impl=new FileParserImpl();
		SourceDestination destination=impl.returnLastSavedLinks("mydirectory/directories.json");
		System.out.println(destination.getSourceDirectory()+"\n"+destination.getDestinationDirectory());
		DirectoryImpl dirImpl=new DirectoryImpl();
		dirImpl.printSourceDirectoryFiles(destination);
		
		
	      

	}

}
