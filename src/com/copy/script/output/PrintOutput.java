package com.copy.script.output;

import java.util.List;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

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
	 * @since 10.01.2021. 10:34
	 * @param testPojos recieve list of test pojo vlass
	 */
public void PrintTestPojoListAndContentOfTheList(List<TestPojo> testPojos) {
	//String output="";
	for (TestPojo testPojo : testPojos) {
		//output=testPojo.toString();
	     //output=returnCleanJsonArray(output);
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
/***
 * @author Korisnik
 * @since 10.1.2021. 10:35
 * @param input - recieve "dirty" string 
 * @return clean json output for print
 */
public String returnCleanJsonArray(String input) {
	
	//char equality='=';
	String json="";
	//char replace=' ';
	//char[] characters = new char[] {};
	//characters=input.toCharArray();
	//replace = with :
	/*for (int i = 0; i < characters.length; i++) {
		if(characters[i]==equality) {
			char temp= characters[i];
			temp=':';
			replace=temp;
			json+=replace;
		}else {
			json+=characters[i];
		}
	}
	Pattern p = Pattern.compile("(?<=,:{1})");
     Matcher findString= p.matcher(json);
    */
    //regex replace [\d:](?=:") everything what starting with any digit and after that : is following
	//json=json.replaceAll("[\\d:](?=:\")", "\"identity\":"+0+",");
	return json;
}

}
