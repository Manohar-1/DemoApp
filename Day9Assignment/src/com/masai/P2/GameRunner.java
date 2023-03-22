package com.masai.P2;

public class GameRunner {

	SuperContaGame sp =new SuperContaGame();
	PacmanGame pc =new PacmanGame(); 
	Mario m =new Mario(); 
	
	
	public void run(){
		System.out.println("Game is started");
		
		sp.up();
		sp.down(); 
		sp.left(); 
		sp.right(); 
		
		
		pc.up(); 
		pc.down(); 
		pc.left(); 
		pc.right(); 
		
		m.up(); 
		m.down(); 
		m.left(); 
		m.right();
		
	}
	
	
}
