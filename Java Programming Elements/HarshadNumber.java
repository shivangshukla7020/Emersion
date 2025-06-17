import java.util.*;
public class HarshadNumber {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt(), n = num, sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(num % sum == 0 ? "Harshad Number" : "Not a Harshad Number");
    }
}
