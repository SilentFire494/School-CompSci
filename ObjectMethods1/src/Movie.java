public class Movie {

	
	private String title;
	private int rating;
	
	
	public Movie( String title, int rating )
	{
		this.title = title;
		this.rating = rating;
	}
	
	
	/** Returns the title of the Movie */
	public String getTitle()
	{
		return 	this.title;
	}

	/** Returns the rating (1 to 5 stars) of the Movie */
	public int getRating()
	{
		return 	this.rating;
	}
	
}
