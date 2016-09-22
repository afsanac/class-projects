package dataType;

import java.util.Scanner;

public class StringPractice {
	
	static Scanner input;
	static String user;
	static int lineCount;

	public static void main(String[] args) {
		createAScanner();
		lineCount = 0;
//		demonstrateStringMethod();
		promptName();
		talkForever();
		
	}
	
	private static void promptName() {
		print("Hello humam! I am a board covered with semiconductors and other such "
		+ "electronic compoment"
		+ "What is your name?");
		user = input.nextLine();
		print("Awesome? I will call you" +user + " until you terminate me.");
	}

	public static void talkForever(){
		while(true){
			promptInput();
		}
	}
	
	public static void promptInput() {
		print("Try inputing a String!");
		String userInput = input.nextLine();
		print("You type: " +userInput);
	}

	public static void print(String s) {
		lineCount++;
		System.out.println("Line #" + lineCount +s);
		
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
