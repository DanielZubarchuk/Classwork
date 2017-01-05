package guiPractice8.simonGame;

import java.awt.Color;
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
	boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;
	private ButtonInterfaceDaniel[] buttons;
	
	public SimonScreenDaniel(int width, int height) {
		super(width, height);
		//timeLeft = 30.0;
		Thread play = new Thread(this);
		play.start();
	}

	@Override
	public void run() {
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {

		addButtons();
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		moves = new ArrayList<MoveInterfaceDaniel>();
		//add 2 moves to start
		lastSelectedButton = -1;
		moves.add(randomMove());
		moves.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
		
	}

	private MoveInterfaceDaniel randomMove() {
		ButtonInterfaceDaniel bttn;
		return new getMove(bttn);
	}

	/**
	Placeholder until partner finishes implementation of ProgressInterface
	*/
	private ProgressInterfaceDaniel getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		// helper method
		int numberOfButtons = 5;
		Color[] color = {Color.blue, Color.orange, Color.pink, Color.blue, Color.green};
		for(int i = 0; i < numberOfButtons;i++){
			buttons[i] = getAButton();
			buttons[i] = setColor(Color[i]);
			buttons[i] = setX(500);
//			buttons[i] = setY(500);
		}
		
	}

	private void getAButton() {
		// helper method
		
	}

}
