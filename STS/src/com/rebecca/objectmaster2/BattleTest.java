package com.rebecca.objectmaster2;

public class BattleTest {

	public static void main(String[] args) {
		Wizard wiz1 = new Wizard(); 
		System.out.println("A new wizard is spawned.");
		wiz1.displayStats();
		
		Ninja ninj1 = new Ninja(); 
		System.out.println("A new ninja is spawned.");
		ninj1.displayStats(); 
		
		Samurai sam1 = new Samurai(); 
		System.out.println("A new samurai is spawned."); 
		sam1.displayStats();
		
		Samurai sam2 = new Samurai(); 
		System.out.println("A new samurai is spawned."); 
		sam2.displayStats();
		
		int count = Samurai.howMany(); 
		
		System.out.println("There are "+count+" Samurai in our kingdom."); 
		
	}

}
