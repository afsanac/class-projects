package whackAMole;

import java.awt.Color;
import java.awt.Graphics2D;

import gui.components.Component;

public class Player extends Component implements PlayerInterface {
	
	private int score;

	public Player() {
		super(20, 20, 100, 100);
		// TODO Auto-generated constructor stub
	}


	public void increaseScore(int i) {
		score += i;
		update();
	}


	public void update(Graphics2D g) {
		g.setColor(Color.black);
		g.drawOval(0, 0, 99, 99);
		g.drawString("Score = ", 40, 55);

	}

}
