package gui.sampleGames;

import gui.GUIApplication;
import gui.screens.CoordinateScreen;

public class MouseFollower extends GUIApplication {
	
	private CoordinateScreen cs;

	public MouseFollower(int width, int height) {
		super(width, height);
		
	}
	
	public void initScreen(){
		cs = new CoordinateScreen(getWidth(), getHeight());
		setScreen(cs);
	}
	
	public static void main(String[] args) {
		new MouseFollower(800, 600);
	}

}
