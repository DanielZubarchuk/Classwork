package guiPractice8.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import guiPractice8.GUIApplication;

public class MouseCoordinateGame extends GUIApplication implements MouseListener{

	public static CoordinateScreen coordScreen;
	public static MouseCoordinateGame game;


	public MouseCoordinateGame(int i, int j) {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args){

		game = new MouseCoordinateGame(500, 500);
	
		Thread app = new Thread(game);
	
		app.start();

	}


	@Override
	protected void initScreen() {
		
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
	
		
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		
	}
}	
