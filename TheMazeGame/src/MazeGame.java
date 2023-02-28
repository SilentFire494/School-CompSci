public class MazeGame {

	
	/** Starting path for the game */
	private MazePath startPath;
	
	/** Ending path the player is trying to reach */
	private MazePath goalPath;
	
	/** Input used for the game */
	private MazeInput input;
	
	
	
	
	/**
	 * 	Creates a new Maze Game with all of the Pathways loaded, the start and 
	 *	end Paths set, and the game input setup.
	 */
	public MazeGame()
	{
        input = new MazeInput();
        loadMazePaths();
	}
	
	
	
	/**
	 * 	Handles the creation of all of the different Paths in the game including 
	 * 	their DESCRIPTIONS and ANSWERS. Then, this method connects all of them 
	 * 	together in the desired order, and sets the STARTING and GOAL Paths.
	 */
	private void loadMazePaths()
	{
        MazePath path1 = new MazePath("Left", "This is test description");
        MazePath path2 = new MazePath("Right", "This is test description2");
        MazePath path3 = new MazePath("Up", "This is test description3");
		MazePath path4 = new MazePath("Down", "This is test description4");

        path1.setCorrectPath(path2);
		path1.setIncorrectPath(path3);
        path2.setCorrectPath(path3);
		path2.setIncorrectPath(path4);
		path3.setCorrectPath(path1);
		path3.setIncorrectPath(path4);
		path4.setCorrectPath(path2);
		path4.setIncorrectPath(path1);



        startPath = path1;
        goalPath = path3;
	}
	
	public void play()
	{
        		/** 
		 * 	TODO: DELETE THESE INSTRUCTIONS AFTER COMPLETION. 
		 * 	
		 * 	(1) Display the intro to the game
		 * 	(2) Track the current Path the player is on, and continue through 
		 * 		the game until they have reached the end
		 * 	(3) Display the current path the player is on and use the input to  
		 * 		get the player's choice	
		 * 	(4) When the game ends, correctly determine if they have won or 
		 * 		lost
		 * 	
		 */

         displayIntro();
         MazePath currentPath = startPath;
         while (currentPath != goalPath)
		 {
			 currentPath = input.chooseNextPath(currentPath);
			 if (currentPath == goalPath)
			 {
				 displayWinner();
			 }
			 else if (currentPath == startPath)
			 {
				 displayGameOver();
			 }
		 }
	}
	
	/**
	 * 	Handles displaying the intro and title of the game, and any instructions 
	 * 	you may need to give the player.
	 */
	private void displayIntro()
	{
        System.out.println("Welcome to the Maze Game!");
        System.out.println("You are trapped in a maze and must find your way out.");
	}
	
	/**
	 * 	Handles the end-game message(s) when the player wins the game.
	 */
	private void displayWinner()
	{
        System.out.println("You have won the game!");
	}
	
	/**
	 * 	Handles the end-game message(s) when the player has lost the game.
	 */
	private void displayGameOver()
	{
        System.out.println("You have lost the game!");
		// end the game
		
	}
	
}