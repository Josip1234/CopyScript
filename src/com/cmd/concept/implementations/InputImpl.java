package com.cmd.concept.implementations;

import com.cmd.concept.interfaces.InputOperations;
import com.cmd.concept.messages.Message;
import com.cmd.concept.pojo.Input;
import com.cmd.concept.pojo.SourceDestination;

public class InputImpl extends Message implements InputOperations {

	@Override
	public SourceDestination enterSourceAndDestinationDirectory() {
		System.out.println(getChooseSourceDirectory());
		Input input=new Input();
		SourceDestination sourceDestination=new SourceDestination();
		sourceDestination.setSourceDirectory(input.nextLine());
		setChosenSource(sourceDestination.getSourceDirectory());
		System.out.println(getChosenSource());
		System.out.println(getChooseDestinationDirectoryMessage());
		sourceDestination.setDestinationDirectory(input.nextLine());
		setChosenDestinationDirectoryMessage(sourceDestination.getDestinationDirectory());
		System.out.println(getChosenDestinationDirectoryMessage());
		return sourceDestination;
	}

	@Override
	public String enterFileToCopyOrMove() {
		Input input=new Input();
		System.out.println(getChooseFileMessage());
		String file=input.nextLine();
		return file;
	}

}
