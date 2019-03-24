package com.textrpg.environment;

public class Board {
	
	private final int width = 12;
	private final int height = 39;
	private int tileCount = 0;
	
	private Tile[][] gameBoard = new Tile[height][width];					// Tile[y][x]
	
	public Board() {
		
		// Fills the entire 2D array with Tile objects and sets their type
		for (int x = 0; x < height; x++) {
			for (int y = 0; y < width; y++) {
				gameBoard[x][y] = new Tile(TileType.Grasslands);
				tileCount++;
			}
		}
	}
	
	public void drawBoard() {
		drawBoundary();
		for (int x = 0; x < height; x++) {
				System.out.println();
			for (int y = 0; y < width; y++) {
				System.out.print("|" + gameBoard[x][y].getIcon());
				if (gameBoard[x][y].equals(gameBoard[x][width-1])) {
					System.out.print("|");
				}
			}
		}
		System.out.println();
		drawBoundary();
		System.out.println();
	}
	
	public int getTileCount() {
		return tileCount;
	}
	
	private void drawBoundary() {
		for (int i = 0; i < width; i++) {
			System.out.print("==");
		}
	}
}
