package com.tmp;

public class File {
	/***
	 * File name string to use in the application
	 */
	private String file;
	
	public File() {
		this.file="";
	}
	/**
	 * 
	 * @param file initialize file
	 */
	public File(String file) {
		this.file=file;
	}

	public String getFile() {
		return file;
	}
     /***
      * 
      * @param file set new file
      */
	public void setFile(String file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return file;
	}
	
	
	

}
