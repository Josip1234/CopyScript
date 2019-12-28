package com.cmd.concept.pojo;

import java.util.Scanner;

public class Input {
private Scanner scanner;
private boolean open;
private String value;

public Input() {
	this.scanner=new Scanner(System.in);
	this.open=false;
	this.value="";
}

public Scanner getScanner() {
	return scanner;
}

public boolean isOpen() {
	return open;
}

public String getValue() {
	return value;
}

public void setOpen(boolean open) {
	this.open = open;
}

public void setValue(String value) {
	this.value = value;
}

public boolean nextBoolean() {
	return this.scanner.nextBoolean();
}
public String nextLine() {
	return this.scanner.nextLine();
}



}
