package com.rebecca.objectmaster2;

import com.rebecca.objectmaster1.Human;

public class Ninja extends Human {

	public Ninja() {
		this.setStealth(10);
	}; 
	
	public void steal(Human enemy) {
		int stealth = this.getStealth(); 
		int enemyHealth = enemy.getHealth(); 
		
		enemy.setHealth(enemyHealth - stealth);
		
		this.setHealth(this.getHealth() + stealth);
		
		System.out.println("You have stolen your enemy's health.");
	}; 
	
	public void runAway() {
		this.setHealth(this.getHealth() - 10);
		System.out.println("You bring shame to yourself and your family. Lose 10 health.");
	}; 
	
	

}
