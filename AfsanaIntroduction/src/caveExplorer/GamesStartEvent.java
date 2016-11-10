package caveExplorer;

public class GamesStartEvent implements Event {

	public static final String[] SEQ_1 = {
			"A spiky-haired guy with orange pants flies up to you? Have you arrived to save us from the treacherous Buu?",
			"We need ypu help?"
	};
	
	public static final String[] SEQ_2 = {
		"Great, I will e busy meditatiting on my super ",
		"btw heres a map"
	};
	
	public void play() {
		readSequence(SEQ_1);
		CaveExplorer.print("Will ypu help us?");
		while(CaveExplorer.in.nextLine().indexOf("yes") < 0){
			CaveExplorer.print("Please say yes. I beg you!");
		}
		readSequence(SEQ_2);
		CaveExplorer.inventory.setMap(true);
	}
	
	public static void readSequence(String[] seq){
		for(String s : seq){
			CaveExplorer.print(s);
			CaveExplorer.print("--- Press enter ---");
			CaveExplorer.in.nextLine();
		}
	}
}
