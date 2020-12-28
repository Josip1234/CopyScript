package com.copy.script.test.data;

import com.copy.script.messages.Message;

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
		TvShowInput input = new TvShowInput();
		howMany=input.howManyInput();
		System.out.println(Message.youHaveChosen + howMany.toString()); 

	}

}
