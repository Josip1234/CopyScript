package com.copy.script.simulation.loops;

import com.copy.script.messages.Message;

/**
 * 
 * @author Korisnik
 * @category SimulationLoops
 * @version 1.0
 * @since 28.12.2020. 13:32
 */
public class SimulationLoop {
	/**
	 * @author Korisnik
	 * @category Functions
	 * @since 28.12.2020. 13:36
	 * @param numberOfTimeLoop
	 */
	public void simulateOpenningDesktopApplication(int numberOfTimeLoop){
		for (int i = 0; i < numberOfTimeLoop; i++) {
			System.out.println(Message.openingApplication);
		}
		System.out.println(Message.applicationIsOpen);
	}

}
