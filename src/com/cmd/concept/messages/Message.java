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
	final String openLastDirectory;
	final String chooseFileLastSaved;
	final String chooseDirectoryToSaveLastOpened;
	public static final String fileOperations="File operations";
	public static final String copyFile="Copy";
	public static final String moveFile="Move";
	public static final String chooseFile="Load";
	public static final String deleteFile="Delete";
	public static final String createFile="Create";
	public static final String directoryOperations="Directory operations";
	public static final String openLastDirectories="Open last directories";
	public static final String defaultJson="Default json";
	public static final String openJsonFile="Open json file";
	public static final String openSourceDirectory="Open source directory";
	public static final String openDestinationDirectory="Open destination directory";
	public static final String list="List";
	public static final String listFilesInSource="List files in source";
	public static final String listFilesInDestination="List files in destination";
	public static final String terminateProgram="Terminate program";
	public static final String newSession="New session";
	
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
		this.openLastDirectory="Open last saved source and destination directory? true for yes false for no";
		this.chooseFileLastSaved="Choose file which contains last saved source and destination directory:";
		this.chooseDirectoryToSaveLastOpened="Choose directory to save last opened surce and destination directory:";
		
		
	}
	
	
	
	






























	public String getChooseFileLastSaved() {
		return chooseFileLastSaved;
	}









	public String getChooseDirectoryToSaveLastOpened() {
		return chooseDirectoryToSaveLastOpened;
	}









	public String getOpenLastDirectory() {
		return openLastDirectory;
	}









	public void setChosenFileMessage(String chosenFileMessage) {
		this.chosenFileMessage = chosenFileMessage;
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
		this.listOffilesMessage = "List of files in "+ directory +"\n";
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
	
	public void printMessage(String message) {
		System.out.println(message);
	}

}
