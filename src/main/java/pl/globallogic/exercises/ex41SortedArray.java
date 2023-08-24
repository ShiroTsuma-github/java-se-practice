package pl.globallogic.exercises;

import java.util.Scanner;

public class ex41SortedArray {

    public static int[] getIntegers(int size) {
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + size + " integer values.\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        System.arraycopy(array, 0, sortedArray, 0, array.length);

        int swaps = 0;
        int temp;
        do {
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    swaps++;
                }
            }
        }while (swaps > 0);

        return sortedArray;
    }

    public static void main(String[] args) {
        int[] array = getIntegers(5);
        printArray(array);
        System.out.println("Sorted array:");
        int[] sortedArray = sortIntegers(array);
        printArray(sortedArray);
    }
}
