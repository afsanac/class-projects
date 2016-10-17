package arrays;

public class ArraysAndArrayLists {
	
	public static void main (String[] args){
		int[] fiftyNumbers = new int[50];
		populate(fiftyNumbers);
		print(fiftyNumbers);
	}

	private static void print(int[] fiftyNumbers) {
		
			
	}

	private static void populate(int[] fiftyNumbers) {
		for ( int i = 0; i < fiftyNumbers.length; i++){
			double rand = Math.random();
			fiftyNumbers [i]  = (int) (rand * 12);
			}
	}
	
}
