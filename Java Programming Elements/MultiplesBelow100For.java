import java.util.*;
public class Q28 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if (n <= 0 || n >= 100) return;
        for (int i = 1; i < 100; i++) if (i % n == 0) System.out.println(i);
    }
}