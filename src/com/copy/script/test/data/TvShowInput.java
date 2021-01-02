package com.copy.script.test.data;

import com.copy.script.keyboard.input.KeyboardInput;
import com.copy.script.messages.Message;
import com.copy.script.parsing.classes.TvShow;
import com.github.javafaker.Faker;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/***
 * 
 * @author Korisnik
 *@version 1.0
 *@since 28.12.2020. 21:45
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
	 */
	public Integer howManyMapsIntoLists() {
		int howMany=0;
		System.out.println(Message.howManyLists);
		KeyboardInput input = new KeyboardInput();
		howMany=input.insertInteger();
		return howMany;
	}

	/**
	 * @author Korisnik
	 * @since 28.12.2020. 22:00
	 * @return list of test data of testpojo class
	 * @param howMany how many data
	 * @param howManyLists how many maps into the list do you want to have
	 * @param map map of tv shows, integer as key
	 * @return list of testpojo class objects as list, one list will have multiple maps with multiple data
	 */
	public List<TestPojo> addToList(Integer howManyMapsIntoLists,Integer howManyShows,Map<Integer, TvShow> map){
		List<TestPojo> testPojos = new ArrayList<TestPojo>();
		for (int i = 0; i < howManyMapsIntoLists; i++) {
			map=addtvShowsToTheMap(howManyShows);
			testPojos.add(new TestPojo(i, map));
			
		}
		return testPojos;
		
		
	}
	/**
	 * @author Korisnik
	 * @since 29.12.2020. 10:13
	 * @param howMany how many maps will be created
	 * @return map of tv shows
	 */
	public Map<Integer,TvShow> addtvShowsToTheMap(Integer howMany) {
		Map<Integer, TvShow> map = new HashMap<Integer,TvShow>();
		for (int i = 0; i < howMany; i++) {
			TvShow show= generateFakeData();
			map.put(i, show);
		}
		return map;
	}
	/***
	 * @author Korisnik
	 * @since 29.12.2020. 10:14
	 * @return tv show object with generated fake data
	 */
	public TvShow generateFakeData() {
		
		Faker faker = new Faker();
		TvShow show = new TvShow(faker.number().randomDigit(), faker.file().fileName(), faker.internet().url(), faker.lorem().word(), faker.file().extension(), faker.bool().bool());
		return show;
	}
	
}
