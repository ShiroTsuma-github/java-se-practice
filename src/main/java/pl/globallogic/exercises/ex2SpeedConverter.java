package pl.globallogic.exercises;

public class ex2SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour)
    {
        if(kilometersPerHour < 0) return -1;
        return Math.round(kilometersPerHour / 1.609344);
    }
    public static void printConversion(double kilometersPerHour)
    {
        long result = toMilesPerHour(kilometersPerHour);
        if(result < 1)
        {
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kilometersPerHour + "km/h = "+ result + " mi/h");
    }
    public static void main(String[] args)
    {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
}
