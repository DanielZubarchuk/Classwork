package caveExplorer;

import java.util.Scanner;

public class CaveExplorer {
	
	public static CaveRoomPd8[][] caves;
	public static Scanner in;
	public static CaveRoomPd8 currentRoom;
	public static InventoryNockles inventory;
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		caves = new CaveRoomPd8 [5][5];
		for(int row = 0; row < caves.length; row++){
			// numbers of rows in the cave
			for(int col = 0; col < caves[row].length; col++){
				caves[row][col] = new CaveRoomPd8("This room has coordinates " + row + ", " + col);
				
			}
		}

	}

}
