package pl.globallogic.exercises;

public class ex24NumberToWords {

    public static int reverse(int number) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(number));
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        return Integer.toString(number).length();
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int dCount = getDigitCount(number);
        int rNumber = reverse(number);
        int rdCount = getDigitCount(rNumber);
        int digit;
        while (rNumber > 0) {
            digit = rNumber % 10;
            switch (digit) {
                case 0 -> System.out.print("Zero");
                case 1 -> System.out.print("One");
                case 2 -> System.out.print("Two");
                case 3 -> System.out.print("Three");
                case 4 -> System.out.print("Four");
                case 5 -> System.out.print("Five");
                case 6 -> System.out.print("Six");
                case 7 -> System.out.print("Seven");
                case 8 -> System.out.print("Eight");
                default -> System.out.print("Nine");
            }
            System.out.print(" ");
            rNumber /= 10;
        }

        if (dCount > rdCount) {
            for (int i = 0; i < dCount - rdCount; i++) {
                System.out.print("Zero ");
            }
        }
        System.out.println();
    }



    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

}
