public class MazePath {

	
	/** Describes this Path in the game and any useful information about the story */
	private String description;
	/** Option choice that the player must make to choose this Path in the game */
	private String option;
	
	/** The next Path to take AFTER this one when the user has made a correct decision */
	private MazePath correctPath;
	/** The next Path to take when the user has chosen poorly */
	private MazePath incorrectPath;
	
	/**
	 * 	Creates a new Maze Path with the option used to select this Path, and a 
	 * 	description of this Path in the game. 
	 */
    public MazePath( String option, String description )
    {
        this.option = option;
        this.description = description;
    }
	
	
	/**
	 * 	Returns the description of this Path in the game.
	 */
	public String getDescription()
	{
		/** 
		 * 	
		 * 	(1) Returns the description
		 * 	
		 */	

            return this.description;
	}
	
	/**
	 * 	Returns the option choice that must be selected by the player in game in 
	 * 	order to take this pathway.
	 */
	public String getOption()
	{
		/** 
		 * 	
		 * 	(1) Returns the option
		 * 	
		 */	

            return this.option;
	}
	
	/**
	 * 	Returns the next Maze Path that is considered to be the correct path to take 
	 * 	after this one in the game.
	 */
	public MazePath getCorrectPath()
	{
		/** 
		 * 	
		 * 	(1) Returns the correct next Path
		 * 	
		 */	

            return this.correctPath;
	}
	
	/**
	 * 	Sets the next Maze Path that is considered to be the correct path to take 
	 * 	after this one in the game.
	 */
	public void setCorrectPath( MazePath path )
	{
		/** 
		 * 	
		 * 	(1) Set the correct next Path
		 * 	
		 */	

            this.correctPath = path;
	}

	/**
	 * 	Returns the next Maze Path that is considered to be the incorrect path 
	 * 	to take after this one in the game.
	 */
	public MazePath getIncorrectPath()
	{
		/** 
		 * 	
		 * 	(1) Return the incorrect next path
		 * 	
		 */	
            
            return this.incorrectPath;
	}
	
	/**
	 * 	Returns the next Maze Path that is considered to be the incorrect path 
	 * 	to take after this one in the game.
	 */
	public void setIncorrectPath( MazePath path )
	{
		/** 
		 * 	
		 * 	(1) Set the incorrect next path
		 * 	
         */

            this.incorrectPath = path;
	}
	
	/**
	 * 	Returns the option choice of the next Maze Path after this one that is 
	 * 	considered to be the correct path to take. If there is NOT a next correct 
	 * 	Path after this one, then this method returns null.
	 */
	public String getCorrectOptionChoice()
	{
		/** 
		 * 	
		 * 	(1) Return the option choice for the next correct path, or null 
		 * 		if there is not a next path
		 * 	
		 */	

            return correctPath.getOption();
	}
	
	/**
	 * 	Returns the option choice of the next Maze Path after this one that is 
	 * 	considered to be the incorrect path to take. If there is NOT a next 
	 * 	incorrect Path after this one, then this method returns null.
	 */
	public String getIncorrectOptionChoice()
	{
		/** 
		 * 	
		 * 	(1) Return the option choice for the next incorrect path, or null 
		 * 		if there is not a next path
		 * 	
		 */	



            return incorrectPath.getOption();
	}
	
	/**
	 * 	Returns the next Maze Path AFTER this one that is associated with the given 
	 * 	option choice. If there is NOT a next Path after this one with the given 
	 * 	option then this method returns null.
	 */
	public MazePath getNextPath( String option )
	{
		/** 
		 * 	
		 * 	(1) Return the next Maze Path that the given option matches.
		 * 	(2) If it does not match either of the mazes next paths, then 
		 * 		this method returns null
		 * 	(3) If there is NOT any next paths to check, then this method 
		 * 		returns null.
		 * 	
		 */	

            if (option.equals(correctPath.getOption()))
            {
                return this.correctPath;
            }
            else if (option.equals(incorrectPath.getOption()))
            {
                return this.incorrectPath;
            }
            else
            {
                return null;
            }
	}
	
	/**
	 * 	Returns true if this Path is considered to be the END of a pathway. A Path 
	 * 	is an END Path if there are not other Paths connected to it.
	 */
	public boolean isEndPath()
	{
		/**
		 * 	
		 * 	(1) Return whether or not this Path is the end, meaning it does not 
		 * 		have any attached Paths
		 * 	
		 */	

         return (this.correctPath == null && this.incorrectPath == null);
	}
	
	/**
	 * 	Creates a String that can be used to display this Maze Path in the game when 
	 * 	printed. The String will include the description, followed by the two option 
	 * 	choices for correct and incorrect Paths after this one, if those Paths exist. 
	 * 	If this Path is an END Path, then this method will not include any possible 
	 * 	option choices.
	 */
	@Override public String toString()
	{
            String str = this.description + "\n";
            if (this.correctPath != null)
            {
                str += "Correct: " + correctPath.getOption() + "\n";
            }
            if (this.incorrectPath != null)
            {
                str += "Incorrect: " + incorrectPath.getOption() + "\n";
            }
            return str;
	}
	
}