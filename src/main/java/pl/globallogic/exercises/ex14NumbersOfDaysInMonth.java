package pl.globallogic.exercises;

public class ex14NumbersOfDaysInMonth {
    public static boolean isLeapYear(int year)
    {
        if(year < 1 || year > 9999) return false;
        if(year % 4 == 0 )
        {
            if(year % 100 == 0)
            {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
    public static int getDaysInMonth(int month, int year)
    {
        if(year < 1 || year > 9999) return -1;
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> -1;
        };
    }
    public static void main(String[] args)
    {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }
}
