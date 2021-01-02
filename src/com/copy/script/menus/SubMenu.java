package com.copy.script.menus;



import com.copy.script.folders.SourceDestination;
import com.copy.script.keyboard.input.KeyboardInput;
import com.copy.script.messages.Message;

/**
 * 
 * @author Korisnik
 * @category Menu
 * @version 1.0
 * @since 31.12.2020. 13:18
 */
public class SubMenu {
/**
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


}
