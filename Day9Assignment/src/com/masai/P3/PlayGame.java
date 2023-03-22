package com.masai.P3;

public class PlayGame {
 
	Game g; 
	
	public void setGame(Game g) {
		this.g=g; 
	}
	
	public void playGame() {
		g.up(); 
		g.down(); 
		g.left();
		g.right();
	}
	
}
