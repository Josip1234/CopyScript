package com.tmp;

import java.util.ArrayList;
import java.util.List;

public class ListOfFiles {
	/**
	 * list of files as array list and its operations
	 */
	private List<File> listOfFiles;
	
	/***
	 * initialize empty list of file object
	 */
	public ListOfFiles() {
		this.listOfFiles=new ArrayList<File>();
	}
	/***
	 * 
	 * @param list set new list
	 */
	public ListOfFiles(List<File> list) {
		this.listOfFiles=list;
	}

	/***
	 * 
	 * @return list of files in this list
	 * 
	 */
	public List<File> getListOfFiles() {
		return listOfFiles;
	}
	
	

}
