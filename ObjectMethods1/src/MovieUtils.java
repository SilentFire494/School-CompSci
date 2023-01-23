public class MovieUtils 
{
    public static Movie compareMovies( Movie movie1, Movie movie2 )
    {
        if ( movie1.getRating() > movie2.getRating() )
        {
            return movie1;
        }
        else if ( movie1.getRating() < movie2.getRating() )
        {
            return movie2;
        }
        else
        {
            return null;
        }
    }

    public static void displayMovie( Movie movie )
    {
        String stars = "";
		for ( int i = 0; i < movie.getRating(); i++)
			stars += "*";
		
		System.out.println( movie.getTitle() + ": " + stars);
    }
}
