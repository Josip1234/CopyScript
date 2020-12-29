package com.copy.script.test.data;

import com.copy.script.keyboard.input.KeyboardInput;
import com.copy.script.messages.Message;
import com.copy.script.parsing.classes.TvShow;
import java.util.Map;
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
	 * @since 28.12.2020. 22:00
	 * @return list of test data of testpojo class
	 * @param howMany how many data
	 * @param map map of tv shows, integer as key
	 * @return list of testpojo class objects as list
	 */
	public List addToList(Integer howMany,Map<Integer, TvShow> map){
		return null;
		
		
	}
	/**
	 * @author Korisnik
	 * @since 29.12.2020. 10:13
	 * @param howMany how many maps will be created
	 * @return map of tv shows
	 */
	public Map addtvShowsToTheMap(Integer howMany) {
		Map<Integer, TvShow> map = new HashMap<Integer,TvShow>();
		return map;
	}
	/***
	 * @author Korisnik
	 * @since 29.12.2020. 10:14
	 * @return tv show object with generated fake data
	 */
	public TvShow generateFakeData() {
		TvShow show = null;
		return show;
	}
	
}
