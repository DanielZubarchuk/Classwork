package guiPractice8.sampleGames;

import java.util.ArrayList;

import guiPractice8.Screen;
import guiPractice8.component.TextLabel;
import guiPractice8.component.Visible;

public class CoordinateScreen extends Screen {

	private TextLabel label;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects2) {
		label = new TextLabel(40, 45, 760, 40, "Sample Text");
		viewObjects2.add(label);
		
	}
	
	
}
