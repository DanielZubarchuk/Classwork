package guiPractice8.component;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import guiPractice8.Screen;

public class ClickableScreen extends Screen implements MouseListener{

	private ArrayList<Clickable> clickables;
	
	public ClickableScreen(int width, int height) {
		super(width, height);
		
		clickables = new ArrayList<Clickable>();
		
		
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
	public MouseListener getMouseListener(){
		return this;
	}

	

}
