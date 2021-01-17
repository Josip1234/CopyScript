package com.copy.script.menus;

import com.copy.script.activation.main.functions.Function;
import com.copy.script.keyboard.input.KeyboardInput;
import com.copy.script.messages.Message;

/**
 * 
 * @author Korisnik
 * @category Menu
 * @version 1.0
 * @since 2.1.2021. 12:42
 *
 */
public class MainMenu {
	/***
	 * @author Korisnik
	 * @since 2.1.2021. 12:43
	 * @return chosen main menu item
	 */
	public String chooseFromMainMenu() {
		String chosen="";
		Integer input=0;
		System.out.println(Message.chooseSomethingFromMenu);
		System.out.println(Message.enterNumber);
		System.out.println(Message.chooseFolder);
		System.out.println(Message.listOfFiles);
		System.out.println(Message.testData);
		KeyboardInput key = new KeyboardInput();
		input=key.insertInteger();
		switch (input) {
		case 1:
			chosen=ChosenMenuItem.Folders.toString();
			System.out.println(Message.youHaveChosen+chosen);
			break;
			
		case 2:
			chosen=ChosenMenuItem.Lists.toString();
			System.out.println(Message.youHaveChosen+chosen);
			break;
		case 3:
			 Function function = new Function();
		     function.printTestSorting();     
			break;

		default:
			System.out.println(Message.invalidChoice);
			chosen="";
			break;
		}
		return chosen;
	}

}
