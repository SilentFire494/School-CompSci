public class Holiday {

	
	private String name;
	private Date date;
	
	
	public Holiday( String name, Date date )
	{
		this.name = name;
		this.date = date;
	}
	
	
	/** Returns the name of this Holiday */
	public String getName()
	{
		return this.name;
	}
	
	/** Returns the Date of this Holiday */
	public Date getDate()
	{
		return this.date;
	}
		
}
