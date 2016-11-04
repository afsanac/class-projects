package caveExplorer;

public class Minesweeper {	
	public static void main(String[] args){
		boolean[][] mines = new boolean[6][6];
		createMines(mines, 10);
		String[][] field = new String[mines.length][mines[0].length];
		matchValues(field, mines);
		printPic(field);


	}
	
	private static void matchValues(String[][] field, boolean[][] mines) {
		for(int row = 0; row < field.length; row++){
			for(int col = 0; col < field[0].length; col++){
				if(mines[row][col])field[row][col] = "X";
				else{
					field[row][col] = countAdjacent(mines, row, col);
				}
			}
		}
	}

	private static String countAdjacent(boolean[][] mines, int r, int c) {
		//r and c represent coordinates of elements
		//we are providing a string for
		int count = 0;
		//loop through row above to row below
//		for(int row = r-1; row <= r+1; row++){
//			//loop through col left to col right
//			for(int col = c-1; col <= c+1; col++){
//				//exclude this element when counting
//				if(row !=r && col !=c){
//					if(row >= 0 && row < mines.length && col >= 0 && col < mines[row].length){
//						
//					}
//				}
//			}
//		for(int row = 0; row < mines.length; row++){
//			for(int col = 0; col < mines[row].length; col++){
//				if(Math.abs(row - r) + Math.abs(col - c) == 1 && mines[row][col]){
//					// check if true
//					count++;
//				}
//			}
//		}
		// this method is helpful when u want to be
		//very specific
		//above
		count += validAndTrue(mines, r-1, c);
		count += validAndTrue(mines, r+1, c);
		count += validAndTrue(mines, r, c+1);
		count += validAndTrue(mines, r, c-1);
		
		return count +"";
	}

	private static int validAndTrue(boolean[][] mines, int i, int j) {
		//AFTER checking validity
		if(i >= 0 && i < mines.length && j>=0 && j < mines[0].length && mines[i][j]){
			return 1;
		}
		else return 0;
	}

	private static void createMines(boolean[][] mines, int numberOfMines) {
		while(numberOfMines > 0){
			int row = (int)(Math.random()*mines.length);
			int col = (int)(Math.random()*mines[0].length);
			if(!mines[row][col]){
				mines[row][col] = true;
				numberOfMines --;
			}
		}
		
	}

	private static void printPic(String[][] pic) {
		for(int row = 0; row <pic[row].length; row++){
			for(int col = 0; col < pic[row].length; col++){
				System.out.print(pic[row][col]);
			}
			System.out.println();
		
	}
}
}

