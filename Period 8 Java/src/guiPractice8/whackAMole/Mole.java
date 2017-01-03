package guiPractice8.whackAMole;

import guiPractice8.component.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface{



private double appearanceTime;

public Mole(int x, int y) {
		super(x, y, 0.5, "resources/sampleImages/mole.jpg");
	}


	public int getAppearanceTime() {
		return (int) appearanceTime;
	}

	@Override
	public void setAppearanceTime(int d) {
		this.appearanceTime = d;
		
	}

}
