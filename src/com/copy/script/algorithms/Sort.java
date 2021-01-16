package com.copy.script.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.copy.script.parsing.classes.TvShow;
import com.copy.script.test.data.TestPojo;
/***
 * 
 * @author Korisnik
 * @category Sorting
 * @since 16.01.2021. 16:30
 * @version 1.0
 *
 */
public class Sort implements SortingInterface {
    
	public boolean isSmaller=false;
	
	@Override
	public boolean sortDate(Date date1, Date date2) {
		if (date1.before(date2)) {
		    isSmaller=true;
		}
		return isSmaller;
	}




	

}
