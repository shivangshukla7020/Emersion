import java.util.*;
public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble(); int y = sc.nextInt();
        System.out.println(y > 5 ? s * 0.05 : 0);
    }
}