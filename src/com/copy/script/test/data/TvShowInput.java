package com.copy.script.test.data;

import com.copy.script.keyboard.input.KeyboardInput;
import com.copy.script.messages.Message;
import com.copy.script.parsing.classes.TvShow;
import com.github.javafaker.Faker;

import java.util.Map;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/***
 * 
 * @author Korisnik
 *@version 2.0
 *@since 10.01.2021. 09:00
 * */
public class TvShowInput {
   /***
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
	 * @since 28.12.2020. 11:04
	 * @return number of how much maps into the list do you want to have
	 * @deprecated
	 */
	/*public Integer howManyMapsIntoLists() {
		int howMany=0;
		System.out.println(Message.howManyLists);
		KeyboardInput input = new KeyboardInput();
		howMany=input.insertInteger();
		return howMany;
	}*/
	

	/**
	 * @author Korisnik
	 * @since 28.12.2020. 22:00
	 * @return list of test data of testpojo class
	 * @param map map of tv shows, integer as key
	 * @return list of testpojo class objects as list, one list will have multiple maps with multiple data
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
	/**
	 * @author Korisnik
	 * @since 29.12.2020. 10:13
	 * @param howMany how many maps will be created
	 * @return map of tv shows
	 * @deprecated
	 */
/*	public Map<Integer,TvShow> addtvShowsToTheMap(Integer howMany) {
		Map<Integer, TvShow> map = new HashMap<Integer,TvShow>();
		for (int i = 0; i < howMany; i++) {
			TvShow show= generateFakeData();
			map.put(i, show);
		}
		return map;
	}*/
	/***
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
