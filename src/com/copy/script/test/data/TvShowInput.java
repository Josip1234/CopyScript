package com.copy.script.test.data;

import com.copy.script.keyboard.input.KeyboardInput;
import com.copy.script.messages.Message;

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
}
