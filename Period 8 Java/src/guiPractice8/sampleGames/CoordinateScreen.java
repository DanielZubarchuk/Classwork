package guiPractice8.sampleGames;

import guiPractice8.Screen;
import guiPractice8.component.TextLabel;

public class CoordinateScreen extends Screen {

	private TextLabel label;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
		label = new TextLabel(40, 45, width - 80, 40, "");
		
	}
	
	
}
