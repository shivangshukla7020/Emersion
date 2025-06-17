import java.util.*;
public class DigitMaxFinderLimited {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), maxDigit = 10, index = 0;
        int[] digits = new int[maxDigit];
        while (number != 0 && index < maxDigit) {
            digits[index++] = number % 10;
            number /= 10;
        }
        int max = 0, second = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > max) {
                second = max;
                max = digits[i];
            } else if (digits[i] > second && digits[i] != max) {
                second = digits[i];
            }
        }
        System.out.println("Max: " + max + ", Second Max: " + second);
    }
}