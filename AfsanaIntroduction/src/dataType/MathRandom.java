package dataType;

import java.util.Random;

public class MathRandom {

	public static void main(String[] args) {
		
		int[]  results = new int[6];
		//same as
		//int[] results = (0,0,0,0,0,0)
		
		int totalRolls = 10000;
		
		for(int index = 0; index < totalRolls; index++){
			int roll = rollUnfairDie();
			System.out.println("die is " +roll);
			results[roll - 1]++;
			
		for(int i = 0; i < 6; i++){
			System.out.println((i + 1) + " was rolled " +results[i]/ totalRolls+ " times.");
		}
	}
	
	public static int rollFairDie(){
		//Random gen = new Random();
		//return gen.nextInt(6)+1;
		double rand = Math.random(); //random double (0,1)
		int roll = (int) (6 * rand); // [0,5] (this is what
		return roll + 1; //0 becomes 1, 5 becomes 6
	}
	
	public static int rollUnfairDie(){
		///returns numbers 1-6, but with uneven distribution
		
		double rand = Math.random();
		int roll = (int) (6 * rand);
		roll = roll + 1;
		if (roll == 2 || roll == 3 || roll == 4)
			rand = Math.random();
			roll = (int) (6 * rand);
			return roll + 1;
			
			
		}
		
	}
}
