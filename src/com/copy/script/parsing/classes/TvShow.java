package com.copy.script.parsing.classes;
/**
 * 
 * @author Korisnik
 * @category ParsingClass
 * @version 1.0
 * @since 28.12.2020. 21:12
 */
public class TvShow {
	private Integer id;
	private String showName;
	private String path;
	private String folder;
	private String fileExtension;
	private boolean isWatched;
	
	/**
	 * @author Korisnik
	 * @category Constructor
	 * @since 28.12.2020. 21:20
	 * @param id - id of the file in folder
	 * @param showName - name of the show or simply name of the file
	 * @param path - file path
	 * @param folder - folder name in where file is
	 * @param fileExtension - file extension
	 * @param isWatched - is this tv show watched
	 */
	public TvShow(Integer id, String showName, String path, String folder, String fileExtension, boolean isWatched) {
		
		this.id = id;
		this.showName = showName;
		this.path = path;
		this.folder = folder;
		this.fileExtension = fileExtension;
		this.isWatched = isWatched;
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

	@Override
	public String toString() {
		return '"'+"TvShow"+'"'+":"+"{"+'"'+"id"+'"'+":"+id+","+'"'+"showName"+'"'+":"+'"'+showName+'"'+","
				+'"'+"path"+'"'+":"+'"'+path+'"'+","
				+'"'+"folder"+'"'+":"+'"'+folder+'"'+","
				+'"'+"fileExtension"+'"'+":"+'"'+fileExtension+'"'+","
				+'"'+"isWatched"+'"'+":"+'"'+isWatched+'"'+"}";
	}
	
	
	
	


	
	
	

}
