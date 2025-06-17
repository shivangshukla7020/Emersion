import java.util.*;
public class Q30 {
    public static void main(String[] args) {
        int y = new Scanner(System.in).nextInt();
        if (y < 1582) return;
        System.out.println((y % 4 == 0 && y % 100 != 0) || y % 400 == 0 ? "Leap Year" : "Not a Leap Year");
    }
}