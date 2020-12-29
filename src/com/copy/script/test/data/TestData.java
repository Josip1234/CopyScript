package com.copy.script.test.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.copy.script.messages.Message;
import com.copy.script.output.PrintOutput;
import com.copy.script.parsing.classes.TvShow;

/***
 * 
 * @author Korisnik
 * @version 1.0
 * @since 28.12.2020. 21:39
 *
 */
public class TestData {

	public static void main(String[] args) {
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

}
