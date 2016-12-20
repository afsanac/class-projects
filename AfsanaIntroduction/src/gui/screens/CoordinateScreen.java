package gui.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.components.Action;
import gui.components.Button;
import gui.components.Graphic;
import gui.components.TextArea;

public class CoordinateScreen extends Screen  implements MouseMotionListener{

	//FIELD
	private Button button;
	private TextLabel text;
	private TextArea area;
	private Graphic sprintrap;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	public void initObjects(ArrayList<Visible> viewObjects) {
		button = new Button(20,100,80,40,
				"The Button with a long name",new Color(100,100,250),
				new Action() {
			
			public void act() {
				
			}
		});
		viewObjects.add(button);
		text = new TextLabel(20, 200, 500, 40, "Some text");
		viewObjects.add(text);
		
		browser = 
	}

	public void mouseDragged(MouseEvent e) {
		
	}

	public void mouseMoved(MouseEvent e) {
		int mx = e.getX();//get mouse X coordinate
		int my = e. getY();//get Y coord
		text.setText("Mouse at: "+mx +", "+my);
	}

	public MouseMotionListener getMouseMotionListener(){ 
		return this;
	}
	
	
}
