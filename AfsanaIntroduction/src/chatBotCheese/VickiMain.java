package chatBotCheese;

import java.util.Scanner;

public class VickiMain {
	static String user;
	static Scanner input;
	static boolean inLoop;
	static String response;
	static Topic vicki;
	static Topic jason;
	static Topic afsana;
	static Topic alam;
	
	public static void main(String[] args) {
		createTopics();
		promptName();
		talkForever();
	}
	private static void promptName() {
		print("Hello human. I am CheeseBot and I specialize in food. What is your name?");
		user = input.nextLine();
		print("Awesome! I will call you " + user + " until you terminate me.");
	}
	public static void talkForever() {
		inLoop = true;
		print("Hey, " + user + ". Do you like food?");
		while(inLoop) {
			response = getInput();
			if(vicki.isTriggered(response)) {
				inLoop = false;
				vicki.talk();
			}
			if(jason.isTriggered(response)) {
				inLoop = false;
				jason.talk();
			}
			if(afsana.isTriggered(response)) {
				inLoop = false;
				afsana.talk();
			}
			if(alam.isTriggered(response)) {
				inLoop = false;
				alam.talk();
			}
		}
	}
	public static int findKeyword(String searchString, String key, int startIndex) {
		String phrase = searchString.trim();
		phrase = phrase.toLowerCase();
		key = key.toLowerCase();
		int psn = phrase.indexOf(key);
		while (psn >= 0) {
			String before = " ";
			String after = " ";
			if (psn + key.length() < phrase.length()) {
				after = phrase.substring(psn + key.length(), psn + key.length() + 1).toLowerCase();
			}
			if (psn > 0) {
				before = phrase.substring(psn - 1, psn).toLowerCase();
			}
			if (before.compareTo("a") < 0 && after.compareTo("a") < 0) {
				if(noNegations(phrase, psn)) {
					return psn;		
				}
			}
			psn = phrase.indexOf(key, psn+1);
		}
		return -1;
	}
	private static boolean noNegations(String phrase, int index) {
		if (index - 3 >= 0 && phrase.substring(index - 3, index).equals("no ")) {
			return false;
		}
		if (index - 4 >= 0 && phrase.substring(index - 4, index).equals("not ")) {
			return false;
		}
		if (index - 4 >= 0 && phrase.substring(index - 4, index).equals("n't ")) {
			return false;
		}
		if (index - 6 >= 0 && phrase.substring(index - 6, index).equals("never ")) {
			return false;
		}
		return true;
	}
	public static String getInput() {
		return input.nextLine();
	}
	public static void print(String s) {
		String printString = "";
		int cutoff = 80;
		while (s.length() > 0) {
			String currentLine = "";
			String nextWord = "";
			while (currentLine.length() + nextWord.length() <= cutoff && s.length() > 0) {
				currentLine += nextWord;
				s = s.substring(nextWord.length());
				int endOfWord = s.indexOf(" ");
				if (endOfWord == -1) {
					endOfWord = s.length() - 1;
				}
				nextWord = s.substring(0, endOfWord + 1);
			}
			printString += currentLine + "\n";
		}
		System.out.println(printString);
	}
	public static void createTopics() {
		input = new Scanner(System.in);
		// initialize group classes
		vicki = new VickiTopic();
		jason = new JasonTopic();
		afsana = new Hangry();
		alam = new FoodCombos();
	}
}