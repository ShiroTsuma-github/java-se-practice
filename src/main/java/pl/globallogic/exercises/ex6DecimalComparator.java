package pl.globallogic.exercises;

public class ex6DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double dig1, double dig2)
    {
        return (long) (dig1 * 1000) == (long) (dig2 * 1000);
    }
    public static void main(String[] args)
    {
    System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
    System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
    System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
