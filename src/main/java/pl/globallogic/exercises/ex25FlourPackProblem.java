package pl.globallogic.exercises;

public class ex25FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0) return false;
        int bigCountWeight = 5;
        int smallCountWeight = 1;
        int left = goal;
        while (left >= 0) {
            if (left == 0) return true;
            if (left >= bigCountWeight && bigCount > 0) {
                bigCount--;
                left -= 5;
            } else if (smallCount > 0) {
                smallCount--;
                left--;
            } else return false;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }
}
