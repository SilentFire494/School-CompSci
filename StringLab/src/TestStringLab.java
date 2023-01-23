public class TestStringLab
{
    public static void main(String[] args)
    {
        String s = "Never odd or even";
        char c = 'e';
        System.out.println("The number of " + c + "'s in " + s + " is " + StringLab.countChars(s, c));
        System.out.println("The number of capital letters in " + s + " is " + StringLab.countCaps(s));
        System.out.println("The reverse of " + s + " is " + StringLab.reverse(s));
        System.out.println("Is " + s + " a palindrome? " + StringLab.isPalindrome(s));
        System.out.println("The string " + s + " with all " + c + "'s removed is " + StringLab.removeAll(s, c));
    }
}