import java.util.*;
public class DigitCounter {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt(), count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println("Digits: " + count);
    }
}
