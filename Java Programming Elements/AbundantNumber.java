import java.util.*;
public class AbundantNumber {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt(), sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        System.out.println(sum > num ? "Abundant Number" : "Not an Abundant Number");
    }
}
