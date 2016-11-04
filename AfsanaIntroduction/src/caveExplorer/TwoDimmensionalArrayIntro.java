package caveExplorer;

import java.util.Scanner;

public class TwoDimmensionalArrayIntro {

	
	public static String[][] arr2D;
	public static int i;
	public static int j;
	public static Scanner in;
	
	
	public static void main(String[] args) {
		
		arr2D = new String[5][4];
		System.out.println("The height is "+arr2D.length);
		System.out.println("The width is "+arr2D[0].length);
		
		for(int row = 0; row < arr2D.length; row++){
			
			//populate with coordinates
			for(int col = 0; col < arr2D[row].length; col++){
				arr2D[row][col] = "("+row+", "+col+")";
			}
			
		}
		
		//print the 2D array
		//Every element in a 2D array IS itself an array,
		//so a for-each loop looks like this:
		for(String[] row : arr2D){
			System.out.println(Arrays.toString(row));
		}
		// start position
		i = 2;
		j = 3;
		in = new Scanner(System.in);
	}
	
	private static void startExploring(){
		while(true){
			printPic(pic);
			System.out.println("You are in room " + arr2D[i][j]);
			System.out.println("What do you want to do?");
			String input = in.nextLine();
			while(!isValid(input)){
				System.out.println("Please enter w, a, s, or d.");
				input = in.nextLine();
			}
			interpretInput(input.toLowerCase());
		}
	}

	private static void interpretInput(String input) {
		int iOrig = i;
		int jOrig = j;
		if(input.equals("w") && i > 0)i--;
		else if(input.equals("a") && j>0)j--;
		else if(input.equals("s") && i+1 < arr2D.length)i++;
		else if(input.equals("d") && j + 1 < arr2D[0].length)j++;
		if(iOrig == i && jOrig == j){
			System.out.println("Your are at the edge of the universe. You can move no farther ");
		}
		
	}

	private static boolean isValid(String input) {
		String lc = input.toLowerCase();
		String[] keys = {"w", "a", "s", "d"};
		for(String key:keys){
			if(key.equals(lc)){
				return true;
			}
		}
		return false;
	}

}
