package guiPractice8.whackAMole;

import guiPractice8.component.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface{



public Mole(int x, int y, String imageLocation) {
		super(x, y, imageLocation);
	}

	public Mole(int x, int y, int w, int h, String imageLocation) {
		super(x, y, w, h, imageLocation);
		
	}

	public Mole(int x, int y, double scale, String imageLocation) {
		super(x, y, scale, imageLocation);
	
	}

	@Override
	public int getAppearanceTime() {
		return 0;
	}

	@Override
	public void setAppearanceTime(int i) {
	
	}

}
