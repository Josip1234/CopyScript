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
public Integer tv=0;

/**
 * @author Korisnik
 * @since 28.12.2020. 14:11
 * @return inputed string from the user
 */
public String insertString() {
	scanner= new Scanner(System.in);
	lang=scanner.nextLine();
	
	return lang;
}
/**
 * @author Korisnik
 * @since 28.12.2020. 21:48
 * @return inputed integer from the user
 */
public Integer insertInteger() {
	scanner=new Scanner(System.in);
	tv=scanner.nextInt();
	
	return tv;
}
/**
 * @author Korisnik
 * @since 29.12.2020. 11:26
 * @param scanner which scanner do you want to close
 */
public void closeInput(Scanner scanner) {
	scanner.close();
}

}
