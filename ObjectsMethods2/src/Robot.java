public class Robot {

	
	private Location loc;
	
	
	public Robot( Location startLoc )
	{
		this.loc = startLoc;
	}
	
	
	/** 
	 * 	Moves the Robot's Location up one full step, by 
	 * 	adding 1 to its y-coordinate.
	 */
	public void moveUp()
	{
		int x = this.loc.getX();
		int y = this.loc.getY();
		
		this.loc = new Location( x, y + 1 );
	}
	
	/** 
	 * 	Moves the Robot's Location down one full step, by 
	 * 	subtracting 1 from its y-coordinate.
	 */
	public void moveDown()
	{
		int x = this.loc.getX();
		int y = this.loc.getY();
		
		this.loc = new Location( x, y - 1 );
	}
	
	/** 
	 * 	Moves the Robot's Location to the right one full  
	 * 	step, by adding 1 to its x-coordinate.
	 */
	public void moveRight()
	{
		int x = this.loc.getX();
		int y = this.loc.getY();
		
		this.loc = new Location( x + 1, y );
	}
	
	/** 
	 * 	Moves the Robot's Location to the left one full  
	 * 	step, by subtracting 1 from its x-coordinate.
	 */
	public void moveLeft()
	{
		int x = this.loc.getX();
		int y = this.loc.getY();
		
		this.loc = new Location( x - 1, y );
	}
	
	/** Returns the Robot's current Location */
	public Location getLocation()
	{
		return	this.loc;
	}
	
}