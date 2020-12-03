package com.rebecca.objectmaster2;

import com.rebecca.objectmaster1.Human;

public class Wizard extends Human {

	public Wizard() {
		this.setHealth(50);
		this.setIntelligence(8);
	}
	
	public void heal(Human ally){
		int power = this.getIntelligence(); 
		int health = ally.getHealth(); 
		
		ally.setHealth(health + power);
	}
	
	public void fireball(Human enemy) {
		int power = this.getIntelligence()*3; 
		int health = enemy.getHealth(); 
		
		enemy.setHealth(health - power);
	}

}
