package pl.globallogic.exercises;

public class ex21AllFactors {
    public static void printFactors(int a) {
        if (a < 1) System.out.println("Invalid Value");
        else {
            for (int i = 1; i <= (int)a/2; i++) {
                if (a % i == 0) System.out.print(i + " ");
            }
            System.out.print(a+"\n");
        }
    }
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
}
