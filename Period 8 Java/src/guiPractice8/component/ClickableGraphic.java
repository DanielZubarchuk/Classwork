package guiPractice8.component;

import java.awt.image.BufferedImage;

public class ClickableGraphic extends Graphic implements Clickable{
	
	private int x;
	private int y;
	private BufferedImage image;
	private boolean loadedImages;
	
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
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}
	



}
