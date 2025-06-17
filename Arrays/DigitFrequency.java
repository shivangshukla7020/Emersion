import java.util.*;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] freq = new int[10];
        while (number > 0) {
            freq[number % 10]++;
            number /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) System.out.println(i + " = " + freq[i]);
        }
    }
}