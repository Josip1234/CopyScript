package com.copy.script.activation.main.functions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.copy.script.files.FileFunctions;
import com.copy.script.folders.Folder;
import com.copy.script.input.TvShowInput;
import com.copy.script.menus.ChosenMenuItem;
import com.copy.script.menus.LanguageMenu;
import com.copy.script.menus.MainMenu;
import com.copy.script.menus.SubMenu;
import com.copy.script.messages.Message;
import com.copy.script.messages.OneWordMessages;
import com.copy.script.output.PrintOutput;
import com.copy.script.parsing.classes.TvShow;
import com.copy.script.simulation.loops.SimulationLoop;

/***
 * 
 * @author Korisnik
 * @version 1.0
 * @since 30.12.2020. 10:24
 */
public class Function {

/**
 * Activate language menu, before menu, simulate opening application.
 * @author Korisnik
 * @since 30.12.2020. 10:26	
 * 
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
 * Set new source and destination folders.
 * @author Korisnik
 * @since 30.12.2020. 10:27
 * 
 */
public void activateSetSourceDestinationFolders() {
	Folder folder = new Folder();
	PrintOutput output = new PrintOutput();
	folder.setSourceDirectory("mojdirektorij");
	folder.setDestinationDirectory("mojdrugidirektorij");
	output.printSourceDestinationDirectory(folder);
}

/**
 * How many test data you want to have to test algorithms of the application
 * @author Korisnik
 * @since 17.01.2021. 13:40
 * 
 */

public List<TvShow> activateTestData() {
	Integer howMany=0;
	List<TvShow> shows = new ArrayList<TvShow>();
	TvShowInput input = new TvShowInput();
	howMany=input.howManyInput();
	System.out.println(Message.youHaveChosen + howMany.toString()); 
	shows=input.addToList(howMany);
	PrintOutput output = new PrintOutput();
	output.PrintTvShows(shows);
	return shows;
}
/**
 * Activate submenu.
 * @author Korisnik
 * @since 31.12.2020. 13:46
 */
public void chooseFromSubMenu() {
	   SubMenu subMenu = new SubMenu();
	   subMenu.chooseFromSubMenu();
}
/***
 * If you want to list files from directory, activate this function.
 * @author Korisnik
 * @since 16.01.2021. 12:28
 */
public void activateListFiles() {
	FileFunctions fileFunctions = new FileFunctions();
	fileFunctions.doYouWantToListFilesFromFolders();
}
/**
 * Activate main menu.
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
		System.exit(0);
	}
}
/***
 * Menu sequence for activating main menu and language menu.
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

/***
 * Function for date formating
 * @author Korisnik
 *
 * @since 16.01.2021. 18:08
 */
public void formatDate() {
	SimpleDateFormat format = new SimpleDateFormat(Message.defaultDateTimeFormat);
	//String dateString = format.format( new Date()   );
	
	try {
		Date date = format.parse ( "16.01.2021. 18:04:16" );
		String dt1=format.format(date);
	    System.out.println(date);
	    System.out.println(dt1);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}   
	
}
/***
 * Test class for printing list of test data of tv shows sorted by date, name and date.
 * @author Korisnik
 * @since 16.01.2021. 19:54
 */
public void printTestSorting() {
	List<TvShow> shows = new ArrayList<TvShow>();
    PrintOutput output = new PrintOutput();
    shows=activateTestData();
    System.out.println(OneWordMessages.Sorted);
    output.printBySortingByDate(shows);
    System.out.println(OneWordMessages.Sorted);
    output.printBySortingByExtension(shows);
    System.out.println(OneWordMessages.Sorted);
    output.printBySortingByName(shows);
    
 
}
	
}
