package com.masai.P3;

public class Demo3 {

	public static void main(String[] args) {
		PlayGame pg = new PlayGame(); 

		pg.setGame(new PacmanGame());  

		pg.playGame();

		pg.setGame(new Mario());  

		pg.playGame();

		pg.setGame(new SuperContaGame());  

		pg.playGame();
	}

}
