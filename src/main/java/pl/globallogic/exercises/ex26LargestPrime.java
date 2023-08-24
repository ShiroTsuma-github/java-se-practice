package pl.globallogic.exercises;

public class ex26LargestPrime {

    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i < Math.sqrt(number)+1; i++)
            if (number % i == 0) return false;
        return true;
    }
    public static int getLargestPrime(int number) {
        if (number < 2) return -1;
        int largestPrime = 2;
        for (int i = number; i >= 2; i--) {
            if(number % 2 == 0 ) break;
            boolean prime = false;
            if(number % i == 0) prime = isPrime(i);
            if (prime) {
                largestPrime = i;
                break;
            }
            }
        return largestPrime;

    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }
}


