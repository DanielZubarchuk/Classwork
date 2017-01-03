package guiPractice8.simonGame;

import guiPractice8.GUIApplication;

public class SimonGameDaniel extends GUIApplication{

	public static void main(String[] args) {
		SimonGameDaniel game = new SimonGameDaniel();
		Thread app = new Thread(game);
		app.start();
	}

	@Override
	protected void initScreen() {
		SimonScreenDaniel ssd = new SimonScreenDaniel(getWidth(), getHeight());
		setScreen(ssd);
		
	}

}
