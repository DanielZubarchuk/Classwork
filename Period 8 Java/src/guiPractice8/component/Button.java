package guiPractice8.component;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel implements Clickable{

	private Color color;
	private Action action;

	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text);
		this.color = color;
		this.action = action;
	}
	
	public void update(Graphics2D g) {
		g = clear();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
		
		
		if(getText() != null){
			g.fillRoundRect(50, 50, 25, 25, 30, 30);
			g.setColor(Color.blue);
			g.drawRoundRect(100, 40, 100, 600, 30, 30);
			g.setFont(new Font(getFont(),Font.PLAIN,getSize()));
			g.drawString(getText(), 4, getHeight()-5);
		}
	}

	@Override
	public boolean isHovered(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}

	
}
