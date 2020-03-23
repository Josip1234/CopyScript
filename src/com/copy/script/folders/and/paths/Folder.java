/**
 * 
 */
package com.copy.script.folders.and.paths;

/**
 * @author Korisnik
 * @since 23.3.2020. 18:30
 * <blockquote>Folder pojo class which will contain folder name string.</blockquote>
 */
public class Folder {
	private String folderName;
	
	public Folder() {
		this.folderName="";
	}

	public Folder(String folderName) {
		this.folderName = folderName;
	}

	public String getFolderName() {
		return folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}

	@Override
	public String toString() {
		return getFolderName();
	}
	

}
