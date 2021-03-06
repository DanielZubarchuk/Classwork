package guiPractice8.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice8.Screen;
import guiPractice8.component.Action;
import guiPractice8.component.Button;
import guiPractice8.component.ClickableGraphic;
import guiPractice8.component.Graphic;
import guiPractice8.component.Visible;

public class MyScreen extends Screen implements MouseMotionListener, MouseListener{

	private Graphic secondPic;
	private Button back;
	
	public MyScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		secondPic = new Graphic(200,200,.25,"resources/sampleImages/ball2.png");
		back = new Button(50,50,100,60,"Back", Color.GRAY, new Action() {
			
			public void act() {
				MouseFollower.game.setScreen(MouseFollower.coordScreen);
			}
		});
		
		viewObjects.add(secondPic);
		viewObjects.add(back);
	}

	public void mouseDragged(MouseEvent arg0) {

	}

	public void mouseMoved(MouseEvent e) {
		
	}

	public void mouseClicked(MouseEvent e) {
		if(back.isHovered(e.getX(), e.getY())){
			back.act();
		}
	}

	public void mouseEntered(MouseEvent e) {
	
	}

	public void mouseExited(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
	
	}

	public MouseListener getMouseListener(){
		return this;
	}
	
}