package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArraysIntro {
	
	public static Scanner in = new Scanner(System.in);
	static String[][] arr2D;
	static String[][] pic;
	static int starti;
	static int startj;
	static int treasurei;
	static int treasurej;
	
	
	public static void main(String[] args) {

		arr2D = new String[5][5];
		pic = new String[5][5];
//		for(int row = 0; row < arr2D.length; row++){
//			for(int col = 0; col < arr2D[row].length; col++){
//				arr2D[row][col] = "("+row+", "+col+")";
//			}
//		}
//		
//		starti = 2;
//		startj = 2;
//		treasurei = 4;
//		treasurej = 3;
//		
//		startExploring();
		
		int displacementRow = 1;
		int startRow = 0;
			while(startRow < pic.length){
				for (int col = 0; col < pic[0].length ; col++){
					pic[startRow][col] = "_";
					if (startRow+displacementRow < pic.length) pic[startRow+displacementRow][col] = "_";
				}

				startRow = startRow + displacementRow;
			}
			int startCol = 0;
			int displacementCol = 2;
			while (startCol < pic[0].length){
				for (int row = 0; row < pic.length; row++){
					pic[row][startCol] = "|";
					if (startCol+displacementCol < pic[0].length) pic[row][startCol+displacementCol] = "|";
				}
				startCol = startCol + displacementCol;
			}
			for (int j = 0; j < pic[0].length; j++){
				pic[0][j] = "_";
			}


//		arr2D = new String[5][5];
//		pic = new String[5][5];
//		for(int row = 0; row < arr2D.length; row++){
//			for(int col = 0; col < arr2D[row].length; col++){
//				arr2D[row][col] = "("+row+", "+col+")";
//			}
//		}
//		
//		starti = 2;
//		startj = 2;
//		treasurei = 4;
//		treasurej = 3;
//		
//		startExploring();
		
		createMap(5, 5);

	}
	
	private static void startExploring() {
		while(true){
			printPic(pic);
			System.out.println("You are in room" +arr2D[starti][startj]+".");
			
			if(starti == treasurei && startj == treasurej){
				break;
			}
			
			System.out.println("What do you want to do?");
			String input = in.nextLine();
			
			int[] newCoordinates = interpretInput(input);
			starti = newCoordinates[0];
			startj = newCoordinates[1];
		}
		
	}

	private static int[] interpretInput(String input) {
		while(!isValid(input)){
			System.out.println("Sorry, in this game, you can only use the WASD controls.");
			System.out.println("Tell me again what you would like to do.");
			input = in.nextLine();
		}
			
			int currenti = starti;
			int currentj = startj;
			input = input.toLowerCase();
			
			if(input.equals("w")){
				currenti --;
			}
			if(input.equals("s")){
				currenti ++;
			}
			if(input.equals("a")){
				currentj --;
			}
			if(input.equals("d")){
				currentj ++;
			}
			
			int[] newCoordinates = {starti, startj}; 
			
			if(currenti >= 0 && currenti < arr2D.length && currentj >= 0 && currentj < arr2D[0].length){
				newCoordinates[0] = currenti;
				newCoordinates[1] = currentj;
				
			}else{
				System.out.println("You have reached the end of the universe and you cant go any further in that direction.");
			}
		return newCoordinates;
	}		
		
	

	private static boolean isValid(String input) {
		String[] validKeys = {"w", "a", "s", "d"};
		for(String key: validKeys){
			if(input.toLowerCase().equals(key)){
				return true;
			}
		}
		return false;
	}

	private static void createMap(int row, int col){
		String[][] map = new String[row*3][col*3];
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				(map[i][j]) = " ";
			}
		}
		for(int j = 0; j < map[0].length; j++){
			for(int third = 0; third < row*3; third+=3){
				map[third][j] = "_";
			}
			//map[3][j] = "_";
			map[map.length-1][j] = "_";
		}

		for(int i = 1; i < map.length; i++){
			for(int third = 0; third < col*3; third+=3){
				map[i][third] = "|";
			}
			//map[i][0] = "|";
			map[i][map[0].length-1] = "|";
		}
		
		printPic(map);
	}
	
	public static void playMinesweeper(){
		boolean[][] mines = new boolean[6][6];
		plantMines(mines);
		String[][] field = createField(mines);
		printPic(field);
	}
	
	private static String[][] createField(boolean[][] mines) {
		String[][] field = new String[mines.length][mines[0].length];
		for(int row = 0; row < field.length; row++){
			for(int col = 0; col < field[row].length; col++){
				if(mines[row][col]){
					field[row][col] = "X";
				}else{
					field[row][col] = countNearby(mines, row, col);
				}
			}
		}
		return field;
	}

	private static String countNearby(boolean[][] mines, int row, int col) {
//		for(int r = row - 1; r <= row + 1; r++){
//			for(int c = col - 1; c <= col + 1; c++){
//				if(r >= 0 && r < mines.length && c >= 0 && c < mines[0].length){
//					
//				}
//			}
//		}
		
//		int count = 0;
//		for(int r = 0; r < mines.length; r++){
//			for(int c = 0; c < mines[r].length; c++){
//				if(Math.abs(r-row)+Math.abs(c-col) == 1 && mines[r][c]){
//					count++;
//				}
//			}
//		}
//		
//		return ""+count;
		
		int count = 0;
		count += isValidAndTrue(mines, row-1, col);
		count += isValidAndTrue(mines, row+1, col);
		count += isValidAndTrue(mines, row, col-1);
		count += isValidAndTrue(mines, row, col+1);
		return ""+count;
		
	}

	private static int isValidAndTrue(boolean[][] mines, int i, int j) {
		if(i >= 0 && i < mines.length && j >= 0 && j < mines[0].length && mines[i][j]){
			return 1;
		}
		return 0;
	}

	private static void plantMines(boolean[][] mines) {
		int numberOfMines = 10;
		while(numberOfMines > 0){
			int row = (int)(Math.random() * mines.length);
			int col = (int)(Math.random() * mines[0].length);
			
			if(!mines[row][col]){
				mines[row][col] = true;
				numberOfMines--;
			}
		}
	}

	public static void printPicExtra(){
		String[][] pic = new String[10][8];
		for(int row = 0; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = " ";
			}
		}
		
		//sun
		pic[0][3] = "|";
		pic[1][3] = "O";
		pic[2][3] = "|";
		pic[1][2] = "-";
		pic[1][4] = "-";		
		
		//grass
		for(int row = 5; row < pic.length; row++){
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = "w";
			}
		}
		
		//square around it
		for(int col = 0; col < pic[0].length; col++){
			pic[0][col] = "_";
			pic[pic.length - 1][col] = "_";
		}
		
		for(int row = 1; row < pic.length; row++){
			pic[row][0] = "|";
			pic[row][pic[0].length - 1] = "|";
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
	
	public static void intro(){
		String[] xox = {"x", "o", "x", "o", "x"};
		System.out.println(Arrays.toString(xox));
		
		String[][] arr2D = new String[5][4];
//		for(int row = 0; row < arr2D.length; row++){
//			String[] rowContent = new String[arr2D[0].length];
//		}
		
		for(int row = 0; row < arr2D.length; row++){
			for(int col = 0; col < arr2D[row].length; col++){
				arr2D[row][col] = "("+row+", "+col+")";
			}
		}
		
		for(String[] row : arr2D){
			System.out.println(Arrays.toString(row));
		}
	}

}
