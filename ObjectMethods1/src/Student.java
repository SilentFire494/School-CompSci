public class Student 
{

	
	private String name;
	private double gpa;
	
	
	/** Creates a new Student with the specified name and gpa */
	public Student( String name, double gpa )
	{
		this.name = name;
		this.gpa = gpa;
	}
	
	
	/** Returns the name of this Student */
	public String getName()
	{
		return	this.name;
	}
	
	/** Returns the gpa of this Student */
	public double getGPA()
	{
		return	this.gpa;
	}
	
}