package pl.globallogic.exercises;

public class ex12PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature)
    {
        int max = 35;
        if(summer) max = 45;
        return temperature > 25 && temperature <= max;
    }
    public static void main(String[] args)
    {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }
}
