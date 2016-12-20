package gui.components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Graphic implements Visible {
	
	//FIELDS
	private BufferedImage image;
	private boolean loadedImages;
	private int x;
	private int y;

	//full size graphics constuctors
	public Graphic(int x, int y, String imageLocation) {
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadedImages(imageLocation,0,0);
	}


	private void loadedImages(String imageLocation, int w, int h) {
		try{
			//full size image
			ImageIcon icon = new ImageIcon(imageLocation);
			
			if( w <= 0 && h <= 0){
				//use fullsize image
				image = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
				//use the graphics2D tool to copy the icon
				Graphics2D g = image.createGraphics();
				g.drawImage(icon.getImage(), 0, 0, null);
			}else{
				//use custom size icon
			}
			
		}catch(Exception e){
			//this happens when you dont name the image correctly
			e.printStackTrace();
		}
		
	}


	public BufferedImage getImage() {

		return image;
	}

	public int getX() {

		return x;
	}


	public int getY() {

		return y;
	}

	public int getWidth() {

		return image.getWidth();
	}

	public int getHeight() {

		return image.getHeight();
	}

	public boolean isAnimated() {
		return false;
	}

	public void update() {
		//does nothing, image stays the same
	}

}
