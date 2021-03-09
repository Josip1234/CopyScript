package com.copy.script.files;

import com.copy.script.keyboard.input.KeyboardInput;
import com.copy.script.menus.SubMenu;
import com.copy.script.messages.Message;


/***
 * 
 * @author Korisnik
 * 
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
				String chosen="";
				yes = input.insertBoolean();
				if(yes==true) {
					System.out.println(Message.youHaveChosen+yes);
					SubMenu subMenu = new SubMenu();
					chosen=subMenu.chooseHowToListFiles();
					System.out.println(Message.youHaveChosen+chosen);
				}else {
					System.out.println(Message.youHaveChosen+yes);
					
				}
				
				
			} catch (Exception e) {
				System.out.println(Message.invalidChoice);
			}
			
			
			
		
			
		
		
	}

}
