package com.cmd.concept;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class MoveFileToDirectory {

	public static void main(String[] args) {
		//do not move file if there is already file with the same name in destination directory!!!
		//do not also delete file in source directory!!!
		//array of files in destination directory
		String[] filesInDirectory;
		//file to copy
		String file="myfile.txt";
		//destination directory in which file will be created
		String destinationDirectory="C:\\Users\\Korisnik\\Desktop\\CopyScript\\destinationDirectory\\";
		
		//fill out the list from destination directory
		//read from directory
		//create file object it will have destination directory
		//add to array
		File listFile=new File(destinationDirectory);
		filesInDirectory=listFile.list();
		
		//list files
		//check if file name is equal to file which we want to copy
		//if it is do not create new file 
		//else create new file
		String fileInDirectory="";
		for (String string : filesInDirectory) {
			System.out.println(string+"\n");
			if(string.equals(file)) {
				fileInDirectory=string;
				break;
			}
		}
		//if there is already file in the same name in destination folder 
		//do not create new file do not delete from source directory
		if(fileInDirectory.equals(file)) {
			System.exit(0);
		}else {
		
		
		//current directory
		String sourceDirectory="C:\\Users\\Korisnik\\Desktop\\CopyScript\\sourceDirectory\\";
		
		//create file under the name from file which we want to copy in destination folder
		//if failed exit the program with failed message
		//else print successfully message
		//output needs to be closed because it will not copy file content because other process will be used.
		try {
			FileOutputStream output=new FileOutputStream(destinationDirectory+file);
			output.close();
		} catch (IOException e) {
			System.out.println("File creation failed.");
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("File successfully created.");
				
		//get file name from source directory and the directory and put it into path string
		//if succesfully moved return successfuly message if not exit the program with message fail
		String path=sourceDirectory+file;
		String destination=destinationDirectory+file;
		
		try {
			Path temp=Files.move(Paths.get(path), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
			 if(temp != null) 
		        { 
		            System.out.println("File renamed and moved successfully"); 
		        } 
		        else
		        { 
		            System.out.println("Failed to move the file"); 
		        } 
		} catch (IOException e) {
			System.out.println("Failed file move");
			
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("File successfuly moved.");
		
		
		}    
	}

}
