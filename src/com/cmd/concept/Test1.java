package com.cmd.concept;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test1 {
// u folderu u koji se premiješta je potrebno isto ime i vrsta datoteke potrebno je uzei ime file i extenziju te
	//u drugoj mapi napraviti prvo istu datoteku
	// ako file ne postoji u drugoj mapi potrebno je napraviti taj isti file 
	//pri tome treba provjeriti dali postoji ako postoji ne pravi senovi file
	//pojavljuje se warning
	//potrebna je lista fileova sa extenzijama!!
	public static void main(String[] args) throws IOException { 
		  Path temp = Files.move 
			        (Paths.get("C:\\Users\\Korisnik\\Desktop\\test1\\The Simpsons - 2x03 - Treehouse of Horror.MKV"),Paths.get("C:\\Users\\Korisnik\\Desktop\\test2\\The Simpsons - 2x03 - Treehouse of Horror.MKV"),StandardCopyOption.REPLACE_EXISTING); 
			  
			        if(temp != null) 
			        { 
			            System.out.println("File renamed and moved successfully"); 
			        } 
			        else
			        { 
			            System.out.println("Failed to move the file"); 
			        } 

	}

}
