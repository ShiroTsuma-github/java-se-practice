package pl.globallogic.exercises;

public class ex8TeenNumberChecker {

    public static boolean hasTeen(int a, int b, int c)
    {
        if(a >= 13 && a<= 19) return true;
        if(b >= 13 && b<= 19) return true;
        if(c >= 13 && c<= 19) return true;
        return false;
    }
    public static void main(String[] args)
    {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }
}
