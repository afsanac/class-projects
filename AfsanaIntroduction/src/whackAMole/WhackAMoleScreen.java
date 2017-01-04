package whackAMole;

import java.util.ArrayList;
import java.util.List;

import gui.components.Action;
import gui.components.TextLabel;
import gui.components.Visible;
import gui.sampleGames.ClickableScreen;

public class WhackAMoleScreen extends ClickableScreen implements Runnable {
	
	 private ArrayList<MoleInterface> moles;
	 private PlayerInterface player;
	 private TextLabel label;
	 private TextLabel timeLabel;
	 private double timeLeft;
	

	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 30.0;
		Thread play = new Thread(this);
		play.start();
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		moles = new ArrayList<MoleInterface>(); // this is instantiating
		player = getAPlayer();
		label = new TextLabel(350, 220, 100, 40, "sample Text");
		timeLabel = new TextLabel(360, 40, 80, 40, "30.0");
//		viewObjects.add(player);
		viewObjects.add(timeLabel);
		viewObjects.add(label);

	}
	
	
	/**
	 * 
	 * this method is a placeholder until our "parther" finishes the design of Player. For the time being, in return "null". 
	 * This means our code won't work until out partner id fine. BUT at least our code will compile.
	 * 
	 * DONT FORGET TO CHANGE THIS ONCE YOUR PARTNER IS DONE!!!
	 * @return
	 */
	
	
	public PlayerInterface getAPlayer(){
		return null;
	}
	
	public MoleInterface getAMole(){
		return null;
	}
	
	public void run(){
		changeText("Ready...");
		changeText("Set...");
		changeText("Go!...");
		label.setText("");
		//since  this is a timed game, we will use a while lopp. This is not necessary for games that aren't timed
		
		while(timeLeft > 0){
			updateTimer();
			updateAllMole();
			appearNewMole();
		}
		
	}

	private void appearNewMole() {
		double chance = .1*(60 - timeLeft)/60;	
		if(Math.random() < chance){
			//create a mole
			final MoleInterface mole = getAMole();
			mole.setAppearanceTime((int)(500 + Math.random()*2000));
			//tell the mole what to do when clicked
			mole.setAction(new Action(){
				public void act(){
					player.increaseScore(1);
					remove(mole);
					moles.remove(mole);
				}
			});
			addObject(mole);
			moles.add(mole);
		}
	}

	private void updateAllMole() {
		for(int i = 0; i < moles.size(); i++){
			MoleInterface m = moles.get(i);
			int screenTime = m.getAppearanceTime() - 100;
			m.setAppearanceTime(screenTime);
			if(m.getAppearanceTime() <= 0){
				remove(m); // remove from screen
				moles.remove(m);
				i--; //compensate for removal
			}
		}
		
	}

	private void updateTimer() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		timeLeft -= .1;
		//.1 this
		timeLabel.setText("" + (int)(timeLeft)*10/10.0);
		
	}

	private void changeText(String string) {
		label.setText(string);
		try{
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	


	
	
	
}
