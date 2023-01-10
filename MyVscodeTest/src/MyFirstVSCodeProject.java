import java.util.Scanner;

public class MyFirstVSCodeProject 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a movie: ");
		String movie = input.nextLine();

		System.out.print("Enter a rating: ");
		int rating = input.nextInt();

		displayMovieRating( movie, rating);
		input.close();
	}
	
	public static void displayMovieRating( String movie, int rating)
	{
		// "Avatar: *****";
		String stars = "";
		for ( int i = 0; i < rating; i++)
			stars += "*";
		
		System.out.println( movie + ": " + stars);
	}
	
	
}