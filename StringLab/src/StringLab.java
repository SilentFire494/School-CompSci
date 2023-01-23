public class StringLab 
{
    public static int countChars(String s, char c)
    {
        int count = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == c)
            {
                count++;
            }
        }
        return count;
    }

    public static int countCaps(String s)
    {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (Character.isUpperCase(s.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }

    public static String reverse(String s)
    {
        if ( !s.contains( " ") )
        	{
                return s;
            }
        	
        String firstWord = s.substring(0, s.indexOf(" "));	//start to first space
        String secondWord = s.substring(s.indexOf(" ") + 1); //space to the end
        return reverse(secondWord) + " " + reverse(firstWord);
    }

    public static boolean isPalindrome(String s)
    {
        s = s.toLowerCase().replaceAll(" ", "");
        if (s.equals(reverse(s)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static String removeAll(String s, char c)
    {
        String newString = "";
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) != c)
            {
                newString += s.charAt(i);
            }
        }
        return newString;
    }
}
