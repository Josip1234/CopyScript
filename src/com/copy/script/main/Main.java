package com.copy.script.main;

import com.copy.script.simulation.loops.SimulationLoop;

/**
 * 
 * @author Korisnik
 * @category MainCMDApp
 * @version 1.0
 * @since 28.12.2020. 13:46
 */
public class Main {

	public static void main(String[] args) {
		int numberOfTimes = 100000;
		SimulationLoop loop = new SimulationLoop();
		loop.simulateOpenningDesktopApplication(numberOfTimes);

	}

}
