import java.util.*;
public class DigitMaxFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), maxDigit = 10, index = 0;
        int[] digits = new int[maxDigit];
        while (number != 0) {
            if (index == maxDigit) {
                maxDigit *= 2;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, index);
                digits = temp;
            }
            digits[index++] = number % 10;
            number /= 10;
        }
        int max = 0, secondMax = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > max) {
                secondMax = max;
                max = digits[i];
            } else if (digits[i] > secondMax && digits[i] != max) {
                secondMax = digits[i];
            }
        }
        System.out.println("Max: " + max + ", Second Max: " + secondMax);
    }
}