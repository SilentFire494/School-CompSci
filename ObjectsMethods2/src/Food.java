public class Food {

	
	private String name;
	private int protein;
	private int carbs;
	private int fat;
	
	
	public Food( String name, int prot, int carbs, int fat )
	{
		this.name = name;
		this.protein = prot;
		this.carbs = carbs;
		this.fat = fat;
	}
	
	
	
	/** Returns the name of the Food item */
	public String getName()
	{
		return	this.name;
	}
	
	/** Returns the amount of protein in the Food */
	public int getProtein()
	{
		return	this.protein;
	}
	
	/** Returns the amount of carbohydrates in the Food */
	public int getCarbs()
	{
		return	this.carbs;
	}
	
	/** Returns the amount of fat in the Food */
	public int getFat()
	{
		return	this.fat;
	}
	
}
