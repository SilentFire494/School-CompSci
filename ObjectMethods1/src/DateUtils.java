public class DateUtils 
{
    public static void displayDate( Date date )
    {
        System.out.println( date.getMonth() + "/" + date.getDay() + "/" + date.getYear() );
    }

    public static Date compareDates( Date date1, Date date2 )
    {
        if ( date1.getYear() > date2.getYear() ) 	return date1;
        else if ( date1.getYear() < date2.getYear() )	return date2;
       
        if ( date1.getMonth() > date2.getMonth() )  	return date1;
        else if ( date1.getMonth() < date2.getMonth() )	return date2;

        if ( date1.getDay() > date2.getDay() )		return date1;
        else if ( date1.getDay() < date2.getDay() )	return date2;
        
	return null;
    }
}
