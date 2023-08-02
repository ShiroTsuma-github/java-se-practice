package pl.globallogic.exercises;

public class ex10MinutesConvert {
    public static void printYearsAndDays(long minutes)
    {

        int day = 1440;
        int year = 525960;
//        int year = 525600;
        if(minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        System.out.print(minutes+ " min = ");
        System.out.print((int)(minutes / year) + " y ");
        System.out.print((int)((minutes - year * (minutes / year)) / day) + " d \n");


    }
    public static void main(String[] args)
    {
//        NOTE: EVERY FOURTH YEAR IS LEAP AND HAS ADDITIONAL DAY,
//        SO WE CAN SAY THAT YEAR HAS 365.25 DAYS (525960 MIN)
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }
}
