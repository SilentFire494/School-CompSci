public class Date {

	
	private int month;
	private int day;
	private int year;
	
	
	public Date( int m, int d, int y )
	{
		this.month = m;
		this.day = d;
		this.year = y;
	}
	
	
	/** Returns the number of the month for this Date */
	public int getMonth()
	{
		return	this.month;
	}
	
	/** Returns the number of the day for this Date */
	public int getDay()
	{
		return	this.day;
	}
	
	/** Returns the year for this Date */
	public int getYear()
	{
		return	this.year;
	}
	
}
