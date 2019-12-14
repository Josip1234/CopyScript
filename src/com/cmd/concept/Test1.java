package com.cmd.concept;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.acl.Group;



import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.application.Application;  
public class Test1 extends Application {
// u folderu u koji se premiješta je potrebno isto ime i vrsta datoteke potrebno je uzei ime file i extenziju te
	//u drugoj mapi napraviti prvo istu datoteku
	// ako file ne postoji u drugoj mapi potrebno je napraviti taj isti file 
	//pri tome treba provjeriti dali postoji ako postoji ne pravi senovi file
	//pojavljuje se warning
	//potrebna je lista fileova sa extenzijama!!
	public static void main(String[] args)  throws IOException { 
		Application.launch(args);
		/*  Path temp = Files.move 
			        (Paths.get("C:\\Users\\Korisnik\\Desktop\\test1\\The Simpsons - 2x03 - Treehouse of Horror.MKV"),Paths.get("C:\\Users\\Korisnik\\Desktop\\test2\\The Simpsons - 2x03 - Treehouse of Horror.MKV"),StandardCopyOption.REPLACE_EXISTING); 
			  
			        if(temp != null) 
			        { 
			            System.out.println("File renamed and moved successfully"); 
			        } 
			        else
			        { 
			            System.out.println("Failed to move the file"); 
			        } 
			   */
		//File myFile = new File("C:\\Users\\Korisnik\\Desktop\\test2\\The Simpsons - 2x03 - Treehouse of Horror.MKV");
	/*	 try
	        { 
	            // Command to create an external process 
	            String command = "C:\\Users\\Korisnik\\Desktop\\test2\\The Simpsons - 2x03 - Treehouse of Horror.MKV"; 
	  
	            // Running the above command 
	            Runtime run  = Runtime.getRuntime(); 
	            Process proc = run.exec(command); 
	        } 
	  
	        catch (IOException e) 
	        { 
	            e.printStackTrace(); 
	        } 
	        */
		
	
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		  StackPane root = new StackPane();

	        MediaPlayer player = new MediaPlayer( new Media(getClass().getResource("C:\\Users\\Korisnik\\Desktop\\serije\\Seinfeld.S02E08.WEBRip.x264-FGT.mp4").toExternalForm()));
	        MediaView mediaView = new MediaView(player);

	        root.getChildren().add( mediaView);

	        Scene scene = new Scene(root, 1024, 768);

	        primaryStage.setScene(scene);
	        primaryStage.show();


	        player.play();
		
	}
	

}
