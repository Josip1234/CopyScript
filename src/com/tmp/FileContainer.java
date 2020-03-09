package com.tmp;

import java.util.Map;

import com.tmp.Message;

/***
 * 
 * @author Korisnik
 * List of functions for the implementation of
 * list of file objects in the list of files 
 * in source or destination directory
 *
 */
public interface FileContainer {
	/***
	 * 
	 * @param file add to the list one file
	 * @param listOfFiles list of files depending of the directory type
	 */
	void addToTheList(File file, ListOfFiles listOfFiles);
	/***
	 * 
	 * @param directory enum for type of directory, is it source or destination?
	 * @return map of list of files in directory depending of type of directory, and returning message
	 * @param listOfFIles what list do you want to print, with message from source or destination directory
	 */
	Map<ListOfFiles,Message> listFilesInDirectories(File file,Directory directory, ListOfFiles listOfFiles);
	/***
	 * 
	 * @param directory type of directory
	 * @return true if type is source directory, false if is it destination directory
	 */
	boolean isItSource(Directory directory);
	/***
	 * 
	 * @return list with a fake data as simulation to data in directory list.
	 */
	ListOfFiles addFakeData();

}
