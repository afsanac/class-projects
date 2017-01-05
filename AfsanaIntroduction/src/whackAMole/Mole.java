package whackAMole;

import gui.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {
	
	private int appearanceTime;

	public Mole(int x, int y) {
		super(x, y, 9, "resources/sampleImages/mole ");
	}

	public Mole(int x, int y, String imageLocation) {
		super(x, y, imageLocation);
		return
	}

	public Mole(int x, int y, int w, int h, String imageLocation) {
		super(x, y, w, h, imageLocation);
		// TODO Auto-generated constructor stub
	}

}
