package com.rebecca.objectmaster1;

public class Human {
	private int strength; 
	private int stealth; 
	private int intelligence; 
	private int health;
	
	public Human() {
		this.strength = 3; 
		this.stealth = 3; 
		this.intelligence = 3; 
		this.health = 100; 
	}
	
	public void attack(Human human) {
		int attack = this.getStrength(); 
		int health = human.getHealth();  
		human.setHealth(health-attack); 
	}
	
	
	public int getStrength() {
		return strength;
	}



	public void setStrength(int strength) {
		this.strength = strength;
	}



	public int getHealth() {
		return health;
	}
	
	
	public void setHealth(int health) {
		this.health = health;
	}



	public int getStealth() {
		return stealth;
	}



	public void setStealth(int stealth) {
		this.stealth = stealth;
	}



	public int getIntelligence() {
		return intelligence;
	}



	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	} 
	
	

}
