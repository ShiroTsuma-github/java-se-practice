package pl.globallogic.exercises;

public class ex18EvenDigitSum {
    public static boolean isEven(int number)
    {
        return  number % 2 == 0;
    }
    public static int getEvenDigitSum(int number)
    {
        if(number < 0) return -1;
        int sum = 0;
        while(number > 0)
        {
            int digit = number % 10;
            if(isEven(digit)) sum += digit;
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
}
