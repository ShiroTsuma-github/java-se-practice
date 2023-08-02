package pl.globallogic.exercises;

public class ex16NumberPalindrome {
    public static boolean isPalindrome(int number)
    {
        String strNumber = Integer.toString(Math.abs(number));
        StringBuilder sb = new StringBuilder();
        sb.append(strNumber);
        sb.reverse();
        return strNumber.contentEquals(sb);
    }
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
}
