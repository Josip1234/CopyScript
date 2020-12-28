package com.copy.script.keyboard.input;

import java.util.Scanner;

/**
 * 
 * @author Korisnik
 * @category Input
 * @version 1.0
 * @since 28.12.2020. 14:08
 * 
 */
public class KeyboardInput {
public Scanner scanner;
public String lang="";

/**
 * @author Korisnik
 * @since 28.12.2020. 14:11
 * @return inputed string from the user
 */
public String insertString() {
	scanner= new Scanner(System.in);
	lang=scanner.nextLine();
	scanner.close();
	return lang;
}


}
