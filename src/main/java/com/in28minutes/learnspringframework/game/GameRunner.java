package com.in28minutes.learnspringframework.game;

public class GameRunner {
//	MarioGame game;
//	private SuperContraGame game;
	private GamingConsole game;
	public GameRunner(GamingConsole game) {
			this.game = game;
		}
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Running game: " + game);
			System.out.println("Ab Run's It");
			game.up();
			game.down();
			game.left();
			game.right();
		}
}
