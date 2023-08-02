package pl.globallogic.exercises;

public class ex15SumOdd {
    public static boolean isOdd(int number)
    {
        if(number < 0) return false;
        return number % 2 != 0;
    }
    public static long sumOdd(int start, int end)
    {
        if(end < start || start < 0) return -1;
        long sum = 0;
        for(int i = start; i <= end; i++)
        {
            sum += isOdd(i) ? i: 0;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }
}
