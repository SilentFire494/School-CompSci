public class Book {

	
	private int[] chapterPages;
	private int totalPages;
	
	
	public Book()
	{
		int chapters = (int)(Math.random() * 11) + 6;
		this.chapterPages = new int[chapters];
		for (int i = 0; i < chapters; i++)
		{
			int pages = (int)(Math.random() * 18) + 12;
			this.chapterPages[i] = pages;
			this.totalPages += pages;
		}
	}
	
	
	/** Returns the total number of pages in this Book */
	public int getTotalPages()
	{
		return	this.totalPages;
	}
	
	/** Returns the total number of chapters in this Book */
	public int getTotalChapters()
	{
		return	this.chapterPages.length;
	}
	
	/** 
	 * 	Returns the total number of pages in the given chapter. If the 
	 * 	chapter does not exist in this book, this method returns -1. 
	 */
	public int getPagesInChapter( int chapter )
	{
		// Adjust for zero as first index
		int index = chapter - 1;
		if ( index < 0 || index >= this.chapterPages.length )
			return -1;
		
		return this.chapterPages[index];
	}
	
}
