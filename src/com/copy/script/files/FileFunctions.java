package com.copy.script.files;

import com.copy.script.keyboard.input.KeyboardInput;
import com.copy.script.messages.Message;


/***
 * 
 * @author Korisnik
 * @category Files
 * @since 1.1.2021. 14:14
 * @version 1.0
 *
 */
public class FileFunctions implements FileOperations{

	@Override
	public void doYouWantToListFilesFromFolders() {
	
	
			boolean yes=false;
			System.out.println(Message.listFiles);
			System.out.println(Message.insertBoolean);
			KeyboardInput input = new KeyboardInput();
			try {
				yes = input.insertBoolean();
				System.out.println(Message.youHaveChosen+yes);
			} catch (Exception e) {
				System.out.println(Message.invalidChoice);
			}
			
			
			
		
			
		
		
	}

}
