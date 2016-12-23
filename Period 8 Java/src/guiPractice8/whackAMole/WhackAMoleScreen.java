package guiPractice8.whackAMole;

import java.util.ArrayList;
import java.util.List;

import guiPractice8.component.ClickableScreen;
import guiPractice8.component.TextLabel;
import guiPractice8.component.Visible;

public class WhackAMoleScreen extends ClickableScreen implements Runnable{
	
	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;
	
	public WhackAMoleScreen(int width, int height) {
		super(width, height);
	}

	public void initAllObjects(List<Visible> visible) {
		moles = new ArrayList<MoleInterface>();
		label = new TextLabel(0, 0, 100, 50, "Ready...");
		timeLabel = new TextLabel(0, 0, 100, 50, "");
		
		//visible.add(player);
		visible.add(label);
		visible.add(timeLabel);
		
	}
	
	private PlayerInterface getAPlayer() {
		 return null;
	}
	
	private MoleInterface getAMole() {
	    return null;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
