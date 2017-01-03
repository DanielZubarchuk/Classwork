package guiPractice8.simonGame;

import java.util.ArrayList;
import java.util.List;

import guiPractice8.component.ClickableScreen;
import guiPractice8.component.TextLabel;
import guiPractice8.component.Visible;

public class SimonScreenDaniel extends ClickableScreen implements Runnable{

	private ArrayList<MoveInterfaceDaniel> moves;
	private ProgressInterfaceDaniel progress;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;
	private int roundNumber;
	
	private ButtonInterface[] buttons;
	
	public SimonScreenDaniel(int width, int height) {
		super(width, height);
		timeLeft = 30.0;
		Thread play = new Thread(this);
		play.start();
	}

	@Override
	public void run() {
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		
		
	}

}
