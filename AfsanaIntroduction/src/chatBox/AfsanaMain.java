package chatBox;

import java.util.Scanner;

public class AfsanaMain {
	
	static Scanner input;
	static String user;
	static boolean inLoop;
	static String response;
	//declare groups's classes
	static Topic school;
	static Topic like;
	static Topic hello;

	public static void main(String[] args) {
		createTopic();
		promptName();
		talkForever();
	}
	
	private static void promptName() {
		print("Hello humam! I am a board covered with semiconductors and other such electronic compoment. What is your name?");
		user = input.nextLine();
		print("Awesome? I will call you " +user + " until you terminate me.");
	}

	public static void talkForever(){
		inLoop = true;
		while(inLoop){
			print("Greetings, " + user + " How are you?");
			response = getInput();
			if (findKeyWord(response, "good", 0) >= 0){
				print("I'm so happy you're good");
			}else{
				print("I don't understand you");
			}
		}
	}
	
	public static String getInput() {
		return input.nextLine();
	}
	public static int findKeyWord(String searchString, String key, int startIndex) {
		//deletes white space
		String phrase = searchString.trim();
		//set all letters to lowercase
		phrase = phrase.toLowerCase();
		key = key.toLowerCase();
		
		//find position of key
		int psn = phrase.indexOf(key); // psn = position
		
		//keep looking for the word until you find the right context
		while (psn >= 0){
			String before = " ";
			String after = " ";
			//if the phrase does not end with this word
			if (psn + key.length() < phrase.length()){
				after = phrase.substring(psn + key.length(), psn + key.length() + 1).toLowerCase();
			}
			// if the phrase does not begin with this word 
			if (psn > 0){
				before = phrase.substring(psn-1,psn).toLowerCase();
			}
			if (before.compareTo("a") < 0 && after.compareTo("a") < 0){
				if(noNegations(phrase,psn)){
				return psn;
				}
			}
			//in case the keyword was not found yet, check the rest of the phrase
			psn = phrase.indexOf(key,psn+1);
		}
		
		return -1;
	}
	
	/**helper method: a method that contributes functionality to another method. Helper methods are very common when you 
	 * need to do the same thing repeated. they also help make methods more readable. This method is private because
	 * it is only used by the method it is helping
	 */
	private static boolean noNegations(String phrase, int index){
		//check for word "NO " ( 3 characters)
		//check to see if there is space for the word
		//"No " to be in front of the index
		if(index - 3 >= 0 && phrase.substring(index-3,index).equals("no ")){
			return false;
		}
		//check for "not "
		if(index - 4 >= 0 && phrase.substring(index-4,index).equals("not ")){
			return false;
		}
		//check for "never "
		if(index - 6 >= 0 && phrase.substring(index-6,index).equals("never ")){
			return false;
		}
		//check for "n't "
		if(index - 4 >= 0 && phrase.substring(index-4,index).equals("n't ")){
			return false;
		}
		return true;
	}
	

	public static void promptInput() {
		print("Try inputing a String!");
		String userInput = input.nextLine();
		print("You type: " +userInput);
	}
	

	public static void print(String s) {
		//lineCount++;
		//create a multi-line String
		String printString = "";
		int cutoff = 35;
		//check to see if there are words to add
		//(IOW, is the length of s > 0
		while (s.length() > 0){
			String currentLine = "";
			String nextWord = "";
			//while the currentLine and nextWord are less
			//than the cutoff, AND there is still
			//words to add to the following loop
			while (currentLine.length() + nextWord.length() <= cutoff && s.length() > 0){
				//add the next word to the line
				currentLine += nextWord;
				//remove that word
				s = s.substring(nextWord.length());
				//get the following word
				int endOfWord = s.indexOf(" ");
				//check to see if this is the last word
				if(endOfWord == -1){
					endOfWord = s.length() -1;
				}
				nextWord = s.substring(0, endOfWord + 1);
			}
			printString += currentLine + "\n";
		}
		System.out.println(printString);
		
	}
	public static void createTopic() {
		input = new Scanner (System.in);
		school = new School();
		like = new AfsanaLike();
		hello = new AfsanaHello();
		
		
		//initialize group classes
	}
}
