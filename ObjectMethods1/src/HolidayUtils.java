public class HolidayUtils 
{
    public static boolean compareHolidayMonths( Holiday holiday1, Holiday holiday2 )
    {
        if ( holiday1.getDate().getMonth() == holiday2.getDate().getMonth() )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
