package com.copy.script.menus;



import com.copy.script.folders.SourceDestination;
import com.copy.script.keyboard.input.KeyboardInput;
import com.copy.script.messages.Message;
import com.copy.script.messages.OneWordMessages;

/**
 * 
 * @author Korisnik
 * 
 * @version 1.0
 * @since 31.12.2020. 13:18
 */
public class SubMenu {
/**
 * Choose source and destination directory
 * @author Korisnik
 * @since 31.12.2020. 13:24
 * @return chosen submenu items
 */
public String chooseFromSubMenu() {
	String chosen="";
	int key=0;
    System.out.println(Message.chooseSomethingFromMenu);
    System.out.println(Message.chooseSourceDirectory);
    System.out.println(Message.chooseDestinationDirectory);
    KeyboardInput input = new KeyboardInput();
    key=input.insertInteger();
    switch (key) {
	case 1:
		System.out.println(Message.youHaveChosen+SourceDestination.source);
		chosen=SourceDestination.source.toString();
		break;
    
	case 2:
		System.out.println(Message.youHaveChosen+SourceDestination.destination);
		chosen=SourceDestination.destination.toString();
		break;
		
	default:
		System.out.println(Message.invalidChoice);
		chosen="";
		break;
	}
	return chosen;
}
/***
 * Choose algorithms for listing list of files of some folders.
 * @author Korisnik
 * @since 09.03.2021. 21:12
 * @return chosen submenu items
 * @return chosen item
 */
public String chooseHowToListFiles() {
	KeyboardInput input = new KeyboardInput();
	String chosen="";
	int key=0;
	System.out.println(Message.chooseAlgorithms);
	System.out.println(Message.sortingChoice);
	System.out.println(Message.searchingChoice);
	System.out.println(Message.enterNumber);
	key=input.insertInteger();
	switch (key) {
	case 1:
		String choice2="";
		int key2=0;
		System.out.println(Message.chooseSomethingFromMenu);
		System.out.println(Message.chooseAlgorithms);
		System.out.println(Message.sortByName);
		System.out.println(Message.sortByDate);
		System.out.println(Message.sortByExtension);
		System.out.println(Message.enterNumber);
		key2=input.insertInteger();
		switch (key2) {
		case 1:
			choice2=OneWordMessages.Sorted.toString();
			chosen=choice2;
			System.out.println(chosen);
			break;
		case 2:
			choice2=OneWordMessages.Sorted.toString();
			chosen=choice2;
			System.out.println(chosen);
			break;
		
		case 3:
			choice2=OneWordMessages.Sorted.toString();
			chosen=choice2;
			System.out.println(chosen);
			break;
		default:
			System.out.println(Message.invalidChoice);
			break;
		}
		
		break;
	
	case 2:
		String choice3="";
		int key3=0;
		System.out.println(Message.chooseSomethingFromMenu);
		System.out.println(Message.chooseAlgorithms);
		System.out.println(Message.searchByName);
		System.out.println(Message.searchByDate);
		System.out.println(Message.searchByExtension);
		System.out.println(Message.enterNumber);
		key3=input.insertInteger();
		switch (key3) {
		case 1:
			String word="";
			choice3=OneWordMessages.Found.toString();
			chosen=choice3;
			System.out.println(Message.enterWordToSearch);
			KeyboardInput input2 = new KeyboardInput();
			word=input2.insertString();
			System.out.println(Message.youHaveChosen+" "+word);
			break;
		case 2:
			int day=0,month=0,year=0;
			System.out.println(Message.enterDay);
			KeyboardInput input3 = new KeyboardInput();
			day=input3.insertInteger();
			System.out.println(Message.enterMonth);
			month=input3.insertInteger();
			System.out.println(Message.enterYear);
			year=input3.insertInteger();
			String dateToSearch=String.valueOf(day)+"."+String.valueOf(month)+"."+String.valueOf(year);
			choice3=OneWordMessages.Found.toString();
			chosen=choice3;
			System.out.println(Message.youHaveChosen+" "+ dateToSearch);
			break;
		case 3:
			String extension=".";
			System.out.println(Message.enterExtension);
			KeyboardInput input4 = new KeyboardInput();
			extension+=input4.insertString();
			choice3=OneWordMessages.Found.toString();
			chosen=choice3;
			System.out.println(Message.youHaveChosen+" "+extension);
			break;
		default:
			System.out.println(Message.invalidChoice);
			break;
		}
		
		break;

	default:
		chosen=Message.defaultValue;
		System.out.println(Message.defaultListing);
		break;
	}
	
	
	return chosen;
}

}
