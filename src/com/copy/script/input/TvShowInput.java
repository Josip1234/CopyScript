package com.copy.script.input;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.copy.script.keyboard.input.KeyboardInput;
import com.copy.script.messages.Message;
import com.copy.script.parsing.classes.TvShow;
import com.github.javafaker.Faker;

/***
 * 
 * @author Korisnik
 *@version 2.0
 *@since 10.01.2021. 09:00
 * */
public class TvShowInput {
   /***
    * How many tv shows do you want to have in a list
    * @author Korisnik
    * @since 28.12.2020. 21:46
    * @return number of inputs to generate
    */
	public Integer howManyInput() {
		int howMany=0;
		System.out.println(Message.howManyTvShows);
		KeyboardInput input = new KeyboardInput();
		howMany=input.insertInteger();
		return howMany;
	}
	
	

	/**
	 * @author Korisnik
	 * @since 18.01.2021. 18:54
	 * @return list of test data of tvshow class
	 * @param howManyShows how many shows do you want
	 * @return list of tvshows
	 * 
	 */
	public List<TvShow> addToList(Integer howManyShows){
		List<TvShow> tvShow = new ArrayList<TvShow>();
		for (int i = 0; i < howManyShows; i++) {
		    TvShow show = generateFakeData();
		    tvShow.add(show);
			
		}
		return tvShow;
		
	
	}

	/***
	 * Function for generating fake data for the single object
	 * @author Korisnik
	 * @since 10.01.2022. 09:03
	 * @return tv show object with generated fake data
	 */
	public TvShow generateFakeData() {
		Calendar from = Calendar.getInstance();
		from.add(Calendar.YEAR, -1);
	    Calendar to = Calendar.getInstance();
	    Date from2 = from.getTime();
	    Date to2=to.getTime();
	    Faker faker = new Faker();
		TvShow show = new TvShow(faker.number().randomDigit(), faker.file().fileName(), faker.internet().url(), faker.lorem().word(), faker.file().extension(), faker.bool().bool(),faker.date().between(from2, to2));
		return show;
	}
	
}
