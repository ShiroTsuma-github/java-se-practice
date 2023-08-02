package pl.globallogic.exercises;

public class ex3MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        if(kiloBytes < 0)
        {
            System.out.println("Invalid Value");
            return;
        }
        System.out.print(kiloBytes + " KB = ");
        System.out.print((long)(kiloBytes / 1024) + " MB and ");
        System.out.print(kiloBytes - 1024 * (long)(kiloBytes / 1024) + " KB\n");
    }
    public static void main(String[] args)
    {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
}
