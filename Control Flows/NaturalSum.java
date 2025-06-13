import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a natural number.");
            return;
        }

        int loopSum = 0;
        for (int i = 1; i <= n; i++) {
            loopSum += i;
        }

        int formulaSum = n * (n + 1) / 2;

        System.out.println("Sum using loop: " + loopSum);
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Are both sums equal? " + (loopSum == formulaSum));
    }
}
