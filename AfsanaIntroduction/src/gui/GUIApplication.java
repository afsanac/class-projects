package gui;

import java.awt.Graphics;

import javax.swing.JFrame;

public class GUIApplication extends JFrame implements Runnable {
	
	//FIELDS
	private Screen currentScreen;
	
	
	public GUIApplication(int width, int height) {
		super();
		setBounds(20,20,width, height);
		//terminate program when window is closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initScreen();
		setVisible(true);
	}

	public void initScreen() {
	//	currentScreen= new Screen(getWidth(), getHeight());
	}
	
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
	
	public void setScreen(Screen s){
		if(currentScreen!=null){
			MouseListener ml = currentScreen.getMouseListner()
		}
		
		currentScreen = s;
		if currentScreen != null){
			addMouseListener(currentScreen.getMouseListner());
			addMouseListener(currentScreen.getMouseMotionListner());
		}
	}
	public void run(){
		while(true){
			//dedraws the display
			currentScreen.update();
			//update the window
			repaint();
			try{
				Thread.sleep(30);
			} catch (InterruptionException e){
				e.printStackTrace(game);
			}
		}
		
	}
}
