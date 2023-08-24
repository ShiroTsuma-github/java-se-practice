package pl.globallogic.exercises;

public class ex43ReverseArray {

    public static void reverse(int[] array) {
        int temp;
        for(int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        printArray(array, "Reversed array:");
    }

    public static void printArray(int[] array, String message) {
        System.out.print(message + " ");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = ex41SortedArray.getIntegers(5);
        printArray(array, "Array:");
        reverse(array);
    }
}
