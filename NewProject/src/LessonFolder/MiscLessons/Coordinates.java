package LessonFolder.MiscLessons;



public class Coordinates {

	private int x;
    private int y;
    
    
    public void Coordinate(int initX, int initY) {
	
    	x = initX;
	   	y = initY;
    }

    /**
     * Get the X coordinate of the Coordinate.
     *
     * @return the X coordinate.
     */
    public int getX() {
	return x;
    }

    /**
     * Get the Y coordinate of the Coordinate.
     *
     * @return the Y coordinate.
     */
    public int getY() {
	return y;
    }
    
    /** 
     * Translate the position of the Coordinate by 
     * a specified amount.
     *
     * @param dx the offset in the X direction.
     * @param dy the offset in the Y direction.
     */
    public void translate(int dx, int dy) {
	x = x + dx;
	y = y + dy;
    }

    /**
     * Generate a String representation of the Coordinate.
     *
     * @return a String representation of the Coordinate.
     */
    public String toString() {
	return "(" + x + "," + y + ")";
    }
}

	


