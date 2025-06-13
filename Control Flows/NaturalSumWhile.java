import java.util.Scanner;

public class NaturalSumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter a natural number.");
            return;
        }

        int sum = 0, i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }

        int formulaSum = n * (n + 1) / 2;

        System.out.println("Sum using while loop: " + sum);
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Are both sums equal? " + (sum == formulaSum));
    }
}
