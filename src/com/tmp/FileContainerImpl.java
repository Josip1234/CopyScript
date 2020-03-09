package com.tmp;

import java.util.HashMap;
import java.util.Map;

/***
 * 
 * @author Korisnik
 * will implement functions defined in the file container interface
 */
public class FileContainerImpl implements FileContainer{

	@Override
	public void addToTheList(File file, ListOfFiles listOfFiles) {
		listOfFiles.getListOfFiles().add(file);

		
	}



	@Override
	public boolean isItSource(Directory directory) {
		boolean isTrue=false;
		Directory source=Directory.sourceDirectory;
		if(directory.equals(source)) {
			isTrue=true;
	}else{
			isTrue=false;
		}
		return isTrue;
	}



	@Override
	public Map<ListOfFiles, Message> listFilesInDirectories(File file,Directory directory, ListOfFiles listOfFiles) {
		Message message=new Message("");
		if(isItSource(directory)==true) {
			message.setReturningMessage(Message.chooseSource);
		}else {
			message.setReturningMessage(Message.chooseDestination);
		}
		Map<ListOfFiles, Message> files=new HashMap<ListOfFiles,Message>();
		files.put(listOfFiles, message);
		
		return files;
	}



	@Override
	public ListOfFiles addFakeData() {
		File file=new File();
		file.setFile("test1.txt");
		ListOfFiles files=new ListOfFiles();
		FileContainerImpl containerImpl=new FileContainerImpl();
	    containerImpl.addToTheList(file, files);
	    file.setFile("test2.mp4");
	    containerImpl.addToTheList(file, files);
	    file.setFile("test3.jpg");
	    containerImpl.addToTheList(file, files);
		file.setFile("test4.docx");
		containerImpl.addToTheList(file, files);
		file.setFile("test5.3db");
		containerImpl.addToTheList(file, files);
		file.setFile("test6.pdf");
		containerImpl.addToTheList(file, files);
		file.setFile("test7.xmls");
		containerImpl.addToTheList(file, files);
		return files;
	}


}
