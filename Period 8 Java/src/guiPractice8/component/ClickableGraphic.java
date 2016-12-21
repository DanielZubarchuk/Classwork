package guiPractice8.component;

import java.awt.image.BufferedImage;

public class ClickableGraphic extends Graphic implements Clickable{
	
	private int x;
	private int y;
	private BufferedImage image;
	private boolean loadedImages;
	private Action action;
	
	public ClickableGraphic(int x, int y, double scale, String imageLocation) {
		super(x, y, scale, imageLocation);
		// TODO Auto-generated constructor stub
	}
	public ClickableGraphic(int x, int y, int w, int h, String imageLocation) {
		super(x, y, w, h, imageLocation);
	}
	public ClickableGraphic(int x, int y, String imageLocation) {
		super(x, y, imageLocation);
			
	}
	@Override
	public boolean isHovered(int x, int y) {
		return x > getX() && x < getX()+getWidth() && y > getY() && y < getY()+getHeight();
	}
	@Override
	public void act() {
		if(action != null){
			action.act();
		}
		
	}
	
	public void setAction(Action a){
		this.action = a;
	}
	public void setX(int i) {
		
		
	}
	



}
