package guiPractice8.whackAMole;

import java.util.ArrayList;
import java.util.List;

import guiPractice8.component.Action;
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
		timeLeft = 30.0;
		Thread play = new Thread(this);
		play.start();
	}

	public void initAllObjects(List<Visible> visible) {
		moles = new ArrayList<MoleInterface>();
//		player = getAPlayer();
		label = new TextLabel(getWidth()/2-60, getHeight()/2-30, 120, 60, "Ready...");
		timeLabel = new TextLabel(getWidth()/2-60, 50, 120, 60, "");

		
		visible.add(label);
		visible.add(timeLabel);
		
	}
	
	private PlayerInterface getAPlayer() {
		 return null;
	}
	
	private MoleInterface getAMole() {
	    return null;
	}

	public void update(){
		super.update();
	}
	
	private void changeText(String s){
		try{
			Thread.sleep(1000);
			label.setText(s);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	private void disappearMoles(){

		for(int i = 0; i < moles.size();i++){
			MoleInterface m = moles.get(i);
			m.setAppearanceTime(m.getAppearanceTime() -100);
			if(m.getAppearanceTime() <=0){
				remove(m);
				moles.remove(i);
				i--;
			}
		}
	}
	
	public void run() {
		changeText("Set...");
		changeText("Go...");
		changeText("");
		timeLabel.setText(""+timeLeft);
		while(timeLeft > 0){
			//frame updates every 100ms
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			timeLeft -= .1;
			timeLabel.setText(""+(int)(timeLeft*10)/10.0);
			
			disappearMoles();
			addNewMoles();
		}
	}

	private void addNewMoles() {
		//probability of mole appearing depends on time left
		double probability = .2+.1*(30.0 - timeLeft)/30;
		if(Math.random() < probability){
			final MoleInterface mole = getAMole();
			mole.setAppearanceTime((int)(500+ Math.random() * 2000));
			
			mole.setAction(new Action(){
				public void act(){
					player.increaseScore(1);
					remove(mole);
					moles.remove(mole);
					
				}
			});
			
			addObject(mole);
			moles.add(mole);
		}
	}

}
