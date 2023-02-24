import java.util.Scanner;

public class MazeInput {

	
	
	/** Scanner used for the input (needs import) */
	private Scanner input;
	
	
	
	/**
	 * 	Creates the Maze Input and sets up its Scanner
	 */
	public MazeInput()
	{
        input = new Scanner(System.in);

		
	}
	
	
	
	/**
	 * 	Handles the process for when the player chooses which Path to take from 
	 * 	the current Path. This method will display the necessary information to 
	 * 	the user (such as their option choices), ask the user to make that  
	 * 	choice, and then return the Maze Path associated with that choice from 
	 * 	the current Path. 
	 */
	public MazePath chooseNextPath( MazePath currentPath )
	{
            System.out.println(currentPath.getDescription());
            String choice = chooseOption(currentPath.getCorrectPath().getOption(), currentPath.getIncorrectPath().getOption());
            if (choice.equals(currentPath.getCorrectPath().getOption())) {
                return currentPath.getCorrectPath();
            } else {
                return currentPath.getIncorrectPath();
            }
	}
	
	/**
	 * 	Handles asking the player which of the two options they would like to 
	 * 	choose. This method should ONLY return when the player has picked one 
	 * 	of the two options, and should handle when the player inputs an 
	 * 	incorrect option choice.
	 */
	private String chooseOption( String optionA, String optionB )
	{

            System.out.println("Choose one of the following options:");
            System.out.println("1. " + optionA);
            System.out.println("2. " + optionB);
            String choice = input.nextLine();
            while (!choice.equals("1") && !choice.equals("2")) {
                System.out.println("Invalid choice. Please try again.");
                choice = input.nextLine();
            }
            if (choice.equals("1")) {
                return optionA;
            } else {
                return optionB;
            }
	}
	
}