package guiPractice8.sampleGames;

import guiPractice8.GUIApplication;

public class MouseFollower extends GUIApplication {
	
	private CoordinateScreen coordScreen;
	
	@Override
	protected void initScreen() {
		coordScreen = new CoordinateScreen(getWidth(), getHeight());
		setScreen(coordScreen);

	}

}
