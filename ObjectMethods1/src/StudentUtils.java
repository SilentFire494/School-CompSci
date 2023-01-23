public class StudentUtils 
{
    public static Student compareStudents( Student Maggy, Student John)
    {
        if ( Maggy.getGPA() > John.getGPA() )
        {
            return Maggy;
        }
        else if ( Maggy.getGPA() < John.getGPA() )
        {
            return John;
        }
        else
        {
            return null;
        }
    }
}
