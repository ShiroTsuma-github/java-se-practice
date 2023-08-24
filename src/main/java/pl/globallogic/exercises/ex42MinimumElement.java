package pl.globallogic.exercises;

import java.util.Scanner;

public class ex42MinimumElement {

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count:");
        return scanner.nextInt();
    }

    public static int[] readElements(int count) {
        int[] array = new int[count];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + count + " integer values.\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int count = readInteger();
        int[] array = readElements(count);
        System.out.println("Minimum value is " + findMin(array));
    }
}
