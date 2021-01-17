package com.copy.script.algorithms;

import java.util.Date;
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
