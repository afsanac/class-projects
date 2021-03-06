package dataType;

import java.util.Scanner;

public class StringPractice {
	
	static Scanner input;
	static String user;
	//static int lineCount;
	static boolean inloop;
	static String response;

	public static void main(String[] args) {
		createAScanner();
		//lineCount = 0;
//		demonstrateStringMethod();
		promptName();
		talkForever();
		
	}
	
	private static void promptName() {
		print("Hello humam! I am a board covered with semiconductors and other such electronic compoment. What is your name?");
		user = input.nextLine();
		print("Awesome? I will call you " +user + " until you terminate me.");
	}

	public static void talkForever(){
		inloop = true;
		while(inloop){
			print("Greetings, " + user + " How are you?");
			response = getInput();
			if (response.indexOf("good") > 0){
				print("I'm so happy you're good");
			}else{
				print("I don't understand you");
			}
		}
	}
	
	public static String getInput() {
		return input.nextLine();
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
	public static void createAScanner() {
		input = new Scanner (System.in);
	}

	public static void demonstrateStringMethod(){
		//      String text = new String ("Hello World");
		String text1 = "Hello World";//same as above
		String text2 = "Hello ";//same as above
		String text3 = "World";
		
		if (text1.equals(text2 + text3)){
			System.out.println("These strings are equal.");
		}
		
		System.out.println(text1);
		System.out.println(text2+text3);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzyva;";
		if (word1.compareTo(word2) < 0){
			System.out.println("word1 is before word2," + " lexicongrapgically");
		}
	}
}
