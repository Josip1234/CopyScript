package com.copy.script.output;

import java.util.List;

import com.copy.script.folders.Folder;
import com.copy.script.test.data.TestPojo;

/**
 * 
 * @author Korisnik
 * @category Output
 * @version 1.0
 * @since 29.12.2020. 11:51
 *
 */
public class PrintOutput {

	/**
	 * @author Korisnik
	 * @since 29.12.2020. 11:52
	 * @param testPojos recieve list of test pojo vlass
	 */
public void PrintTestPojoListAndContentOfTheList(List<TestPojo> testPojos) {
	for (TestPojo testPojo : testPojos) {
		System.out.println(testPojo.toString());
	}
}

/**
 * @author Korisnik
 * @since 30.12.2020. 10:22
 * @param folder print source and destination folders as json array
 */
public void printSourceDestinationDirectory(Folder folder) {
	System.out.println(folder.toString());
}



}
