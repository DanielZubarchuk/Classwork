package guiPractice8;

import java.awt.Graphics;

import javax.swing.JFrame;

public abstract class GUIApplication extends JFrame{

	private Screen currentScreen;

	public void setScreen(Screen screen){
		// stop controls from last screen
		if(currentScreen != null){
			if(currentScreen.getMouseListener() != null){
				removeMouseListener(currentScreen.getMouseListener());
			}
			if(currentScreen.getMouseListener() != null){
				removeMouseMotionListener(currentScreen.getMotionMouseListener());
			}
		}
		currentScreen = screen;
		// add controls for new screen
		if(currentScreen != null){
			addMouseListener(currentScreen.getMouseListener());
			addMouseMotionListener(currentScreen.getMotionMouseListener());
		}
		
	}
	
	public GUIApplication(){
		// terminate program when window is closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(false);
		int x = 40; 
		int y = 40;
		int width = 600;
		int height = 400;
		setBounds(x,y,width,height);
		initScreen();
		setVisible(true);
	}

	/*
	 * 
	 */
	
	protected abstract void initScreen();
	
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
}
