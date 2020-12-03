package com.rebecca.objectmaster2;

import com.rebecca.objectmaster1.Human;

public class Samurai extends Human {
	private static int numberOfSamurai = 0; 

	public Samurai() {
		this.setHealth(200);
		numberOfSamurai += 1; 
	}
	
	public void deathblow(Human enemy) {
		enemy.setHealth(0);
		
		this.setHealth(this.getHealth()/2);
		
		System.out.println("Your enemy is dead, but at what cost. Your health is now "+ this.getHealth() + "."); 
	}
	
	public void meditate() {
		int healing = this.getHealth()/2; 
		
		this.setHealth(this.getHealth() + healing);
	}
	
	public static int howMany() {
		return numberOfSamurai; 
	}

}
