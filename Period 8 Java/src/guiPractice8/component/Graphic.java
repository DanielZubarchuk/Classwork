package guiPractice8.component;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Graphic implements Visible {

	//FIELDS
	private int x;
	private int y;
	private BufferedImage image;
	private boolean loadedImages;

	public Graphic(int x, int y, String imageLocation){
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation, 0, 0);
	}
	
	private void loadImages(String imageLocation, int w, int h) {
		try{
			ImageIcon icon = new ImageIcon(imageLocation);
			
			if(w == 0 && h == 0){
				image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
				
				Graphics2D g = image.createGraphics();
				g.drawImage(icon.getImage(), 0, 0, null);
			}else{
				
			}
			loadedImages = true;
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private void loadImages(String imageLocation, double scale) {
		
		
	}

	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAnimated() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
