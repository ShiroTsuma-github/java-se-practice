package pl.globallogic.exercises;

public class ex19SharedDigit {
    public static boolean hasSharedDigit(int a, int b)
    {
    if(a<10 || a>99 || b<10 || b>99) return false;
    return a % 10 == b % 10 || a % 10 == b / 10 || a / 10 == b % 10 || a / 10 == b / 10;
    }
    public static void main(String[] args)
    {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
}
