package org.testNGProgrammes;

import org.openqa.grid.internal.listeners.Prioritizer;
import org.testng.annotations.Test;

public class testNGFirst {
	@Test (priority = 2)
	public void startCar() {
	System.out.println(" Start the car");
	}
	@Test(priority =- 3)
	private void firstGear() {
System.out.println("First Gear");
	}
	@Test(priority = 0)
	private void secondGear() {
System.out.println("secondGear");
	}
	@Test(priority=0)
	private void thirdGear() {
System.out.println("ThirdGear");
	}
	
	

}
