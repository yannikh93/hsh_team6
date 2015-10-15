package main;

public class Room {

	int sizeX = 5;
	int sizeY = 5;
	
	int posX = 0;
	int posY = 0;
		
	public Room (int horizontalSize, int verticalSize) {
		
		sizeX = horizontalSize;
		sizeY = verticalSize;
		
	
	}
	
	public void setPosition(int x, int y) {
		
		posX = x;
		posY = y;
		
	}
	
}
