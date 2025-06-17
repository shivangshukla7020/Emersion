import java.util.*;
public class Q27 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}