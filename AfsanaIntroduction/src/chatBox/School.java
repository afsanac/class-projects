package chatBox;

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
			if(schoolResponse.indexOf("stop") >= 0{
				inSchoolLoop = false;
				AfsanaMain.talkForever();
			})
			
			AfsanaMain.print("That's my favorite part about school");
			
		}
	}
}
