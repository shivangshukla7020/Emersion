import java.util.*;
public class Q29 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(), i = 99;
        if (n <= 0 || n >= 100) return;
        while (i > 1) {
            if (i % n == 0) System.out.println(i);
            i--;
        }
    }
}