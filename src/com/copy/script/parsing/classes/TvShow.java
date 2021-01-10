package com.copy.script.parsing.classes;

import java.util.Date;

/**
 * 
 * @author Korisnik
 * @category ParsingClass
 * @version 2.0
 * @since 10.01.2021. 08:46
 */
public class TvShow {
	private Integer id;
	private String showName;
	private String path;
	private String folder;
	private String fileExtension;
	private boolean isWatched;
	private Date dateOfChange;
	
	/**
	 * @author Korisnik
	 * @category Constructor
	 * @since 10.01.2021. 08:54
	 * @param id - id of the file in folder
	 * @param showName - name of the show or simply name of the file
	 * @param path - file path
	 * @param folder - folder name in where file is
	 * @param fileExtension - file extension
	 * @param isWatched - is this tv show watched
	 * @param date - date when data of file has been changed
	 */
	public TvShow(Integer id, String showName, String path, String folder, String fileExtension, boolean isWatched,Date date) {
		
		this.id = id;
		this.showName = showName;
		this.path = path;
		this.folder = folder;
		this.fileExtension = fileExtension;
		this.isWatched = isWatched;
		this.dateOfChange = date; 
	}

	/**
	 * @author Korisnik
	 * @since 28.12.2020. 21:22
	 * @return id of the file
	 */
	public Integer getId() {
		return id;
	}
/**
 * @author Korisnik
 * @since 28.12.2020. 21:23
 * @param id set new file id
 */
	public void setId(Integer id) {
		this.id = id;
	}
/**
 * @author Korisnik
 * @since 28.12.2020. 21:23
 * @return file name 
 */
	public String getShowName() {
		return showName;
	}
/**
 * @author Korisnik
 * @since 28.12.2020. 21:24
 * @param showName - set new file name
 */
	public void setShowName(String showName) {
		this.showName = showName;
	}
	/**
	 * @author Korisnik
	 * @since 28.12.2020. 21:24
	 * @return file path
	 */

	public String getPath() {
		return path;
	}
	/**
	 * @author Korisnik
	 * @since 28.12.2020. 21:25
	 * @param path set new file path
	 */

	public void setPath(String path) {
		this.path = path;
	}
/**
 * @author Korisnik
 * @since 28.12.2020. 21:26
 * @return folder of the file
 */
	public String getFolder() {
		return folder;
	}
/**
 * @author Korisnik
 * @since 28.12.2020. 21:26
 * @param folder set new file folder
 */
	public void setFolder(String folder) {
		this.folder = folder;
	}
	/**
	 * @author Korisnik
	 * @since 28.12.2020. 21:26
	 * @return file extension
	 */

	public String getFileExtension() {
		return fileExtension;
	}
	/***
	 * @author Korisnik
	 * @since 28.12.2020. 21:27
	 * @param fileExtension set new file extension
	 */

	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}
/***
 * @author Korisnik
 * @since 28.12.2020. 21:27
 * @return true if tv show has been watched
 */
	public boolean isWatched() {
		return isWatched;
	}
	/***
	 * @author Korisnik
	 * @since 28.12.2020. 21:28
	 * @param isWatched update new value
	 */

	public void setWatched(boolean isWatched) {
		this.isWatched = isWatched;
	}
	
	
	
    /***
     * @author Korisnik
     * @since 10.01.2021. 08:55
     * @return date of change
     */
	public Date getDateOfChange() {
		return dateOfChange;
	}

	/***
	 * @author Korisnik
	 * @since 10.01.2021. 08:55
	 * @param dateOfChange - set new date 
	 */
	public void setDateOfChange(Date dateOfChange) {
		this.dateOfChange = dateOfChange;
	}

	@Override
	public String toString() {
		return "\"TvShow\" : {\"id\":" + id + ", \"showName\":" +'"' +showName + '"' +", \"path\":" +'"' + path +'"' + ", \"folder\":" +'"' + folder
				+'"' + ", \"fileExtension\":" + '"' +fileExtension +'"' + ", \"isWatched\":" + isWatched + ", \"dateOfChange\":" +'"' + dateOfChange
				+ '"' +"}";
	}


	
	
	
	
	


	
	
	

}
