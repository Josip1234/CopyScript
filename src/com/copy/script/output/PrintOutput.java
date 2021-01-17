package com.copy.script.output;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

import com.copy.script.folders.Folder;
import com.copy.script.parsing.classes.TvShow;

/**
 * 
 * @author Korisnik
 * @category Output
 * @version 1.0
 * @since 29.12.2020. 11:51
 *
 */
public class PrintOutput {

	/**
	 * @author Korisnik
	 * @since 17.01.2021. 14:05
	 * @param list of tv shows
	 */
public void PrintTvShows(List<TvShow> shows) {
	//String output="";
	for (TvShow tvShow : shows) {
		//output=testPojo.toString();
	     //output=returnCleanJsonArray(output);
		System.out.println(tvShow.toString());
	}
	
}

/**
 * @author Korisnik
 * @since 30.12.2020. 10:22
 * @param folder print source and destination folders as json array
 */
public void printSourceDestinationDirectory(Folder folder) {
	System.out.println(folder.toString());
}
/***
 * @author Korisnik
 * @since 16.1.2021. 11:35
 * @param input - recieve "dirty" string 
 * @return clean json output for print
 * @deprecated
 */
public String returnCleanJsonArray(String input) {
	
	//char equality='=';
	String json="";
	//char replace=' ';
	//char[] characters = new char[] {};
	//characters=input.toCharArray();
	//replace = with :
	/*for (int i = 0; i < characters.length; i++) {
		if(characters[i]==equality) {
			char temp= characters[i];
			temp=':';
			replace=temp;
			json+=replace;
		}else {
			json+=characters[i];
		}
	}
	Pattern p = Pattern.compile("(?<=,:{1})");
     Matcher findString= p.matcher(json);
    */
    //regex replace [\d:](?=:") everything what starting with any digit and after that : is following
	//json=json.replaceAll("[\\d:](?=:\")", "\"identity\":"+0+",");
	return json;
}
/***
 * @author Korisnik
 * @since 16.1.2021. 19:51
 */
public void printBySortingByName(List<TvShow> tvShow) {
	 
		Collections.sort(tvShow, new Comparator<TvShow>() {

		    public int compare(TvShow a, TvShow b) {
		        return a.getShowName().compareTo(b.getShowName());
		    }


		});
		
		for (TvShow tvShow2 : tvShow) {
			System.out.println(tvShow2);
		}
		
}


/***
 * @author Korisnik
 * @since 17.01.2021. 13:00
 */
public void printBySortingByExtension(List<TvShow> tvShow) {
	

		Collections.sort(tvShow, new Comparator<TvShow>() {

		    public int compare(TvShow a, TvShow b) {
		        return a.getFileExtension().compareTo(b.getFileExtension());
		    }


		});
		
		for (TvShow tvShow2 : tvShow) {
			System.out.println(tvShow2);
		}
		
}

/***
 * @author Korisnik
 * @since 17.01.2021. 13:02
 */
public void printBySortingByDate(List<TvShow> tvShow) {

		Collections.sort(tvShow, new Comparator<TvShow>() {

		    public int compare(TvShow a, TvShow b) {
		        return a.getDateOfChange().compareTo(b.getDateOfChange());
		    }


		});
		
		for (TvShow tvShow2 : tvShow) {
			System.out.println(tvShow2);
		}
		
}





}
