import java.util.*;
public class OddEvenSplitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Invalid input");
            return;
        }
        int[] evens = new int[num / 2 + 1], odds = new int[num / 2 + 1];
        int ei = 0, oi = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) evens[ei++] = i;
            else odds[oi++] = i;
        }
        System.out.println("Even:");
        for (int i = 0; i < ei; i++) System.out.print(evens[i] + " ");
        System.out.println("\nOdd:");
        for (int i = 0; i < oi; i++) System.out.print(odds[i] + " ");
    }
}