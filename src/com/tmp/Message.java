package com.tmp;

public class Message {

	/***
	 * class for messages, for setting new returning message, or to choose
	 * default message.
	 */
	public static final String chooseSource="Choose source directory";
	public static final String chooseDestination="Choose destination directory";
	private String returningMessage;
	
	/***
	 * 
	 * @param returningMessage which message you want to return
	 */
	public Message(String returningMessage) {
		this.returningMessage=returningMessage;
	}

	/***
	 * 
	 * @return some message
	 */
	public String getReturningMessage() {
		return returningMessage;
	}

	/***
	 * 
	 * @param returningMessage set new mwssage to return
	 */
	public void setReturningMessage(String returningMessage) {
		this.returningMessage = returningMessage;
	}
	
	
	
	
}
