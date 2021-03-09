package com.copy.script.folders;
/***
 * 
 * @author Korisnik
 * 
 * @version 1.0
 * @since 30.12.2020. 10:07
 */
public class Folder {
	private String sourceDirectory;
	private String destinationDirectory;
	
	
	/***
	 *
	 * @author Korisnik
	 * @since 30.12.2020. 10:17
	 */
	public Folder() {
	}


	/***
	 * @author Korisnik
	 * @since 30.12.2020. 10:08
	 * @param sourceDirectory source directory where file is
	 * @param destinationDirectory destination directory where file needs to be copied or moved
	 */
	public Folder(String sourceDirectory, String destinationDirectory) {
		this.sourceDirectory = sourceDirectory;
		this.destinationDirectory = destinationDirectory;
	}


/**
 * @author Korisnik
 * @since 30.12.2020. 10:10
 * @return current source directory
 */
	public String getSourceDirectory() {
		return sourceDirectory;
	}


/***
 * @author Korisnik
 * @since 30.12.2020. 10:10
 * @param sourceDirectory set new source directory
 */
	public void setSourceDirectory(String sourceDirectory) {
		this.sourceDirectory = sourceDirectory;
	}


/***
 * @author Korisnik
 * @since 30.12.2020. 10:11
 * @return current destination directory
 */
	public String getDestinationDirectory() {
		return destinationDirectory;
	}


/***
 * @author Korisnik
 * @since 30.12.2020. 10:11
 * @param destinationDirectory set new destination directory
 */
	public void setDestinationDirectory(String destinationDirectory) {
		this.destinationDirectory = destinationDirectory;
	}


@Override
public String toString() {
	return '"'+"Folder"+'"'+":"+ "{"+'"'+"sourceDirectory"+'"'+":"+'"'+sourceDirectory +'"'+","+'"'+ " destinationDirectory"+'"'+":" +'"'+ destinationDirectory + '"'+"}";
}
	
	
	

}
