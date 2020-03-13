package com.copy.script.console.input;

import java.util.Scanner;
/***
 * 
 * @author Korisnik
 * @version 1.0.0
 * This class will be used to open input from keyboard,
 * enter input from keyboard, like string, integer etc
 * then closing input after user input from keyboard is 
 * made.
 */
public class KeyboardInput {
	private Scanner scanner;
	
	public KeyboardInput() {
		this.scanner=new Scanner(System.in);
	}
	
	
	/***
	 * @author Korisnik
	 * @return scanner object
	 */
	public Scanner getScanner() {
		return scanner;
	}


    /**
    *  @author Korisnik 
    *  @return input string
    */
	public String stringInput() {
		return getScanner().nextLine();
	}
	
	/***
	 * @author Korisnik
	 * @return integer input
	 */
	public int integerInput() {
		return getScanner().nextInt();
	}
	
	/***
	 * @author Korisnik
	 * set string pointer if integer or other type is used
	 */
	public void setStringPointer() {
		getScanner().nextLine();
	}
	
	/***
	 * @author Korisnik
	 * set int pointer if string or other type is used
	 */
	public void setIntPointer() {
		getScanner().nextInt();
	}
	
	
	/***
	 * @author Korisnik
	 * Close scanner
	 */
	void closeInput(){
		getScanner().close();
	}

}
/***
 * 
 * "resource leak" implies that some system resource (usually memory) is being lost or wasted needlessly. 
 * Usually this will impact you when you start getting OutOfMemoryErrors 
 * thrown during the normal operation of your program.
 * As others have said, you need to call 'close' on IO classes.
 * This ensures that your Scanner is always closed, guaranteeing proper resource cleanup
 * 
 * 
 *
try {
	key = scanner.nextInt();
} finally {
	scanner.close();
}*/
