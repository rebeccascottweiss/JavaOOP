package com.rebecca.objectmaster1;

public class HumanTest {

	public static void main(String[] args) {
		Human player1 = new Human(); 
		Human player2 = new Human(); 
		
		player1.attack(player2);
		
		System.out.println("Player 1 has attacked Player 2"); 
		System.out.println("Player 2 stats");
		
		player2.displayStats("health", "Player 2");
		
		player2.attack(player1); 
		
		System.out.println("Player 2 has attacked Player 1"); 
		System.out.println("Player 1 now has health " + player1.getHealth()); 
		
		
	}

}
