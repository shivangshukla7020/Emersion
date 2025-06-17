import java.util.*;
public class PrimeCheck {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        boolean isPrime = n > 1;
        for (int i = 2; i * i <= n && isPrime; i++) {
            if (n % i == 0) isPrime = false;
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}