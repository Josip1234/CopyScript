package com.cmd.concept.implementations;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.cmd.concept.interfaces.DirectoryOperations;
import com.cmd.concept.messages.Message;
import com.cmd.concept.pojo.SourceDestination;

public class DirectoryImpl extends Message implements DirectoryOperations {
//need also to list files in destination directory
	@Override
	public List<String> printSourceDirectoryFiles(SourceDestination source) {
		List<String> listOfFiles=new ArrayList<String>();
		String[] filesInSourceDirectory;
		File filesInSource=new File(source.getSourceDirectory());
		filesInSourceDirectory=filesInSource.list();
		getListOffilesMessage();
		 if(filesInSourceDirectory.length>0) {
		    	for (String string : filesInSourceDirectory) {
		    		System.out.println(string+"\n");
					listOfFiles.add(string);
				}
		 }else {
			 System.out.println(getNoneMessage());
			 System.out.println(getEmptySourceDir());
			 listOfFiles.add(getNoneMessage());
			 listOfFiles.add(getEmptySourceDir());
			 System.exit(0);
		 }
      return listOfFiles;
	}

	@Override
	public String returnFileNameInDestinationDirectory(SourceDestination destination, String file) {
		    String[] filesInDestinationDirectory;
		    File filesinDestination=new File(destination.getDestinationDirectory());
		    filesInDestinationDirectory=filesinDestination.list();
		    
		    String fileInDirectory="";
		    
		    for (String string : filesInDestinationDirectory) {
				//System.out.println(string+"\n");
		    	if(string.equals(file)) {
					fileInDirectory=string;
					break;
				}
				
			}
		 
		    
		return fileInDirectory;
	}



}
