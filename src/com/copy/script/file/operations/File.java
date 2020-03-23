/**
 * 
 */
package com.copy.script.file.operations;

/**
 * @author Korisnik
 * @since 23.3.2020. 18:17
 * <blockquote> Pojo class for file name and file name parsing</blockquote>
 *
 */
public class File {
	private String fileName;

	public File(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return getFileName();
	}
	
	

}
