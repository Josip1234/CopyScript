package com.copy.script.main;

import com.copy.script.activation.main.functions.Function;

/**
 * 
 * @author Korisnik
 * @category MainCMDApp
 * @version 1.0
 * @since 28.12.2020. 13:46
 */
public class Main {
	
	public static void main(String[] args) {
		/***
		 * First activate menu for languages.
		 */
	    Function function = new Function();
	    function.activateLanguageMenu();
	    /***
	     * Second activate main menu
	     */
	    function.activateMainMenu();
	

	}

}
