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
		
		
		message.printMessage(message.getOpenLastDirectory());
		input.setOpen(input.nextBoolean());
		input.nextLine();
		
		if(input.isOpen()==true) {
			message.printMessage(message.getChooseFileLastSaved());
			String lastFile=input.nextLine();
			FileParserImpl impl=new FileParserImpl();
			sd=impl.returnLastSavedLinks(lastFile);
			message.setListOffilesMessage(sd.getSourceDirectory());
			message.printMessage(message.getListOffilesMessage());
			DirectoryImpl directoryImpl= new DirectoryImpl();
			directoryImpl.printSourceDirectoryFiles(sd);
			
					
		}else {
			message.printMessage("False");
		}
	      

	}

}
