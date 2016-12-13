package arrays;

import java.util.Scanner;

public class ConnectFour {

	public static void main(String[] args) {
		String[][] board = new String[8][13];
		Scanner in = new Scanner(System.in);
		makeBoard(board);
		dropPiece(board);
		printPic(board);
		
		
		
		
//		pic = new String[5][5];
//		for(int row = 0; row < arr2D.length; row++){
//			for(int col = 0; col < arr2D[row].length; col++){
//				arr2D[row][col] = "("+row+", "+col+")";
//			}
//		}

}
	
private static void dropPiece(String[][] board) {
		System.out.println("Which column would you like to drop your piece in?"
				+ "(Please indicate a number between 0 and 5)");
		
		
	}

private static void makeBoard(String[][] board) {
	for(int num = 0; num < (board[0].length)/2; num++){
		board[0][num] = " "+num;
		
	}
	
	for(int num = 6; num < (board[0].length); num++){
		board[0][num] = "";
		
	}
	
	for(int row = 1; row < board.length; row++){
		for(int col = 0; col < board[0].length; col++){
			if(col % 2 == 0){
				board[row][col] = "|";
			}else{
				board[row][col] = " ";
			}
				
		}
	}

}
public static void printPic(String[][] pic){
	for(String[] row : pic){
		for(String col : row){
			System.out.print(col);
		}
		System.out.println();
	}
}
}