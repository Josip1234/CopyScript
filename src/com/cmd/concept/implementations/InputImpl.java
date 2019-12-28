package com.cmd.concept.implementations;

import com.cmd.concept.interfaces.UserInput;
import com.cmd.concept.messages.Message;
import com.cmd.concept.pojo.Input;

public class InputImpl extends Message implements UserInput {
	

	@Override
	public void input() {
		Input input=new Input();
		printMessage(getOpenLastDirectory());
		input.setOpen(input.nextBoolean());
		System.out.println(input.isOpen());
		input.nextLine();
	    printMessage(getChooseFileLastSaved());
	    input.setValue(input.nextLine());
	    System.out.println(input.getValue());
		
	}

}
