import java.util.*;
public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), len = 0, temp = number;
        while (temp > 0) { temp /= 10; len++; }
        int[] digits = new int[len];
        for (int i = 0; number > 0; i++) {
            digits[i] = number % 10;
            number /= 10;
        }
        for (int d : digits) System.out.print(d + " ");
    }
}