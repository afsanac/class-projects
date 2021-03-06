package chatBox;

import chatBox.AfsanaMain;

public class School implements Topic {
	
	private boolean inSchoolLoop;
	private String schoolResponse;

	public School(){
		
	}
	
	public void talk(){
		inSchoolLoop = true;
		while (inSchoolLoop){
			AfsanaMain.print("Tell me about school.");
			schoolResponse = AfsanaMain.getInput();
			if(schoolResponse.indexOf("stop") >= 0){
				inSchoolLoop = false;
				AfsanaMain.talkForever();
			}
			
			AfsanaMain.print("That's my favorite part about school too.");
			
		}	
	}
	
	public boolean isTriggered(String userInput) {
//		String[] triggers = {"schhol","class","teacher"};
		//you could use a for loop
		//to iterate through an array
		if(AfsanaMain.findKeyword(userInput, "school", 0) 
				>= 0 ){
			return true;
		}
		if(AfsanaMain.findKeyword(userInput, "class", 0) 
				>= 0 ){
			return true;
		}
		return false;
	}

}
