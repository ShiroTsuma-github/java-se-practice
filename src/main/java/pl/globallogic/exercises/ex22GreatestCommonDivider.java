package pl.globallogic.exercises;

public class ex22GreatestCommonDivider {

    public static int greatestCommonDivider(int a, int b)
    {
        if (b == 0) return a;
        return greatestCommonDivider(b, Math.abs(a - b));

    }
    public static int getGreatestCommonDivisor(int a, int b) {
        if (a < 10 || b < 10) return -1;
        return greatestCommonDivider(a, b);
    }
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }
}
