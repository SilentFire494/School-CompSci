public class StringStuff
{
    public static String getFirstHalf(String firstHalf)
    {
        int half = firstHalf.length() / 2;
        firstHalf = firstHalf.substring(0, half);
        return firstHalf;
    }


public static String getSecondHalf(String secondHalf)
{
    int half = secondHalf.length() / 2;
    secondHalf = secondHalf.substring(half);
    return secondHalf;
}

public static String swapHalfs(String firstHalf, String secondHalf)
{
    firstHalf = getFirstHalf(firstHalf);
    secondHalf = getSecondHalf(secondHalf);
    return secondHalf + firstHalf;

}

}