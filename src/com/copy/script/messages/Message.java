package com.copy.script.messages;
/**
 * Messages for communication between user and user interface.
 * @author Korisnik
 * 
 * @version 1.0
 * @since 28.12.2020. 13:26
 */
public class Message {
	/**
	 * @author Korisnik
	 * 
	 * @since 28.12.2020. 13:28
	 * 
	 */
	public static final String openingApplication="Openning application...";
	/**
	 * @author Korisnik
	 * 
	 * @since 28.12.2020. 13:40
	 */
	public static final String applicationIsOpen ="Application is open!";
	/**
	 * @author Korisnik
	 *
	 * @since 28.12.2020. 14:04
	 */
	public static final String chooseLanguage="Choose language of the application:";
	/**
	 * @author Korisnik
	 * 
	 * @since 28.12.2020. 14:15
	 */
	public static final String youHaveChosen="You have chosen:";
	/**
	 * @author Korisnik
	 * 
	 * @since 28.12.2020. 14:06
	 */
	public static final String invalidChoice="Invalid choice";
	/**
	 * @author Korisnik
	 * 
	 * @since 28.12.2020. 21:42
	 */
	public static final String howManyTvShows="How many tv shows?";
	
	/**
	 * @author Korisnik
	 * 
	 * @since 29.12.2020. 11:03
	 */
	public static final String howManyLists="How many maps into the list do you want to have?";
	/**
	 * @author Korisnik
	 * 
	 * @since 31.12.2020. 13:20
	 */
	public static final String chooseSourceDirectory="1.Choose source directory:";
	/**
	 * @author Korisnik
	 * 
	 * @since 31.12.2020. 13:21
	 */
	public static final String chooseDestinationDirectory="2.Choose destinationDirectory:";
	/***
	 * @author Korisnik
	 * 
	 * @since 31.12.2020. 13:30
	 */
	public static final String chooseSomethingFromMenu="Choose from the menu:";
	/***
	 * @author Korisnik
	 * 
	 * @since 31.12.2020. 13:37
	 *
	 */
    public static final String enterNumber="Enter one number:";
    /**
     * @author Korisnik
     * 
     * @since 1.1.2021. 14:01
     */
    public static final String listFiles = "Do you want to list files?";
    /**
     * @author Korisnik
     *
     * @since 1.1.2021. 14:30
     */
    public static final String insertBoolean="Only true or false input";
    /**
     * @author Korisnik
     * 
     *  @since 2.1.2020. 12:24
     */
    public static final String closingLanguageMenu = "Closing language menu...";
    /**
     * @author Korisnik
     * 
     * @since 2.1.2021. 12:26
     */
    public static final String with="With";
    /***
     * @author Korisnik
     * 
     * @since 2.1.2021. 12:46
     */
    public static final String listOfFiles="2. List files";
    
    /***
     * @author Korisnik
     * 
     * @since 2.1.2021. 12:47
     */
    public static final String chooseFolder="1. Choose folders";
    /***
     * @author Korisnik
     * 
     * @since 3.1.2021. 15:48
     */
    public static final String spacing=" ";
    /***
     * @author Korisnik
     * 
     * @since 16.01.2021. 12:47
     */
    public static final String chooseAlgorithms=OneWordMessages.Choose+spacing+OneWordMessages.Algorithms.toString().toLowerCase();
    /***
     * @author Korisnik
     * 
     * @since 16.01.2021. 11:50
     */
    public static final String sortingChoice="1."+OneWordMessages.Sorting.toString();
    /***
     * @author Korisnik
     *
     * @since 16.01.2021. 11:52
     */
    public static final String searchingChoice="2."+OneWordMessages.Searching.toString();
    /***
     * @author Korisnik
     * 
     * @since 16.01.2021. 11:58
     */
    public static final String searchByName="1."+OneWordMessages.Search.toString()+spacing+OneWordMessages.files.toString()+spacing+OneWordMessages.by.toString()+spacing+OneWordMessages.name.toString();
    /***
     * @author Korisnik
     * 
     * @since 16.01.2021 11:59
     */
    public static final String searchByDate="2."+OneWordMessages.Search.toString()+spacing+OneWordMessages.files.toString()+spacing+OneWordMessages.by.toString()+spacing+OneWordMessages.date.toString();
    /***
     * @author Korisnik
     * 
     * @since 16.01.2021. 12:01
     */
    public static final String searchByExtension="3."+OneWordMessages.Search.toString()+spacing+OneWordMessages.files.toString()+spacing+OneWordMessages.by.toString()+spacing+OneWordMessages.extension.toString();
    
    /***
     * @author Korisnik
     * 
     * @since 16.01.2021. 12:23
     */
    public static final String sortByName="1."+OneWordMessages.Sort.toString()+spacing+OneWordMessages.files.toString()+spacing+OneWordMessages.by.toString()+spacing+OneWordMessages.name.toString();
    /***
     * @author Korisnik
     * 
     * @since 16.01.2021 12:23
     */
    public static final String sortByDate="2."+OneWordMessages.Sort.toString()+spacing+OneWordMessages.files.toString()+spacing+OneWordMessages.by.toString()+spacing+OneWordMessages.date.toString();
    /***
     * @author Korisnik
     * 
     * @since 16.01.2021. 12:24
     */
    public static final String sortByExtension="3."+OneWordMessages.Sort.toString()+spacing+OneWordMessages.files.toString()+spacing+OneWordMessages.by.toString()+spacing+OneWordMessages.extension.toString();
    /***
     * @author Korisnik
     * 
     * @since 16.01.2021. 12:38
     */
    public static final String defaultValue="3."+OneWordMessages.defaultValue;
    /***
     * @author Korisnik
     * 
     * @since 16.01.2021. 13:21
     */
    public static final String defaultListing="List will be default listed like in os.";
    /***
     * @author Korisnik
     * 
     * @since 16.01.2021. 17:41
     */
    public static final String defaultDateTimeFormat="dd.MM.yyyy. HH:MM:s";
    /***
     * @author Korisnik
     * 
     * @since 17.01.2021. 18:31
     */
    public static final String testData="3. Activate"+spacing+OneWordMessages.Test.toString()+OneWordMessages.data.toString();
    /***
     * @author Korisnik
     * 
     * @since 08.03.2021. 20:33
     */
    public static final String enterWordToSearch="Enter what do you want to search:";
    /***
     * @author Korisnik
     * 
     * @since 08.03.2021. 20:43
     */
    public static final String enterDay="Enter day:";
    /***
     * @author Korisnik
     * 
     * @since 08.03.2021. 20:43
     */
    public static final String enterMonth = "Enter month";
    /***
     * @author Korisnik
     * 
     * @since 08.03.2021. 20:43
     */
    public static final String enterYear = "Enter year:";
    /***
     * @author Korisnik
     * @since 09.03.2021. 21:12
     * 
     */
    public static final String enterExtension="Enter what extension do you want to search:";
    
    
}
