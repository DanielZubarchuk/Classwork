package guiPractice8.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;


import guiPractice8.Screen;
import guiPractice8.component.Action;
import guiPractice8.component.Button;
import guiPractice8.component.Graphic;
import guiPractice8.component.TextArea;
import guiPractice8.component.TextLabel;
import guiPractice8.component.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener{

	private TextLabel label;
	private TextArea paragraph;
	private Button button;
	private Graphic picture;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40,45,760,40,"Sample Text");
		paragraph = new TextArea(40,85,550,500,
				"This is a whole paragraph. Notice how "
				+ "as the paragraph gets to the edge"
				+ " of the page, a new line is created.");
		button = new Button(40,200,80,40,"Button",
				new Color(100,100,250),new Action() {
			
			public void Act() {
				MouseFollower.game.setScreen(MouseFollower.moveScreen);
			}
		});
		picture = new Graphic(50,50,.5,"resources/sampleImages/ghost.jpg");
		viewObjects.add(label);
		viewObjects.add(paragraph);
		viewObjects.add(button);
		viewObjects.add(picture);
	}

	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent m) {
		label.setText("Mouse at" + m.getX()+", "+m.getY());
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
	
	public MouseListener getMouseListener(){
		return this;
	}

	public void mouseClicked(MouseEvent m) {
		if(button.isHovered(m.getX(), m.getY())){
			button.act();
		}
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

