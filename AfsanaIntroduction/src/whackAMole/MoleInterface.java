package whackAMole;

import gui.components.Action;
import gui.components.Clickable;

public interface MoleInterface extends Clickable {

	int getAppearanceTime();

	void setAppearanceTime(int screenTime);

	void setAction(Action action);
	
	/**
	 * this is for my partner, the enemy designer
	 * 
	 * 
	 */
	

}
