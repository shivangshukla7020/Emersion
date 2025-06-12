import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.printf("The quotient is %d and the remainder is %d\n", quotient, remainder);
    }
}
