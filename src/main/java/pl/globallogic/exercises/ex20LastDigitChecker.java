package pl.globallogic.exercises;

public class ex20LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (a <10 || a > 1000) return false;
        if (b <10 || b > 1000) return false;
        if(isValid(c)) return false;
        return (a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10);
    }
    public static boolean isValid(int a) {
        return (a >= 10 && a <= 1000);
    }
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }
}
