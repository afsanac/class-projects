package caveExplorer;

public class Practice {
	public static void main(String[] args){
		String[][] pic = new String[10][25];
		for(int row = 0; row <pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				(pic[row][col]) = "";
			}
		}
		
		pic[1][2] = "0";
		pic[0][2] = "|";
		pic[2][2] = "|";
		pic[1][1] = "-";
		pic[1][3] = "-";
		pic[0][1] = "\\";
		pic[2][3] = "\\";
		pic[0][3] = "/";
		pic[2][1] = "/";
		
		
		for(int row = 5; row <pic.length; row++){
			for(int col = 0; col < pic[row].length; col++)
				pic[row][col] = "W";
		}
		for(int row = 8; row < pic.length; row++){
			for(int col = 0; col < pic [row].length; col++){
				pic[row][col] = "/\\/\\";
			}
		}
		
		//top & bottom row is "_"
		for(int col = 0; col < pic[0].length; col++){
			pic[0][col] = "_";
			pic[pic.length-1][col] = "_";
		}
		//left and right col is "|"
		
		for(int row = 1; row < pic.length; col++){
			pic[0][col]
		}
		printPic(pic);
	}
	
	public static void printPic(String[][] pic){
		for(int row = 0; row <pic[row].length; row++){
			for(int col = 0; col < pic[row].length; col++){
				System.out.print(pic[row][col]);
			}
			System.out.println();
		}
	}
}
