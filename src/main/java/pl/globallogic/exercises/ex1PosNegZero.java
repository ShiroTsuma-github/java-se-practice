package pl.globallogic.exercises;


public class ex1PosNegZero {
    public static void checkNumber(int number)
    {
    if(number > 0) System.out.println("positive");
    else if(number < 0) System.out.println("negative");
    else System.out.println("zero");
    }

    public static void main(String[] args)
    {
        checkNumber(5);
        checkNumber(0);
        checkNumber(-5);
    }
}
