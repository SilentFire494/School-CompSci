public class BookUtils 
{
    public static Book compareBooks( Book book1, Book book2 )
    {
        if ( book1.getTotalPages() > book2.getTotalPages() )
        {
            return book1;
        }
        else if ( book1.getTotalPages() < book2.getTotalPages() )
        {
            return book2;
        }
        else
        {
            return null;
        }
    }

    public static Book compareChapters( Book book1, Book book2 )
    {
        if (book1.getPagesInChapter(7) > book2.getPagesInChapter(4))
        {
            return book1;
        }
        else if (book1.getPagesInChapter(6) < book2.getPagesInChapter(3))
        {
            return book2;
        }
        else
        {
            return null;
        }

    }
}