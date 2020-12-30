package com.copy.script.main;

import com.copy.script.activation.main.functions.Function;
import com.copy.script.folders.Folder;
import com.copy.script.menus.LanguageMenu;
import com.copy.script.output.PrintOutput;
import com.copy.script.simulation.loops.SimulationLoop;

/**
 * 
 * @author Korisnik
 * @category MainCMDApp
 * @version 1.0
 * @since 28.12.2020. 13:46
 */
public class Main {
	
	public static void main(String[] args) {
	    Function function = new Function();
	    function.activateLanguageMenu();
	    function.activateSetSourceDestinationFolders();
	
		

	}

}
