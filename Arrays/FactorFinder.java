import java.util.*;
public class FactorFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), maxFactor = 10, index = 0;
        int[] factors = new int[maxFactor];
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, index);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }
        for (int i = 0; i < index; i++) System.out.println(factors[i]);
    }
}