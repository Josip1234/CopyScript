package com.copy.script.activation.main.functions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.copy.script.files.FileFunctions;
import com.copy.script.folders.Folder;
import com.copy.script.menus.ChosenMenuItem;
import com.copy.script.menus.LanguageMenu;
import com.copy.script.menus.MainMenu;
import com.copy.script.menus.SubMenu;
import com.copy.script.messages.Message;
import com.copy.script.output.PrintOutput;
import com.copy.script.parsing.classes.TvShow;
import com.copy.script.simulation.loops.SimulationLoop;
import com.copy.script.test.data.TestPojo;
import com.copy.script.test.data.TvShowInput;

/***
 * 
 * @author Korisnik
 * @category MainFunctions
 * @version 1.0
 * @since 30.12.2020. 10:24
 */
public class Function {

/**
 * @author Korisnik
 * @since 30.12.2020. 10:26	
 */
public void activateLanguageMenu() {
	int numberOfTimes = 100;
	String chosenLaguage="";
	SimulationLoop loop = new SimulationLoop();
	loop.simulateOpenningDesktopApplication(numberOfTimes);
	LanguageMenu languageMenu = new LanguageMenu();
	chosenLaguage=languageMenu.chooseLanguage();
	System.out.println(Message.closingLanguageMenu+Message.with+Message.spacing+chosenLaguage);
}

/**
 * @author Korisnik
 * @since 30.12.2020. 10:27
 */
public void activateSetSourceDestinationFolders() {
	Folder folder = new Folder();
	PrintOutput output = new PrintOutput();
	folder.setSourceDirectory("mojdirektorij");
	folder.setDestinationDirectory("mojdrugidirektorij");
	output.printSourceDestinationDirectory(folder);
}

/**
 * @author Korisnik
 * @since unknown
 */

public void activateTestData() {
	Integer howMany=0;
	Integer howManyMaps=0;
	Map<Integer, TvShow> map = new HashMap<Integer,TvShow>();
	List<TestPojo> testPojos = new ArrayList<TestPojo>();
	TvShowInput input = new TvShowInput();
	howMany=input.howManyInput();
	System.out.println(Message.youHaveChosen + howMany.toString()); 
	howManyMaps = input.howManyMapsIntoLists();
	System.out.println(Message.youHaveChosen+howManyMaps.toString());
	testPojos=input.addToList(howManyMaps, howMany, map);
	PrintOutput output = new PrintOutput();
	output.PrintTestPojoListAndContentOfTheList(testPojos);
}
/**
 * @author Korisnik
 * @since 31.12.2020. 13:46
 */
public void chooseFromSubMenu() {
	   SubMenu subMenu = new SubMenu();
	   subMenu.chooseFromSubMenu();
}
/***
 * @author Korisnik
 * @since 16.01.2021. 12:28
 */
public void activateListFiles() {
	FileFunctions fileFunctions = new FileFunctions();
	fileFunctions.doYouWantToListFilesFromFolders();
}
/**
 * @author Korisnik
 * @since 2.1.2021. 12:55
 */
public void activateMainMenu() {
	String chosen="";
	MainMenu mainmenu=new MainMenu();
	chosen=mainmenu.chooseFromMainMenu();
	if(chosen.contentEquals(ChosenMenuItem.Folders.toString())) {
		chooseFromSubMenu();
		
	}else if(chosen.contentEquals(ChosenMenuItem.Lists.toString())) {
		activateListFiles();
	}else {
		System.out.println(Message.invalidChoice);
	}
}
/***
 *@author Korisnik
 *@since 3.1.2021.15:51 
 */
public void menuSequence() {
	/***
	 * First activate menu for languages.
	 */
   
    activateLanguageMenu();
    /***
     * Second activate main menu
     */
    activateMainMenu();
}
	
}
