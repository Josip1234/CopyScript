package com.copy.script.simulation.loops;

import com.copy.script.messages.Message;

/**
 * Class for simulation
 * @author Korisnik
 * 
 * @version 1.0
 * @since 28.12.2020. 13:32
 */
public class SimulationLoop {
	/**
	 * Simulate opening application
	 * @author Korisnik
	 * 
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
