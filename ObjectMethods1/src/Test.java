public class Test
{
    public static void main( String[] args )
    {
        Student Maggy = new Student( "Maggy", 3.12 );
        Student John = new Student( "John", 3.45 );
        Book book1 = new Book();
        Book book2 = new Book();
        Movie movie1 = new Movie( "The Godfather", 5 );
        Movie movie2 = new Movie( "The Godfather Part II", 4 );
        Date date1 = new Date( 12, 24, 2021 );
        Date date2 = new Date( 12, 1, 2011 );
        Holiday holiday = new Holiday( "Christmas", date1 );
        Holiday holiday2 = new Holiday( "New Year's Day", date2 );

        Student sWinner = StudentUtils.compareStudents( Maggy, John );
        System.out.println( sWinner.getName());

        Book bWinner = BookUtils.compareBooks( book1, book2 );
        System.out.println("" + bWinner);

        Book mostPagesPerChapter = BookUtils.compareChapters( book1, book2 );
        System.out.println("" + mostPagesPerChapter);

        Movie mWinner = MovieUtils.compareMovies( movie1, movie2 );
        MovieUtils.displayMovie( mWinner );

        Date dWinner = DateUtils.compareDates( date1, date2 );
        DateUtils.displayDate( dWinner );


        //Display "Name of Holiday: Christmas on 12/24/2021"
        System.out.println( holiday.getName() + " on " + holiday.getDate().getMonth() + "/" + holiday.getDate().getDay() + "/" + holiday.getDate().getYear() );
        
        // compare the months of the two holidays
        boolean sameMonth = HolidayUtils.compareHolidayMonths( holiday, holiday2 );
        System.out.println( "Same month: " + sameMonth );
    }
}