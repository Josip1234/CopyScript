package com.copy.script.algorithms;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.copy.script.parsing.classes.TvShow;
import com.copy.script.test.data.TestPojo;

/***
 * 
 * @author Korisnik
 * @category Sorting 
 * @since 16.01.2021. 16:19
 * @version 1.0
 *
 */
public interface SortingInterface {
	/***
	 * @author Korisnik
	 * @category Sorting
	 * @since 16.01.2021. 16:22
	 * @param date1 first date
	 * @param date2 date to compare
	 * @return true if date1 is smaller than date 2
	 */
boolean sortDate(Date date1, Date date2);

}
