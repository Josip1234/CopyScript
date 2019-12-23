package com.cmd.concept.messages;

public class Message {
	
	final String noneMessage;
	final String equalDirectories;
	final String emptySourceDir;
	final String sameFileName;
	final String chooseSourceDirectory;
	String chosenSource;
	String listOffilesMessage;
	final String chooseFileMessage;
	String chosenFileMessage;
	final String chooseDestinationDirectoryMessage;
	String chosenDestinationDirectoryMessage;
	final String fileCreationFailed;
	final String fileCreationSuccess;
	final String fileRenameAndMoveSuccess;
	final String fileRenameAndMoveFailed;
	
	public Message() {
		this.noneMessage="none";
		this.equalDirectories="Destination directory is equal to source directory. Please choose different source or destination directory.";
		this.emptySourceDir="There are no files in source directory please choose non empty directory.";
		this.sameFileName="There is already the same file name in this folder.";
		this.chooseSourceDirectory="Choose source directory:";
		this.chooseFileMessage="Choose file from source directory:\n";
		this.chooseDestinationDirectoryMessage="Choose destination directory:";
		this.fileCreationFailed="File creation failed.";
		this.fileCreationSuccess="File successfully created.";
		this.fileRenameAndMoveSuccess="File renamed and moved successfully.";
		this.fileRenameAndMoveFailed="Failed to move the file";
		
	}
	
	
	
	





	public String getChooseSourceDirectory() {
		return chooseSourceDirectory;
	}









	public String getChooseFileMessage() {
		return chooseFileMessage;
	}









	public String getChooseDestinationDirectoryMessage() {
		return chooseDestinationDirectoryMessage;
	}









	public String getFileCreationFailed() {
		return fileCreationFailed;
	}









	public String getFileCreationSuccess() {
		return fileCreationSuccess;
	}









	public String getFileRenameAndMoveSuccess() {
		return fileRenameAndMoveSuccess;
	}









	public String getFileRenameAndMoveFailed() {
		return fileRenameAndMoveFailed;
	}









	public String getChosenDestinationDirectoryMessage() {
		return chosenDestinationDirectoryMessage;
	}









	public void setChosenDestinationDirectoryMessage(String destinationDirectory) {
		this.chosenDestinationDirectoryMessage = "Chosen destination directory:\n"+destinationDirectory;
	}











	public String getChosenFileMessage() {
		return chosenFileMessage;
	}









	public void setChosenFileMessage(String fileToMove, String sourceDirectory) {
		this.chosenFileMessage = "You have chosen "+fileToMove+" from this directory: "+sourceDirectory;
	}









	public String getListOffilesMessage() {
		return listOffilesMessage;
	}





	public void setListOffilesMessage(String directory) {
		this.listOffilesMessage = "List of files in "+ directory +" directory:\n";
	}





	public String getChosenSource() {
		return chosenSource;
	}



	public void setChosenSource(String chosenSource) {
		this.chosenSource = "Chosen source directory:\n"+chosenSource;
	}



	public String getNoneMessage() {
		return noneMessage;
	}

	public String getEqualDirectories() {
		return equalDirectories;
	}

	public String getEmptySourceDir() {
		return emptySourceDir;
	}

	public String getSameFileName() {
		return sameFileName;
	}
	
	

}