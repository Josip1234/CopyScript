package com.copy.script.output;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

import com.copy.script.folders.Folder;
import com.copy.script.parsing.classes.TvShow;

/**
 * Class for printing input from user
 * @author Korisnik
 * @category Output
 * @version 1.0
 * @since 29.12.2020. 11:51
 *
 */
public class PrintOutput {

	/**
	 * Print tv shows
	 * @author Korisnik
	 * @since 17.01.2021. 14:05
	 * @param list of tv shows
	 */
public void PrintTvShows(List<TvShow> shows) {
	
	for (TvShow tvShow : shows) {

		System.out.println(tvShow.toString());
	}
	
}

/**
 * Print source or destination link from user input
 * @author Korisnik
 * @since 30.12.2020. 10:22
 * @param folder print source and destination folders as json array
 */
public void printSourceDestinationDirectory(Folder folder) {
	System.out.println(folder.toString());
}


/***
 * Print list of tv shows sorted by name
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
 * Print list of tv shows sorted by extension
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
 * Print list of tv shows sorted by date
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
