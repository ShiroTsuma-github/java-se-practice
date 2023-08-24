package pl.globallogic.exercises;
import java.util.Scanner;

public class ex27InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long avg = 0;
        while (true) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
            scanner.nextLine();
        }
        if (count > 0) {
            avg = Math.round((double) sum / count);
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
