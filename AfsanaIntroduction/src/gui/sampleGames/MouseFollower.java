package gui.sampleGames;

import gui.GUIApplication;
import gui.screens.CoordinateScreen;

public class MouseFollower extends GUIApplication {
	
	//FIELDS
	private CoordinateScreen cs;
	public static MouseFollower

	public MouseFollower(int width, int height) {
		super(width, height);
		
	}
	
	public void initScreen(){
		cs = new CoordinateScreen(getWidth(), getHeight());
		setScreen(cs);
	}
	
	public static void main(String[] args) {
		game = new MouseFollower(800, 600);
		Thread app = new Thread(game);
		app.start();
	}

}
