package com.copy.script.menus;

import com.copy.script.keyboard.input.KeyboardInput;
import com.copy.script.languages.Language;
import com.copy.script.messages.Message;

/**
 * 
 * @author Korisnik
 * 
 * @version 1.0
 * @since 28.12.2020. 14:00
 */
public class LanguageMenu {
/**
 * Function for choosing language from the user input from keyboard
 * @author Korisnik
 * @since 16.01.2021. 13:14
 * @return chosen language from user input
 */
public String chooseLanguage() {
	String language="";
	System.out.println(Message.chooseLanguage);
	System.out.println(Language.DE+","+Language.EN+","+Language.HR);
	KeyboardInput input=new KeyboardInput();
	language=input.insertString().toUpperCase();
	if(isCorrectInput(language)==true) {
		System.out.println(Message.youHaveChosen+language);
	}else {
		System.out.println(Message.invalidChoice);
		System.exit(0);
		
	}
	return language;
}
/**
 * Function for validating user input of the language
 * @author Korisnik
 * @since 28.12.2020. 14:19
 * @param input string value
 * @return true if input is correct
 */
public boolean isCorrectInput(String input) {
	boolean yesOrNo=false;
	if(input.equals(Language.EN.toString())) {
		yesOrNo=true;
	}else if(input.equals(Language.HR.toString())) {
		yesOrNo=true;
	}else if(input.equals(Language.DE.toString())) {
		yesOrNo=true;
	}else {
		yesOrNo=false;
	}
	
	return yesOrNo;
}

}
