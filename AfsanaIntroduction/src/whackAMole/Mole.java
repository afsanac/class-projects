package whackAMole;

import gui.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface {
	
	private int appearanceTime;

	public Mole(int x, int y) {
		super(x, y, 0.5, "resources/sampleImages/mole.jpg ");
	}

	public int getAppearanceTime() {
		return appearanceTime;
	}

	public void setAppearanceTime(int screenTime) {
		appearanceTime = screenTime;
	}
}
