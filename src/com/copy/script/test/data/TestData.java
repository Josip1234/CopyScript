package com.copy.script.test.data;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.copy.script.activation.main.functions.Function;
import com.copy.script.algorithms.Sort;
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

	public static void main(String[] args) throws ParseException {
     Function function = new Function();
     function.printTestSorting();
		
	}

}
