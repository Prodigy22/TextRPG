package com.textrpg.environment;

public class Tile {
	
	private char icon;
	private String description;
	private TileType type;
	private boolean hasBeenVisited = false;
	private boolean isOccupied = false;
	private boolean isMovable;
	
	public Tile(TileType type)
	{	
		setType(type);							// set icon of tile
		switch (type) {							// initialize variables based on type of tile
			case Grasslands:
				setIcon(type);
				setDescription(type);
				setMovable(type);
				break;
			case Water:
				setIcon(type);
				setDescription(type);
				setMovable(type);
				break;
			case Mountainous:
				setIcon(type);
				setDescription(type);
				setMovable(type);
				break;
			default:
				System.out.println("Tile does not have a proper tile-type.");
				break;
		}
	}
	
	private void setIcon(TileType type) {
		if (type == TileType.Grasslands) {
			icon = 'G';
		} else if (type == TileType.Water) {
			icon = 'W';
		} else if (type == TileType.Mountainous) {
			icon = 'M';
		}
	}
	
	private void setDescription(TileType tile) {
		if (type == TileType.Grasslands) {
			description = "\"You look around and notice the lands around you are lush with green rolling hills as far as the eyes can see.\"" + "\n" +
					"\"There seems to be no one around.\"";
		} else if (type == TileType.Water) {
			description = "\"You approach a body of water too deep to swim across or enter.\"" + "\n" +
					"\"There seems to be no one close by.\"";
		} else if (type == TileType.Mountainous) {
			description = "\"You raise your head as a towering colossus of rock and slate spears the skyline, making the area impassable.\"" + "\n" +
					"\"This place looks to be desolate.\"";
		}
	}
	
	public void setType(TileType type) {
		this.type = type;
	}
	
	private void setMovable(TileType tile) {
		if ((type == TileType.Water) || (type == TileType.Mountainous)) {
			isMovable = false;
		} else if (type == TileType.Grasslands) {
			isMovable = true;
		}
	}
	
	public void printTile() {
		System.out.println("Icon: " + "\'" + icon + "\'" + "\n" +
							"Description: " + description + "\n" +
							"Type: " + type + "\n" +
							"isMovable? " + isMovable + "\n" +
							"isOccupied? " + isOccupied);
	}
	
	public char getIcon() {
		return icon;
	}
}
