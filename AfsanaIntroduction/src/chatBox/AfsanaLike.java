package chatBox;

import chatBox.AfsanaMain;

public class AfsanaLike implements Topic{
	
	private boolean inLikeLoop;
	private String likeResponse;
	
	public void talk() {
		AfsanaMain.print("What are some things you like?");
		inLikeLoop = true;
		while(inLikeLoop){
			likeResponse = AfsanaMain.getInput();
			int likePsn = AfsanaMain.findKeyword(likeResponse, 
					"like", 
					0);
			if( likePsn >= 0 ){
				String thingsLiked = 
						likeResponse.substring(likePsn+5);
				AfsanaMain.print("You are such an "
						+ "interesting"
						+ "person, because you like "+thingsLiked+".");
				if(AfsanaMain.findKeyword(thingsLiked, 
						"school", 0) >= 0){
					inLikeLoop = false;
					AfsanaMain.school.talk();
				}else{
					inLikeLoop = false;
					AfsanaMain.talkForever();	
				}
				
			}else{
				AfsanaMain.print("I don't understand you.");
			}
		}
		
	}

	public boolean isTriggered(String userInput) {
		if(AfsanaMain.findKeyword(userInput, "like", 0) 
				>= 0 ){
			return true;
		}
		return false;
	}
}
	
